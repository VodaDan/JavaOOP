import java.time.LocalDate;
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
        kibble2.setName("Kibble Dog");
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







    }
}