public class book {

    int n;
    String title;
    String author;
    String ID;
    double price;

    book(){ }
    
    book(int n, String title, String author, String ID, double price){
        this.n = n;
        this.ID = ID;
        this.title = title ;
        this.author = author;
        this.price = price; 
    }

    public void print(){
        System.out.println("Number of books: " + n);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.err.println("ID" + ID);

        System.out.println("-------------------------------\n");
    }
    
}
        

  
    
    


    

    

