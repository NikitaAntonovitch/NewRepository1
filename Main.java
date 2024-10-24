// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Mammal mammal = new Mammal("slon "); //, 5, " DY ", true);
        Bird bird = new Bird("golub", 8, " kaar ", true);
        Fish fish = new Fish("karp ", 20, " UP ", false);

        Animal animal = new Animal("zibra ", 5, " egago");
        System.out.println(animal.makeSound());

        Animal[] animalsArr = new Animal[]{mammal, bird, fish};
        for (int i = 0; i < animalsArr.length; i++){
            System.out.println(animalsArr[i].toString());// print all objects
        }
    }
}