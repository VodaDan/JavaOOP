import java.util.ArrayList;

public class Adopter extends Person {

    private double availableMoney;
    private ArrayList<Animal> adoptedAnimal;
    private ArrayList<AnimalFood> animalFoodStock;

    public Adopter(String name, double availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
        this.adoptedAnimal = new ArrayList<>();
    }

    public void playWithPet(Animal animal, RecreationalActivity activity){
        int initialMood = animal.getMoodLevel();
        if(animal.getPrefferedActivity().getName().equals(activity.getName())) {
            animal.setMoodLevel(animal.getMoodLevel()+4);
            animal.setHungerLevel(animal.getHungerLevel() - 2);
        } else {
            animal.setMoodLevel(animal.getMoodLevel() +3);
            animal.setHungerLevel(animal.getHungerLevel() - 1);
        }
        System.out.println(this.name + " spent time("+activity.getName()+") with "+animal.getName()+", incresing mood level from "+ initialMood + " to " +animal.getMoodLevel());
    }

    public void buyFood(AnimalFood food, int quantity) {
        if(this.availableMoney < food.getPrice() * quantity) {
            System.out.println(this.name+ " doesn't have enough money for "+quantity+"x "+ food.getName() +"!");
        } else {
            this.animalFoodStock.add(food);
            System.out.println(this.name +" bought "+quantity+"x "+ food.getName()+".");
        }
    }

    public void adoptAnimal(Animal animal) {
        this.adoptedAnimal.add(animal);
        System.out.println(animal.getName() + " was adopted by " + this.name +".");
    }

    public ArrayList<Animal> getAdoptedAnimal() {
        return adoptedAnimal;
    }

    public void setAdoptedAnimal(ArrayList<Animal> adoptedAnimal) {
        this.adoptedAnimal = adoptedAnimal;
    }

    public ArrayList<AnimalFood> getAnimalFoodStock() {
        return animalFoodStock;
    }

    public void setAnimalFoodStock(ArrayList<AnimalFood> animalFoodStock) {
        this.animalFoodStock = animalFoodStock;
    }

    public Adopter(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }
}
