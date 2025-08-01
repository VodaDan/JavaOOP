public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private AnimalFood prefferedFood;
    private RecreationalActivity prefferedActivity;

    public Animal(String name, int age, int healthLevel, int hungerLevel, int moodLevel,
                  AnimalFood prefferedFood, RecreationalActivity prefferedActivity) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.prefferedFood = prefferedFood;
        this.prefferedActivity = prefferedActivity;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
