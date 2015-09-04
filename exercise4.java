/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

class Flea {
   
   // Properties of the class...
   private String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   public String toString() {
      return "I am a dog called " + name + ". I am " + age + " years old. My flea: " + dogsFlea + ".";
   }

}

class DogOwner{

   // Properties of the class...
   private String name;
   private int    salary;
   public Dog    dog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name     = aName;
      salary   = aSalary;
      dog      = aDog;
   }

   public String toString() {
      return "I am called " + name + ". I make " + salary + " dollars a year. My dog: " + dog + ".";
   }

}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {


   		Flea p = new Flea("Pop");
   		Flea s = new Flea("Squeak");
   		Flea z = new Flea("Zip");

   		Dog r = new Dog("Rex", 3, p);
   		Dog j = new Dog("Jimbo", 5, s);
   		Dog f = new Dog("Fido", 7, z);

   		System.out.println(r.toString());
   		System.out.println(j.toString());
   		System.out.println(f.toString());

   		DogOwner a = new DogOwner("Agnus", 10000, r);
   		DogOwner b = new DogOwner("Brian", 450000, j);
   		DogOwner c = new DogOwner("Charles", 7600, f);

   		System.out.println(a.toString());
   		System.out.println(b.toString());
   		System.out.println(c.toString());

   		System.out.println(a.dog.dogsFlea.toString());

   }
}

