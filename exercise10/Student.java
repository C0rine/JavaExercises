/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

/* 
   Ik had veel moeite met deze opdracht en daarom veelvuldig 
   het antwoordenbald geraadpleegd.
   Hoe die exceptions werken werdt niet echt goed uitgeled. 
   Ik begrijp het nog steeds niet helemaal.
*/

import java.io.*;

class InvalidAgeException extends Exception {
  public InvalidAgeException () {
    super();
  }
  public InvalidAgeException (String m) {
    super(m);
  }
}

public class Student {
  private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
  private String name;  
  private int age;
  
  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }

  public void printName () {
    System.out.println("Name: " + name);
  }

  public void readAge () {
    boolean x = false;
    while (!x) {
      System.out.print("Input your age: ");

      try {
        age = Integer.parseInt(stdIn.readLine());
        if (!(x = ((age >= 0) && (age <=150))))
        System.out.println("Try again! (range 0 to 150.)");
      }
      catch (IOException e) {
        System.out.println("Something BAD happened!");
        System.exit(0);
      }
      catch (NumberFormatException e) {
        age = -1;
        System.out.println("Try again!");
      }
    }
  }

  public void printAge () {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.readAge();
    me.printName();
    me.printAge();
  }
}
