package multi;

public class MultiArray05 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        int num = 10;
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                arr[i][j] = num;
                num += 10;
            }
        }
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                System.out.println(arr[i][j]);

            }
        }
    }
}
