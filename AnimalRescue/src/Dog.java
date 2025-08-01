public class Dog extends Animal{
    private String size;
    private int weight;

    public Dog(String name, int age, int healthLevel, int hungerLevel, int moodLevel, AnimalFood prefferedFood, RecreationalActivity prefferedActivity, String size, int weight) {
        super(name, age, healthLevel, hungerLevel, moodLevel, prefferedFood, prefferedActivity);
        this.size = size;
        this.weight = weight;
    }

    public void makeSound(){
        if(this.getWeight() > 30) {
            System.out.println(this.getName() + " barked loudly!");
        } else {
            System.out.println(this.getName() + " barked!");
        }
    }

    @Override
    public void move() {
        System.out.println("The dog is moving on it's paws");
    }

    @Override
    public void reproduce() {
        System.out.println("The dog gave birth!");
    }

    @Override
    public void defend() {
        System.out.println("The dog bites!");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
