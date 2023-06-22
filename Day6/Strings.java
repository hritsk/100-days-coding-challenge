import java.util.*;
public class Strings {
    public static void main(String args[]) {
        //concatenation
        String firstName ="tony";
        String lastName = "stark";
        String fullName = firstName +"@"+ lastName ;
        //tony@stark
        System.out.println(fullName.length());
        //cahrAt
        for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
