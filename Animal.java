public class Animal {
    protected String name;
    protected int age;
    protected String sound;
    protected static int S;
    public Animal(String name, int age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    protected String makeSound(){
        return  " I say " + this.sound;
    }

    public String toString(){
        return " Animal " + name + " I am " + age;
    }

}
