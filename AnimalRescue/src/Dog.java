public class Dog extends Animal{
    private String size;
    private int weight;

    public Dog(String name, int age, int healthLevel, int hungerLevel, int moodLevel, AnimalFood prefferedFood, RecreationalActivity prefferedActivity, String size, int weight) {
        super(name, age, healthLevel, hungerLevel, moodLevel, prefferedFood, prefferedActivity);
        this.size = size;
        this.weight = weight;
    }
}
