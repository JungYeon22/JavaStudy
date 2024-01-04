package array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {35, 48, 25, 72, 50};
        System.out.print("정렬 전 : ");
        for(int data : arr){
            System.out.print(data+ " ");
        }
        System.out.println();

        System.out.print("정렬 후 : ");
        // Arrays.sort(arr);
        // 선택 정렬
        for(int i=0;i < arr.length;i++){
            for(int j=i+1;j < arr.length;j++){
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int data : arr){
            System.out.print(data+ " ");
        }
    }
}
/*
정렬
- 오름차순 : ascending : 1 2 3 ..    ㄱ ㄴ ㄷ..
- 내림차순 : descending : .. 3 2 1
 */
