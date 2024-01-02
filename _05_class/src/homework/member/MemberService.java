package homework.member;

import java.util.Scanner;

public class MemberService {
    static Scanner scanner = new Scanner(System.in);
    private MemberDTO[] members = new MemberDTO[5];
    public void menu() {
        boolean con = true;
        while(con){
            System.out.println("*******************");
            System.out.println("\t1. 가입");
            System.out.println("\t2. 출력");
            System.out.println("\t3. 수정");
            System.out.println("\t4. 탈퇴");
            System.out.println("\t5. 끝내기");
            System.out.println("*******************");
            System.out.print("번호 : ");
            int number = scanner.nextInt();
            switch (number){
                case 1: insert(); break;
                case 2: list();   break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: con = false; break; // 종료
            }
        }
    }
    public void insert(){
        boolean success = false;
        for(int i=0;i < members.length;i++){
            if(members[i] == null){
                System.out.print("이름 입력 : ");
                String name = scanner.next();
                System.out.print("나이 입력 : ");
                int age = scanner.nextInt();
                System.out.print("핸드폰 입력 : ");
                String phone = scanner.next();
                System.out.print("주소 입력 : ");
                String address = scanner.next();
                members[i] = new MemberDTO(name, age, phone, address);
                success = true;
                break;
            }
        }
        if(!success) System.out.println("5명 정원이 꽉 찼습니다.");
        else         System.out.println("1 row created");
    }

    public void list(){
        System.out.println("이름\t\t\t나이\t\t\t핸드폰\t\t\t주소");
        for(int i=0;i < members.length;i++){
            if(members[i] != null){
                System.out.println(members[i].getName()+"\t\t"+
                        members[i].getAge() + "\t\t" +
                        members[i].getPhone()+ "\t\t" +
                        members[i].getAddress());
            }
        }
    }

    public void update(){
        System.out.print("핸드폰 번호 입력 : ");
        String phone = scanner.next();
        int memberNum = memberByPhone(phone);
        // 삭제 + 생성
        if(memberNum >= 0){
            members[memberNum] = null;
            insert();
            System.out.println("1 row(s) updated");
        } else {
            System.out.println("찾는 회원이 없습니다.");
        }
    }

    public void delete(){
        System.out.print("핸드폰 번호 입력 : ");
        String phone = scanner.next();
        int memberNum = memberByPhone(phone);
        if(memberNum >= 0){
            members[memberNum] = null;
            System.out.println("1 row deleted");
        }
        else {
            System.out.println("찾는 회원이 없습니다.");
        }
    }

    private int memberByPhone(String phone) {
        for(int i=0;i < members.length;i++){
            if(members[i] != null && members[i].getPhone().equals(phone)){
                return i;
            }
        }
        return -1;
    }
}
