// import java.util.*;

// public class Buffer {
//     public static void main(String args[]){
//         int n;

//         System.out.println("Enter the String Length");
//         StringBuffer sb = new StringBuffer();
//         Scanner sc = new Scanner(System.in);
//         sb.append(sc.nextLine());
//         n = sc.nextInt();
//         sc.nextLine(); //for Extra New Line Eater
//         int vowels = 0;
//         int cons = 0;
//         int special = 0;
//         int index = 0;
//         while(index < n){
//             char ch = sb.charAt(index);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//                 vowels++;
//             }
//             else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
//                 cons++;
//             }
//             else{
//                 special++;
//             }
//             index++;
//         }
//         System.out.println(vowels + " " + cons + " "+ special);
//         index = 0;
//         while(index < n){
//             char ch = sb.charAt(index);
//             if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
//                 sb.deleteCharAt(index);
//             }
//             index++;
//         }
//         System.out.println(sb);
//     }
// }


import java.util.*;

public class Buffer {
    public static void main(String args[]) {
        int n;

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Corrected variable name
        n = input.length(); // Changed to get the length of the input string
        int vowels = 0;
        int cons = 0;
        int special = 0;
        int index = 0;
        while (index < n) {
            char ch = input.charAt(index); // Corrected to use input string
            if (Character.isLetter(ch)) { // Checking if it's a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    cons++;
                }
            } else {
                special++;
            }
            index++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + cons + ", Special characters: " + special);
        index = 0;
        StringBuilder sb = new StringBuilder(input); // Using StringBuilder instead of StringBuffer
        while (index < sb.length()) { // Using sb.length() instead of n
            char ch = sb.charAt(index);
            if (!(Character.isLetter(ch))) { // Checking if it's not a letter
                sb.deleteCharAt(index);
            } else {
                index++;
            }
        }
        System.out.println("Resulting string: " + sb);
    }
}

