import java.util.*;
public class Array_of_Objects {
    int rollno,age;
    String name;
    // void getinfo(){
    //     Scanner sc = new Scanner(System.in);
    //     name = sc.nextLine();
    //     age = sc.nextInt();
    //     rollno = sc.nextInt();
    // }
    public Array_of_Objects(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        rollno = sc.nextInt();
    }
    void putinfo(){
         System.out.println("Name : " + name);
         System.out.println("Age : " + age);
         System.out.println("Roll No : " + rollno);
    }
    public static void main(String args[]){
        Array_of_Objects arr[] = new Array_of_Objects[3];
        for(int i=0;i<3;i++){
            arr[i] = new Array_of_Objects();
            // arr[i].getinfo();
        }
        for(int i=0;i<3;i++){
            arr[i].putinfo();
        }
    }
}
