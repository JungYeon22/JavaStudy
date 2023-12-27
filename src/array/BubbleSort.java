package array;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {35, 48, 25, 72, 51};
        System.out.print("정렬 전 : ");
        for(int data : arr){
            System.out.print(data + " ");
        }
        System.out.println();

        // Bubble Sort
        System.out.print("정렬 후 : ");
        for(int i =0;i < arr.length;i++){
            for(int j=0;j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int data : arr){
            System.out.print(data + " ");
        }

    }
}
