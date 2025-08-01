public class Duck extends Animal{
    public Duck(String name, int age, int healthLevel, int hungerLevel, int moodLevel,
                AnimalFood prefferedFood, RecreationalActivity prefferedActivity) {
        super(name, age, healthLevel, hungerLevel, moodLevel, prefferedFood, prefferedActivity);
    }

    public void makeSound() {
        System.out.println(this.getName()+" quacked!");
    }

    @Override
    public void move() {
        System.out.println("The duck is moving on it's feets");
    }

    @Override
    public void reproduce() {
        System.out.println("The duck layed an egg!");
    }

    @Override
    public void defend() {
        System.out.println("The duck runs!");
    }
}
