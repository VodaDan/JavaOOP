import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /** Assignment Objects Setup */

        // Ex 4
        AnimalFood kibble = new AnimalFood("Kibble", 24,500, new Date(System.currentTimeMillis()+1000*60*60*24*60),50); // Date is current time + 1000ms*60=1min * 60 = 1hour * 24 = 1 day * 60 = 2 months
        RecreationalActivity mousePlay = new RecreationalActivity("Mouse Play");
        Animal cat = new Animal("cat",6,9,10,7,kibble,mousePlay);
        Adopter John = new Adopter("John",5040);
        Veterinarian Lynda = new Veterinarian("Lynda","Gastro-Intestinal");

        /** Assignment Encapsulation */

        //      Recreating Objects with setters.
        AnimalFood kibble2 = new AnimalFood();
        RecreationalActivity branchPlay = new RecreationalActivity();
        Animal dog = new Animal();
        Adopter Dave = new Adopter();
        Veterinarian Louis = new Veterinarian();

        //      Setting values
        kibble2.setName("Kibble-Dog");
        kibble2.setExpirationDate(new Date(System.currentTimeMillis()+1000*60*60*24*60));
        kibble2.setPrice(40);
        kibble2.setQuantity(2500);
        kibble2.setStockQuantity(10);

        branchPlay.setName("Playing fetch");

        dog.setName("Husky");
        dog.setAge(4);
        dog.setHealthLevel(10);
        dog.setHungerLevel(10);
        dog.setMoodLevel(10);
        dog.setPrefferedActivity(branchPlay);
        dog.setPrefferedFood(kibble2);

        Dave.setName("Dave");
        Dave.setAvailableMoney(6000);

        Louis.setName("Louis");
        Louis.setSpeciality("Parsites");

        /** Assignment Inheritance */

        WetFood whiskas = new WetFood("Whiskas", 6,80 ,
                new Date(System.currentTimeMillis()+1000*60*60*24*10),80);
        AnimalFood catFood = new SolidFood("Seaside", 44,500 ,
                new Date(System.currentTimeMillis()+1000*60*60*24*50),20);
        SolidFood scoobySnack = new SolidFood("Scooby-Snack",999,1,new Date(System.currentTimeMillis()+1000*60*60*24*90),1);
        RecreationalActivity swimPlay = new RecreationalActivity("Swimming");
        RecreationalActivity huntGhost = new RecreationalActivity("Ghost Hunting");

        Cat tomTheCat = new Cat("Tom", 12, 8,
                10,10,whiskas, mousePlay,"White");
        Duck bobTheDuck = new Duck("Bob", 3,9,5,10,kibble2,swimPlay);

        Dog scoobyTheDog = new Dog("Scooby-Doo",9,10,10,10,scoobySnack,huntGhost,"Big",40);

        /** Assignment Polymorphism */

        Animal emptyAnimal = new Animal();

        System.out.println("\n---------Making sound-------");
        emptyAnimal.makeSound(); // Animal class
        tomTheCat.makeSound(); // Cat class extended Animal
        bobTheDuck.makeSound(); // Duck class extended Animal
        scoobyTheDog.makeSound(); // Dog class extended Animal

        System.out.println("\n---------Moving-------");
        emptyAnimal.move();
        tomTheCat.move();
        bobTheDuck.move();
        scoobyTheDog.move();

        System.out.println("\n---------Defending-------");
        emptyAnimal.defend();
        tomTheCat.defend();
        bobTheDuck.defend();
        scoobyTheDog.defend();

        System.out.println("\n---------Food Satisfaction-------");
        SolidFood plainOldSolidFood = new SolidFood("Plain Old Solid Food",5,5000,new Date(System.currentTimeMillis()+1000*60*60*24*150),34);
        System.out.println("Is " + kibble2.getName() + " loved by animals? " + kibble2.isItLovedByAnimals());
        System.out.println("Is " + kibble.getName() + " loved by animals? " + kibble.isItLovedByAnimals());
        System.out.println("Is " + scoobySnack.getName() + " loved by animals? " + scoobySnack.isItLovedByAnimals());
        System.out.println("Is " + whiskas.getName() + " loved by animals? " + whiskas.isItLovedByAnimals());
        System.out.println("Is " + plainOldSolidFood.getName() + " loved by animals? " + plainOldSolidFood.isItLovedByAnimals());

        System.out.println("\n---------Food Type-------");
        kibble2.getType();
        kibble.getType();
        scoobySnack.getType();
        whiskas.getType();
        plainOldSolidFood.getType();

        /** Assignment Abstraction */
        System.out.println("\n---------Cleaner-------");
        Cleaner cleanerJohn = new Cleaner("John", 4800);
        cleanerJohn.addAnimalToCare(tomTheCat);
        cleanerJohn.addAnimalToCare(scoobyTheDog);
        cleanerJohn.work();

        System.out.println("\n---------Feeder-------");
        Feeder feederMike = new Feeder("Mike", 4900);
        feederMike.addAnimalToCare(scoobyTheDog);
        feederMike.addAnimalToCare(bobTheDuck);
        feederMike.work();












    }
}