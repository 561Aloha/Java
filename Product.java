public class Product{
    String name;
    int upc;
    double price;

    public Product(String name, int upc, double price){
        this.name = name;
        this.upc = upc;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getUpc() {
        return upc;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (UPC: %d) - $%.2f", name, upc, price);
    }
}


