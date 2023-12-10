//Are arrays passed by value or passed by reference in Java?
import java.util.*;
public class Arrays_pass_by_ref_java {
    public static void changeContent(int[] arr){
        arr[0] = 10;
    }
    public static void changeRef(int[] arr){
        arr = new int[2];
        arr[0] = 15;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        changeContent(arr); // in java, array is acted as an object, so it passes  like a reference // so it alters in the main array
        System.out.println("The first element : "+arr[0]); // it prints as 10
        changeRef(arr); // here a new array is created in the sub function called, so no changes in the main array
        System.out.println("The 1st element is : "+arr[0]); // it prints 10 only
    }
}
