public class Veterinarian {
    private String name;
    private String speciality;

    public Veterinarian(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

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
