public class Fish extends Animal{
    protected boolean isSaltwater;
    public Fish(String name, int age, String sound, boolean isSaltwater){
        super("Fish ", age, sound);
        this.isSaltwater = isSaltwater;
    }

    public String toString(){
        return " Fish " + name + " i am " + age + " i am in 'Saltwater' or 'not' " + isSaltwater + " I say " + sound;
    }
}
