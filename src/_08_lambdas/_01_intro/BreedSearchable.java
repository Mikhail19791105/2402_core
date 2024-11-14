package _08_lambdas._01_intro;

public class BreedSearchable implements Searchable<Breed> {
    @Override
    public boolean test(Dog dog, Breed value) {
        return dog.getBreed().equals(value);
    }
}
