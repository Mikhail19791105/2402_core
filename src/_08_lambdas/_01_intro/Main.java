package _08_lambdas._01_intro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var dogs = List.of(
                new Dog("Dog1", Breed.CHIH, 2),
                new Dog("Dog2", Breed.PUDEL, 1),
                new Dog("Dog3", Breed.CHIH, 3),
                new Dog("Dog4", Breed.GARBAGE, 4),
                new Dog("Dog5", Breed.PUDEL, 1),
                new Dog("Dog6", Breed.CHIH, 2)
        );
        System.out.println(getByBreedQuantity(dogs, Breed.CHIH));
        System.out.println(getByAgeQuantity(dogs, 1));
        System.out.println("___________");
        System.out.println(getByConditionQuantity(dogs, new BreedSearchable(), Breed.CHIH));
        System.out.println(getByConditionQuantity(dogs, new AgeSearchable(), 1));
        System.out.println("___________");
        System.out.println(getByConditionQuantity(dogs, new Searchable<Breed>() {
            @Override
            public boolean test(Dog dog, Breed value) {
                return dog.getBreed().equals(value);
            }
        }, Breed.CHIH));
        System.out.println(getByConditionQuantity(dogs, new Searchable<Integer>() {
            @Override
            public boolean test(Dog dog, Integer value) {
                return dog.getAge() == value;
            }
        }, 1));
        System.out.println("___________");
        System.out.println(getByConditionQuantity(dogs, (dog, value) -> dog.getBreed().equals(value), Breed.CHIH));
        System.out.println(getByConditionQuantity(dogs, (dog, value) -> dog.getAge() == value, 1));

    }

    private static int getByBreedQuantity(List<Dog> dogs,Breed breed) {
        int count = 0;
        for (Dog dog : dogs) {
            if (dog.getBreed().equals(breed)) {
                count++;
            }
        }
        return count;
    }

    private static int getByAgeQuantity(List<Dog> dogs, int age) {
        int count = 0;
        for (Dog dog : dogs) {
            if (dog.getAge() == age) {
                count++;
            }
        }
        return count;
    }

    private static <T> int getByConditionQuantity(List<Dog> dogs, Searchable<T> function, T value) {
        int counter = 0;
        for (Dog dog : dogs) {
            if (function.test(dog, value)) {
                counter++;
            }
        }
        return counter;
    }
}
