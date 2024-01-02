package class_;

import javax.swing.*;

public class SungJuk {
    private String name;
    private int kor, eng, math, total;
    private double avg;
    private char grade;

    public void setData(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public void calc(){
        total = kor + eng + math;
        avg = total / 3.0;
        if     (avg >= 90) grade ='A';
        else if(avg >= 80) grade ='B';
        else if(avg >= 70) grade ='C';
        else if(avg >= 60) grade ='D';
        else if(avg <  60) grade ='F';
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return total;
    }

    public double getAvg() {
        return avg;
    }

    public char getGrade() {
        return grade;
    }
}
