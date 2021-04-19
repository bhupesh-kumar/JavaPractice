import java.util.*;
import java.lang.*;

class Student{
    private String name;
    private int age;
    private String subjects[];
    private float marks[];
    
    public Student(String name,int age,String[] subjects,float[] marks){
        if(subjects.length == marks.length){
            this.name = name;
            this.age = age;
            this.subjects=subjects;
            this.marks = marks;
        }else{
            System.out.println("Subjects and Marks not valid");
            return;
        }
        
    }

    public void marksAverage(){
        float sum =0;
        for(int i=0;i<this.marks.length;i++){
            sum+= this.marks[i];
        }
        float avg= sum/this.marks.length;
        System.out.println("Average of marks :"+avg);
    }

}


class a{
    public static void main(String[] args) {
        String subjects[] ={"maths","English","Science"};
        float marks[]={60,50,70};
        Student std1= new Student("Mohan",26,subjects,marks);
        std1.marksAverage();
    }
}