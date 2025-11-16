public class ims {
    int n;
    int ID;
    String name;
    int quantity;
    float price;
    float total;

    ims(){ 

    }
    public ims(int n, int ID, String name, int quantity, float price) {
        this.n = n;
        this.name = name;
        this.ID = ID;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity * price;
    }

    public void itemDetails() {
        System.out.println("Item " + n + "\n");
        System.out.println("Name: " + name + "\n");
        System.out.println("ID: " + ID);                
        System.out.println("Quantity: " + quantity); 
        System.out.println("Price per item: " + price);
        System.out.println("Total Price: $ " + total + "\n");
        System.out.println("------------------------------\n");
    }
    
}
