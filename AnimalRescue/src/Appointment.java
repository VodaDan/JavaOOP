public class Appointment {
    private Animal animal;
    private int healthLevel;
    private String medication;

    public Appointment(String medication, Animal animal) {
        this.medication = medication;
        this.animal = animal;
        setHealthLevel(animal.getHealthLevel());
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
}
