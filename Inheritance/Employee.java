

class Employee extends Person{
 

private  double annualSalary ;
  private int Year;
  private String insuranceNumber;

   void Setter(double annualSalary, int Year, String insuranceNumber){
        
        this.annualSalary = annualSalary;
        this.Year = Year;
        this.insuranceNumber= insuranceNumber;
   }

   double GannualSalary(){
    return annualSalary;
   }
   int GYear(){
    return Year;
   }
   String GinsuranceNumber(){
    return insuranceNumber;
   }

   void display(){
    System.out.println("Name : " + SetterName() + "\nYear the employee started to work : " + GYear() + "\nNational Insurance Number : " + GinsuranceNumber());
   }
}