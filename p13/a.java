import java.util.*;
import java.lang.*;

interface legalPolicy{
     int legalAge =18;
}
class Person implements legalPolicy{
    private String name;
    private int age;
    
    public Person(String name,int age){
            this.name = name;
            this.age =age;
    }

    public void checkMartial(){
      if(this.age>=legalAge){
            System.out.println("Eligible for Marrige");
      }else{
            System.out.println("Not Eligible for Marrige");
      }
    }

}


class a{
    public static void main(String[] args) {
        Person personObj= new Person("Mohan",26);
        personObj.checkMartial();
    }
}