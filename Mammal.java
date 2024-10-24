public class Mammal extends Animal{
    protected boolean isWarmBlooded;
    public Mammal(String name) {
        this(name, 0, "", false);
        this.name=name;
    }
    public Mammal(String name, int age, String sound, boolean isWarmBlooded) {
        super(name, age, sound);
        this.isWarmBlooded = isWarmBlooded;
    }

    public String toString(){
        return "Mammal Animal " + name + " i am " + age + " I am " + isWarmBlooded + " animal" + " I say " + sound;
    }
}
