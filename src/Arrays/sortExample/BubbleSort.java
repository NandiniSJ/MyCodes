package Arrays.sortExample;

public class BubbleSort {

    public void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSwapped;
        for(int i = 0; i < n-1 ; i++ ){
            isSwapped = false;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) break;
        }
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int [] arr = new int[] {2,6,7,3,4,9};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}
