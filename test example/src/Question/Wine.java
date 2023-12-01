package Question;

public class Wine {
    private String name;
    private double price;
    private WineType type;

    public Wine(String name, double price, WineType type){
        this.name = name;
        if (price > 0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Cannot be zero or we go broke");
        }
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public WineType getType() {
        return type;
    }

    public String toString(){
        return (this.getName() + ":" + price);
    }
}
