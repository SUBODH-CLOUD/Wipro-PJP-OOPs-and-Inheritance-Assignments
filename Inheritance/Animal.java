class Animal{
    void eat(){
    System.out.println("Animal eat grass.");
    }
    void sleep(){
        System.out.println("Animal sleep in cell.");
    }


    public static void main(String[] args) {
    Animal Lion = new Animal();
    Lion.eat();
    Lion.sleep();
    Bird Parrot = new Bird();
    Parrot.eat();
    Parrot.sleep();
    Parrot.fly();
    }
}

class Bird extends Animal{
     void eat(){
        System.out.println("Bird eat seeds.");
     }
     void sleep(){
        System.out.println("Bird sleep in ghost.");
     }
     void fly(){
        System.out.println("Bird fly in the sky.");
     }  
}