public class DoctorDigestiveSystem extends Veterinarian{
    public DoctorDigestiveSystem(String name, String speciality) {
        super(name, speciality);
    }

    public DoctorDigestiveSystem() {
    }

    public void careAnimal(Animal animal){
        System.out.println("The "+this.getClass().getName()+" doctor gave " + animal.getName() + " digestive pills.");
    }
}
