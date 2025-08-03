public abstract class Veterinarian extends Person {
    private String speciality;

    public Veterinarian(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public void checkAppointment(Appointment appointment){
        System.out.println(this.name + " is checking " + appointment.getAnimal() + ".");

    }

    public abstract void careAnimal(Animal animal);

    public Veterinarian() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
