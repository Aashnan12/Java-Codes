import java.util.*;

public class Count_Del_vowels {
    public static void main(String args[]){
        int n;

        System.out.println("Enter the String Length");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); //for Extra New Line Eater
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        int vowels = 0;
        int cons = 0;
        int special = 0;
        int index = 0;
        while(index < n){
            char ch = str.charAt(index);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
            else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                cons++;
            }
            else{
                special++;
            }
            index++;
        }
        System.out.println(vowels + " " + cons + " "+ special);
        index = 0;
        String newstring = "";
        while(index < n){
            char ch = str.charAt(index);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                newstring += ch;
            }
            index++;
        }
        System.out.println(newstring);
    }
}
