public class WhileOddEvenFinder {

    public static void printOddEven(){
        int number = 1;
        while(number<=100){
            String result = "";
            if(number%2 ==0){
                result =number + "->Even";
            }else{
                result = number + "->Odd";
            }
            System.out.println(result);
            number++;
        }
    }

    public static void main(String[] args) {
        printOddEven();
    }

}
