import java.util.ArrayList;
import java.util.UUID;

public abstract class Keeper {
    private String name;
    private UUID id;
    private double salary;
    private ArrayList<Animal> animalsToCare;

    public Keeper(String name, double salary, ArrayList<Animal> animalsToCare) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.animalsToCare = animalsToCare;
    }

    public Keeper(String name, double salary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.animalsToCare = new ArrayList<>();
    }

    public abstract void work();


    public void addAnimalToCare(Animal animal){
        this.animalsToCare.add(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Animal> getAnimalsToCare() {
        return animalsToCare;
    }

    public void setAnimalsToCare(ArrayList<Animal> animalsToCare) {
        this.animalsToCare = animalsToCare;
    }
}
