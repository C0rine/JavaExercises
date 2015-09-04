/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:
      double[] nums = new double[10];

      for (int j=0; j<10; j++) {
         nums[j] = (double) j/10 + 1;
      }

      for (int j=0; j<10; j++) {
         System.out.println(nums[j]);
      }

      printArray(nums);

   }

   public void printArray(double[] no) {
      for (int i=0; i<no.length; i++) {
         System.out.println(no[i]);
      }
   }
}
