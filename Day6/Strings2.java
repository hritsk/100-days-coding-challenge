import java.util.*;
public class Strings2 {
    public static void main(String args[]) {
        //compare
        String name1="Tony";
        String name2="Tony";
        //Case1 s1>S2: +ve values
        //case2 s1==s2: 0
        //Case3 s1>s2: -ve values

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        } 
    }
}
