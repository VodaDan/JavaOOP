public class Person {

    public void feedAnimal(Animal animal, AnimalFood food) {
        if(animal.getPrefferedFood().getName().equals(food.getName())){
            animal.setMoodLevel(animal.getMoodLevel() + 2);
        }
        animal.setHungerLevel(animal.getHungerLevel() +4);
    }
}
