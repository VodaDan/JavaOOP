import java.util.Date;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private Date expirationDate;
    private int stockQuantity;

    public AnimalFood(String name, int price, int quantity, Date expirationDate, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stockQuantity = stockQuantity;
    }
}
