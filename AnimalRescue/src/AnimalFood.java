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

    public AnimalFood(){}

    public boolean isItLovedByAnimals() {
        return true;
    }

    public void getType(){
        System.out.println("This food is a combination of solid and wet food.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
