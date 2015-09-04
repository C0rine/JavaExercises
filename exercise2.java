/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private int height;
   public int years;
    
   // Constructor of the class...
   public Person(String aName, int anAge, int aHeight) {
      name = aName;
      age  = anAge;
      height = aHeight;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age + ".");
      System.out.println("My height in cm is " + height + ".");
      commentAboutAge();
      System.out.println();
   }

   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
      	 System.out.println("old person");	
      }
   }

   public void growOlder() {
      age = age + 1;
   }	

   public void growOlderBy(int years) {
      age = age + years;
   }

   public void giveKnighthood() {
      name = "Sir " + name;	
   }
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person("Luke Skywalker",34, 175);
      Person wp = new Person("Winston Peters",48, 180);

      ls.talk();
      wp.talk();

      ls.growOlderBy(10);

      System.out.println(ls.age);

   }

}

