import java.util.Date;

public class WetFood extends AnimalFood{
    public WetFood(String name, int price, int quantity, Date expirationDate, int stockQuantity) {
        super(name, price, quantity, expirationDate, stockQuantity);
    }

    @Override
    public void getType(){
        System.out.println("This food is wet.");
    }
}
