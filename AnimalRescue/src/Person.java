import java.util.ArrayList;

public class Person {
    protected String name;


    public void feedAnimal(Animal animal, AnimalFood food) {
        int initialHungerLevel = animal.getHungerLevel();
        if(animal.getPrefferedFood().getName().equals(food.getName())){
            animal.setMoodLevel(animal.getMoodLevel() + 2);
        }
        animal.setHungerLevel(animal.getHungerLevel() +4);
        System.out.println(animal.getName() + " was fed("+food.getName()+") by "+this.name+", increasing hunger level from "+ initialHungerLevel + " to " +animal.getHungerLevel());

    }

    public void petAnimal(Animal animal) {
        System.out.println(this.name + " gave " + animal.getName()+ " pets.");
        animal.setMoodLevel(animal.getMoodLevel()+2);
    }
}
