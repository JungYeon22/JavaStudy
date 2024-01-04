package multi;

public class MultiArray02 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        // 입력
        int num = 1;
        for(int i=arr.length-1;i >= 0;i--){
            for(int j=arr[i].length-1;j >= 0;j--){
                arr[j][i] += num++;
            }
        }

        // 출력
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                System.out.print(String.format("%4d",arr[i][j]));       // 4칸을 확보후 맨 오른쪽에
            }
            System.out.println();
        }
    }
}
