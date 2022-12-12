public class WhileFizzBuzz {

   public static void printFizzBuzz(){
      int number = 1;
      while (number<=100){
         String result = "" + number;
         if(number%3 ==0){
            result = "fizz";
         }
         if(number%5 ==0){
            result = "buzz";
         }
         if(number%3 ==0 && number%5 ==0){
            result = "fizzbuzz";
         }
         System.out.println(result);
         number++;
      }
   }

   public static void main(String[] args) {
      printFizzBuzz();

        }
}
