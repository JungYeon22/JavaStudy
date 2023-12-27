package array;

public class Array01 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 24;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 15;
        arr[4] = 42;

        System.out.println("배열명 : " + arr);     // 클래스명@16진수
        System.out.println("배열 크기 : " + arr.length);
        for(int i=0;i < arr.length;i++){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        System.out.println();
        System.out.println("거꾸로 출력");
        for(int i=arr.length-1;i >= 0;i--){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        System.out.println();
        System.out.println("홀수 데이터만 출력");
        for(int i=0;i < arr.length;i++){
            if(arr[i]%2 != 0){
                System.out.println("arr[" + i + "] : " + arr[i]);
            }
        }
        System.out.println();

        System.out.println("확장 for문");
        for(int data : arr){
            System.out.println("data : " + data);
        }
    }
}
