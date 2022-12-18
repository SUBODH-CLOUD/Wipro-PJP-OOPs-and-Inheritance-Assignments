class Author {
    static String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        Author.name = name;
        this.email = email;
        this.gender = gender;
 
    //  System.out.println("Author : " + name + ", Email : " + email + ", Gender : " + gender);
    
    
        System.out.println("[Name : " + name + ", Email : " + email + ", Gender : " + gender + "]");
    }


public static void main(String[] args){
       
    //Author authorobj = new Author();//"Herbert Schildt", "subodhkr12342@gmail.com", 'M');
    Author Aobj = new Author("Herbert Schildt", "subodhkr12342@gmail.com",'M');
    Book Bobj = new Book();
    
    Bobj.SetterBname("Java");
    Bobj.Setterprice(897);
    Bobj.SetterqtyInStock(410);
    Bobj.display();

    Book BookC = new Book();
    BookC.SetterBname("C The Complete Reference ");
    BookC.Setterprice(500);
    BookC.SetterqtyInStock(1000);
    BookC.display();
   // BookC.display();
    

 }

}
class Book {
   

   private String name;
   private  String author = Author.name;
   private double price;
   private int qtyInStock;

   

    void SetterBname(String name){           //Setter
       this.name = name;
        
    }
  
    void Setterprice(double price){
        this.price = price;
    }
    void SetterqtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }


    String GetterBname(){                    //Getter
       return name;
    }
   
    double Getterprice(){
        return price;
    }
    int GetterqtyInStock(){
        return qtyInStock;
    }

   

    void display(){
       // System.out.println("Name : " + Author.name + "Email : " + email + " Gender : " + gender);
        System.out.println("[BookName : " + GetterBname() + " " +", Author : " + author + ", Price : " +  Getterprice() + ", Quantity in Stock : " + GetterqtyInStock() + "]");
    }
}

    