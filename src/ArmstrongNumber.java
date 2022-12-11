import java.util.*;

public class ArmstrongNumber {

    public static List<Integer> findArmstrongNumber(int x, int y){
        int a = 3;
        List<Integer> armstrongNumbers = new ArrayList<>();
        for(int i=x; i<=y; i++){
            String string = "" + i;
            double sum = 0;
            for(int k=0; k<string.length(); k++){
                char digitChar = string.charAt(k);
                double p = Math.pow((Integer.parseInt("" + digitChar)), a);
                sum = sum + p;
            }
            if(sum == i){
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Collections.sort(List.of("Nandini"), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println(findArmstrongNumber(num1, num2));
    }
}
