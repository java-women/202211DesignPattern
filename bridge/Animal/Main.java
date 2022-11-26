package bridge.Animal;

public class Main {

    public static void main(String... args) {
        Animal animal1 = new Animal(new DogImpl());
        Animal animal2 = new Animal(new CatImpl());

        ExcitedAnimal ea1 = new ExcitedAnimal(new DogImpl());
        ExcitedAnimal ea2 = new ExcitedAnimal(new CatImpl());

        ExcitedAnimal ea3 = new ExcitedAnimal(new DogImpl());

        // 実行
        System.out.println(animal1.bark());
        System.out.println(animal2.bark());

        System.out.println(ea1.excited(7));
        System.out.println(ea2.excited((2)));

        System.out.println(ea3.run());

    }
}
