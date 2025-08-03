public class Appointment {
    private Animal animal;
    private int healthLevel;
    private String medication;

    public Appointment(Animal animal) {

        this.animal = animal;
        this.setHealthLevel(animal.getHealthLevel());
        System.out.println("Appointment for " + animal.getName() + " has been created.His health level is "+ this.getHealthLevel()+".");
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
}
