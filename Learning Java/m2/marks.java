package m2;

import m1.Student;
public class marks extends Student {
    public int a,b,c;
    public void getmarks(String name,int id,int a,int b,int c){
        getInfo(id,name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
