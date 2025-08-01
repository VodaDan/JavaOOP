public class Cat extends Animal{
    private String furColor;

    public Cat(String name, int age, int healthLevel, int hungerLevel, int moodLevel, AnimalFood prefferedFood,
               RecreationalActivity prefferedActivity, String furColor) {
        super(name, age, healthLevel, hungerLevel, moodLevel, prefferedFood, prefferedActivity);
        this.furColor = furColor;
    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + " the cat meowed");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
