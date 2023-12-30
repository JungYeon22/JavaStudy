package homework.exam;

import java.util.Scanner;

public class Exam {
    private String name;
    private String dap;
    private char[] ox;
    private int score;
    private final String JUNG="11111"; //상수화

    public Exam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        System.out.print("답 입력 : ");
        String answer = scanner.next();
        this.name = name;
        this.dap = answer;
        compare();
    }

//    public Exam(String name, String dap) {
//        this.name = name;
//        this.dap = dap;
//        compare();
//    }

    private void compare(){
        ox = new char[JUNG.length()];
        for(int i=0;i < JUNG.length();i++){
            if(JUNG.charAt(i) == dap.charAt(i)){
                ox[i] = 'O';
                score += 20;
            }
            else {
                ox[i] = 'X';
            }
        }
    }

    public String getName() {
        return name;
    }

    public char[] getOx() {
        return ox;
    }

    public int getScore() {
        return score;
    }
}
/*
compare() - 비교
getName()
getOx()
getScore()
 */