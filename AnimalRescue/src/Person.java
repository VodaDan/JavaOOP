import java.util.ArrayList;

public class Person {
    protected double availableMoney;
    protected String name;
    private ArrayList<AnimalFood> animalFoodStock;
    public Person() {
        this.animalFoodStock = new ArrayList<>();
    }


    public void feedAnimal(Animal animal, AnimalFood food) {
        int initialHungerLevel = animal.getHungerLevel();
        if(this.animalFoodStock.contains(food)) {
            if (animal.getPrefferedFood().getName().equals(food.getName())) {
                animal.setMoodLevel(animal.getMoodLevel() + 2);
            }
            animal.setHungerLevel(animal.getHungerLevel() + 4);
            System.out.println(animal.getName() + " was fed(" + food.getName() + ") by " + this.name + ", increasing hunger level from " + initialHungerLevel + " to " + animal.getHungerLevel());
            animalFoodStock.remove(food);
        } else {
            System.out.println(food.getName() +" is not available in stock for " + this.name +".");
        }
    }

    public void petAnimal(Animal animal) {
        System.out.println(this.name + " gave " + animal.getName()+ " pets.");
        animal.setMoodLevel(animal.getMoodLevel()+2);
    }

    public void buyFood(AnimalFood food, int quantity) {
        if(this.availableMoney < food.getPrice() * quantity) {
            System.out.println(this.name+ " doesn't have enough money for "+quantity+"x "+ food.getName() +"!");
        } else {
            for(int i = 0;i<quantity;i++) {
            this.animalFoodStock.add(food);
            }
            System.out.println(this.name +" bought "+quantity+"x "+ food.getName()+".");
        }
    }

    public ArrayList<AnimalFood> getAnimalFoodStock() {
        return animalFoodStock;
    }

    public void setAnimalFoodStock(ArrayList<AnimalFood> animalFoodStock) {
        this.animalFoodStock = animalFoodStock;
    }
}
