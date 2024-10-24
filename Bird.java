public class Bird extends Animal{
    protected boolean canFly;
    public Bird(String name, int age, String sound, boolean canFly){
        super("Bird ", age, sound);
        this.canFly = canFly;
    }

    public String toString(){
        return " Bird " + name + " i am " + age + " I say " + sound + " can I fly or not " + canFly + " I say " + sound;
    }
}
