package multi;

public class MultiArray01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];

        int k = 10;
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                arr[i][j] = k;
                k += 10;
                System.out.println(arr[i][j] + " ");
            }
        }
        for(int i=0;i < arr.length;i++){
            System.out.println("arr[" + i + "] 주소: " + arr[i]);
            for(int j=0;j < arr[i].length;j++){
                System.out.println("arr["+i+"]" + "["+j+"] : " + arr[i][j]);
            }
        }

    }
}
