public class DoctorParasites extends Veterinarian{
    public DoctorParasites(String name, String speciality) {
        super(name, speciality);
    }

    public DoctorParasites() {
    }


    public void careAnimal(Animal animal){
        System.out.println("The "+this.getClass().getName()+" sprayed " + animal.getName() + " with anti-parsites spray. And gave him a vaccine.");
    }
}
