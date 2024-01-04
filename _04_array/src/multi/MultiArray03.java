package multi;

public class MultiArray03 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 0}, {4, 5, 6, 0}, {7, 8, 9, 0}, {0, 0, 0, 0}};

        //입력
        for(int i=0;i < arr.length-1;i++){
            for(int j=0;j < arr[i].length-1;j++){
                arr[i][3] += arr[i][j];
                arr[3][j] += arr[i][j];
                arr[3][3] += arr[i][j];
            }

        }

        for(int i=0;i < arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(String.format("%5d", arr[i][j]));
            }
            System.out.println();
        }
    }
}
