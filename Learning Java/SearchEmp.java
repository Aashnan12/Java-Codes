import java.util.*;

public class SearchEmp {
    int emp_id,basic_sal;
    double emp_sal;
    String emp_name,emp_dep;

    public void getinfo(){
        Scanner sc = new Scanner(System.in);
        basic_sal = sc.nextInt();
        emp_sal = basic_sal + 0.1*basic_sal + 1.5*basic_sal + 5000;
        sc.nextLine();
        System.out.print("Enter employee name: ");
        emp_name = sc.nextLine();
        System.out.print("Enter employee department: ");
        emp_dep = sc.nextLine();
        System.out.print("Enter employee ID: ");
        emp_id = sc.nextInt();
    }

    public void printinfo(){
        System.out.println(emp_name + " " + emp_dep + " " + emp_id + " " + emp_sal);
    }
    public int search(){
        return emp_id;
    }
    public static void main(String args[]){
        int search_id,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        search_id = sc.nextInt();
        SearchEmp arr[] = new SearchEmp[n];
        for(int i=0;i<n;i++){
            arr[i] = new SearchEmp();
            arr[i].getinfo();
        }
        for(int i=0;i<n;i++){
            if(arr[i].search() == search_id){
                arr[i].printinfo();
            }
        }
    }
}
