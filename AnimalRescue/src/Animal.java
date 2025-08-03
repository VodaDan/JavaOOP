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

    public void makeSound() {
        System.out.println(this.name + " made a sound.");
    }

    public void move() {
        System.out.println("Animal is moving!");
    }

    public void reproduce() {
        System.out.println("Animal is reproducing!");
    }

    public void defend() {
        System.out.println("The animal is defending");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping! Zzzzz");
        this.moodLevel = this.moodLevel + 2;
        this.healthLevel = this.healthLevel +1;
        this.hungerLevel = this.hungerLevel -3;
    }

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
        if(this.healthLevel > 10) {
            this.healthLevel = 10;
        } else if ( this.healthLevel < 0) {
            this.healthLevel = 0;
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
        if(this.hungerLevel > 10) {
            this.hungerLevel = 10;
        } else if (this.hungerLevel < 0) {
            this.hungerLevel = 0;
        }
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
        if (this.moodLevel > 10) {
            this.moodLevel = 10;
        } else if (this.moodLevel < 0) {
            this.moodLevel = 0;
        }
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

    @Override
    public String toString(){
        return this.name;
    }
}
