public class Adopter {
    private String name;
    private double availableMoney;

    public Adopter(String name, double availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public void playWithPet(Animal animal, RecreationalActivity activity){
        if(animal.getPrefferedActivity().getName().equals(activity.getName())) {
            animal.setMoodLevel(animal.getMoodLevel()+4);
            animal.setHungerLevel(animal.getHungerLevel() - 2);
        } else {
            animal.setMoodLevel(animal.getMoodLevel() +3);
            animal.setHungerLevel(animal.getHungerLevel() - 1);
        }
    }

    public Adopter(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }
}
