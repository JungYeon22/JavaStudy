package class_;

public class SungJukMain2 {
    public static void main(String[] args) {
        SungJuk[] sungJuks = new SungJuk[3];
        for(int i=0;i < sungJuks.length;i++){
            sungJuks[i] = new SungJuk();
        }
        sungJuks[0].setData("홍길동", 90, 96, 100);
        sungJuks[1].setData("박정연", 100, 100, 100);
        sungJuks[2].setData("김유주", 70, 88, 98);
        for(SungJuk sungJuk : sungJuks){
            sungJuk.calc();
        }
        System.out.println("-------------------------------------");
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t  학점");
        System.out.println("-------------------------------------");
        for(SungJuk sungJuk : sungJuks){
            System.out.println(sungJuk.getName() + "\t" +
                    sungJuk.getKor() + "\t" + sungJuk.getEng() + "\t" + sungJuk.getMath() + "\t" +
                    sungJuk.getTotal() + "\t" + String.format("%4.2f", sungJuk.getAvg()) + "\t" + sungJuk.getGrade());

        }

    }
}
