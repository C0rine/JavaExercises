/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }

   public Citizen(String firstname) {
      name    = firstname;
      salary  = 0;
      savings = 0;
      loan    = 0;
   }


   // Methods of the class...
   public int getSalary() {
      return salary;
   }

   public void setSalary(int aSalary) {
      salary = aSalary;
   }

   public void salaryRise(int amount) {
      salary = salary + amount;
   }

   public int netWorth() {
      return savings - loan;
   }

   public String toString() {
      String info = "Name: " + name + ". Salary: " + salary + ". Savings: " + savings + ". Loan: " + loan + ".";
      return info;
   }

}

class CitizenTest {
    
   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);

      e.salaryRise(10000);

      System.out.println("Ernie's salary is: " + e.getSalary());
      System.out.println("Ernie's net worth is: " + e.netWorth());

      System.out.println(e.toString());
      System.out.println(b.toString());

      Citizen f = new Citizen("Fred");

      System.out.println(f.toString());

   }
}
