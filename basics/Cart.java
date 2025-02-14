class Product {
    private String name;
    private int quantity;
    private float price;

    Product(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = 50;
    }
    Product(String name) {
        this.name = name;
        this.quantity = 1;
        this.price = 100;
    }
    Product() {
        this.name = "Unknown";
        this.quantity = 1;
        this.price = 100;
    }
    public float getTotal(){
        float gst = price * 0.18f;
        return (float) quantity * price + gst;
    }
}

class Cart {
    public static void main(String a[]){
        Product samsung = new Product("Samsung M30s", 1, 18_999);
        Product keyChain = new Product("Biscuts", 7);
        Product keyChain = new Product("Key Chain");
        Product unknown = new Product();

        float samsungTotal = samsung.getTotal();
        System.out.println(samsungTotal);


    }
}