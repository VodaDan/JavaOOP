import java.util.ArrayList;

public class Adopter extends Person {
    private ArrayList<Animal> adoptedAnimal;


    public Adopter(String name, double availableMoney) {
        super();
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
