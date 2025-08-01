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
}
