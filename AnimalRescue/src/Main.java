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

        

    }
}