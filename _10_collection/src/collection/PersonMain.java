package collection;

import java.util.ArrayList;

public class PersonMain {
    public ArrayList<PersonDTO> init(){
        ArrayList<PersonDTO> list = new ArrayList<>();
        PersonDTO person1 = new PersonDTO("홍길동", 23);
        PersonDTO person2 = new PersonDTO("프로도", 30);
        PersonDTO person3 = new PersonDTO("라이언", 53);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        return list;
    }
    public static void main(String[] args){

        PersonMain personMain = new PersonMain();
        ArrayList<PersonDTO> list = personMain.init();
        System.out.println(list);
        for(int i=0;i < list.size();i++){
            System.out.println(list.get(i).getName() + "\t" + list.get(i).getAge());
        }
        System.out.println();
        for (PersonDTO data : list){
            System.out.println(data.getName() + ": " + data.getAge() + "살");
            System.out.println(data.toString());
        }



    }
}
