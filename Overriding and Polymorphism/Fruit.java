class Fruit{
    String name;
    String taste;
    int size;

    void eat(){
        System.out.println(name + " is very " + taste + "and its size is " + size );
    }

    public static void main(String[] args) {
    
    Apple ap =  new Apple();
    ap.name="Apple";
    ap.taste="Sweet";
    ap.size=2;
    ap.eat();
    Orange or = new Orange();
    or.name="Orange";
    or.taste="sour";
    or.size=2;
    or.eat();

    }
}

class Apple extends Fruit{
     void eat(){
        System.out.println(name + " are "  + taste  + " in taste and " + size + " cm in size." );
     }
}
class Orange extends Fruit{
    void eat(){
        System.out.println(name + " are "  + taste  + " in taste and " + size + " cm in size." );
     }
}