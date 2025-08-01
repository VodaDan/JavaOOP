import java.util.ArrayList;

public class Shelter {
    private String location;
    private ArrayList<Animal> listOfAnimals;
    private Veterinarian assignedVeterinarian;

    public Shelter(String location, ArrayList<Animal> listOfAnimals, Veterinarian assignedVeterinarian) {
        this.location = location;
        this.listOfAnimals = listOfAnimals;
        this.assignedVeterinarian = assignedVeterinarian;
    }
}
