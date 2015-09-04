/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/


class CartoonCharacter {

   // Properties of the class...
   private String name;
   public String favouriteColour;
   public int    favouriteNumber;
   public static int count;

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      count = count + 1;
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}
