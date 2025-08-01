import java.util.ArrayList;
import java.util.UUID;

public class Keeper {
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
}
