package _08_lambdas._01_intro;

public class AgeSearchable implements  Searchable<Integer> {
    @Override
    public boolean test(Dog dog, Integer value) {
        return dog.getAge() == value;
    }
}
