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
    public Animal(){}

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public AnimalFood getPrefferedFood() {
        return prefferedFood;
    }

    public void setPrefferedFood(AnimalFood prefferedFood) {
        this.prefferedFood = prefferedFood;
    }

    public RecreationalActivity getPrefferedActivity() {
        return prefferedActivity;
    }

    public void setPrefferedActivity(RecreationalActivity prefferedActivity) {
        this.prefferedActivity = prefferedActivity;
    }
}
