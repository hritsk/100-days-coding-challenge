import java.util.*;
public class Statickeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        

        Student s3 = new Student();
        s3.schoolName = "ABC";

        System.out.println(s1.schoolName); 
    }
}
class Student{
    String name;
    int roll;

    static String schoolName;

    void setname(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
