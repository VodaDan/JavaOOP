public class Game {

    private Adopter adopter;
    private Animal animalToAdopt;
    private Veterinarian assignedVet;

    public Game(Adopter adopter, Animal animalToAdopt, Veterinarian assignedVet) {
        this.adopter = adopter;
        this.animalToAdopt = animalToAdopt;
        this.assignedVet = assignedVet;
    }
}
