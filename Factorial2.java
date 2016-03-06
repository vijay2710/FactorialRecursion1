public class Factorial2 {
   public static void main(String args[]) {
      for (int i = 0; i<= 20; i++){
         System.out.printf("%d! = %d\n", i ,factorial(i));
      }
   }
   public static long factorial(long number) {
      if (number <= 1)
         return 1;
      else
         return number * factorial(number - 1);
   }
}