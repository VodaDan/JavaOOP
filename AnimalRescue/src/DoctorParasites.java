public class DoctorParasites extends Veterinarian{
    public DoctorParasites(String name, String speciality) {
        super(name, speciality);
    }

    public DoctorParasites() {
    }


    public void careAnimal(Animal animal){
        int initialHealthLevel = animal.getHealthLevel();
        System.out.println("The "+this.getClass().getName()+" sprayed " + animal.getName() + " with anti-parsites spray. And gave him a vaccine.");
        animal.setHealthLevel(initialHealthLevel + 5);
        System.out.println("After the medical appointment, " + animal.getName() + " stats are:");
        animal.printStats();

    }
}
