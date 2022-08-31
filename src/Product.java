public class Product {
    String productName;
    int price;
    int sum;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return productName + " " + price + " руб/шт";
    }
}
