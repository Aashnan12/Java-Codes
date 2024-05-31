import java.util.Scanner;
class Employee{
    String name;
    int id;
    String dep;
    float BasicSalary;
    Employee(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        id = sc.nextInt();
        dep = sc.next();
        BasicSalary = sc.nextFloat();
    }
    public static void main(String args[]){
        Employee obj = new Employee();
        obj = null;
        System.gc();
    }
    public void finalize() {  
        System.out.println("Name : " + name);  
        System.out.println("ID : " + id);  
        System.out.println("Department : " + dep);  
        System.out.println("Gross Salary : " + BasicSalary + BasicSalary*0.1 + BasicSalary * 0.15);
    }  
}