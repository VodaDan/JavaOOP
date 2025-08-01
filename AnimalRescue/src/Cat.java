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

    @Override
    public void move() {
        System.out.println("The cat is moving on it's paws");
    }

    @Override
    public void reproduce() {
        System.out.println("The cat gave birth!");
    }

    @Override
    public void defend() {
        System.out.println("The cat scratches!");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
