import java.util.ArrayList;

public class Cleaner extends Keeper{
    public Cleaner(String name, double salary, ArrayList<Animal> animalsToCare) {
        super(name, salary, animalsToCare);
    }

    public Cleaner(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("Cleaner is doing his job.");
        System.out.println("His animals currently in care are " + this.getAnimalsToCare().toString());
    }
}
