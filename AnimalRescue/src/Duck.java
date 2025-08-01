public class Duck extends Animal{
    public Duck(String name, int age, int healthLevel, int hungerLevel, int moodLevel,
                AnimalFood prefferedFood, RecreationalActivity prefferedActivity) {
        super(name, age, healthLevel, hungerLevel, moodLevel, prefferedFood, prefferedActivity);
    }

    public void makeSound() {
        System.out.println(this.getName()+" quacked!");
    }
}
