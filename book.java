public class book {

    int n;
    String title;
    String author;
    String ID;
    float price;

    book(){ }
    
    book(int n, String title, String author, String ID, float price){
        this.n = n;
        this.ID = ID;
        this.title = title ;
        this.author = author;
        this.price = price; 
    }
    
    public void displayAllDetails(){
        System.out.printf("%2d | %2s | %-20s | %-20s| $%-4.2f \n", n,ID,title,author,price, "\n");
    }
}
        

  
    
    


    

    

