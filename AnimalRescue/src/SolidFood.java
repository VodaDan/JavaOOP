import java.util.Date;

public class SolidFood extends AnimalFood {

    public SolidFood(String name, int price, int quantity, Date expirationDate, int stockQuantity) {
        super(name, price, quantity, expirationDate, stockQuantity);
    }

    @Override
    public boolean isItLovedByAnimals() {
        if(this.getName().equals("Scooby-Snack")){
            return true;
        }
        return false;
    }

    @Override
    public void getType(){
        System.out.println("This food is solid.");
    }
}
