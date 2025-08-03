import java.util.ArrayList;

public class Feeder extends Keeper {
    public Feeder(String name, double salary, ArrayList<Animal> animalsToCare) {
        super(name, salary, animalsToCare);
    }

    public Feeder(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("The feeder is feeding the animals.");
        System.out.println("His animals currently in care are " + this.getAnimalsToCare().toString());
    }

    public void giveSnack(Animal animal,AnimalFood food){
        if(!(this.getAnimalsToCare().contains(animal))){
            System.out.println(this.getName()+" cannot feed "+animal.getName()+"! It's not assigned to them.");
        } else {

            int aux = animal.getMoodLevel();
            if (animal.getClass().equals(Dog.class) && food.getName().equals("Scooby-Snack")) {
                animal.setMoodLevel(animal.getMoodLevel() + 5);
                animal.setHungerLevel(animal.getHungerLevel() + 1);
            } else {
                animal.setMoodLevel(animal.getMoodLevel() + 3);
                animal.setHungerLevel(animal.getHungerLevel() + 2);
            }
            System.out.println(animal.getName() + " mood level was " + aux + " and after snacking it is " + animal.getMoodLevel() + ".");

        }
    }
}
