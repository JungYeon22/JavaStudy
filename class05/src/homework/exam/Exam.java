package homework.exam;

public class Exam {
    private String name;
    private String dap;
    private char[] ox;
    private int score;
    private final String JUNG="11111"; //상수화

    public Exam(String name, String dap) {
        this.name = name;
        this.dap = dap;
        compare();
    }

    private void compare(){
        ox = new char[5];
        for(int i=0;i < ox.length;i++){
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