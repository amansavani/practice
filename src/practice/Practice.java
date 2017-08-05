
package practice;
import java.util.Scanner;
public class Practice {
    
    void test()
    {
        int a=5,r=6;
        int x=(a>r)?20:30;
        System.out.println(x);
    }
    void looptest()
    {
     String names[]={"aman","sahil","savani"};
     for(String x:names)
     {
         System.out.print(x+";");
     }
     test();
     //switcht();
    }
    void switcht()
    {
        char grade='a';
        switch(grade)
        {
            case 'a':System.out.println("nahi hoga");
            case 'c':System.out.println("hoga");break;
            case 'd':System.out.println("nahi hoga");
            default:System.out.println("aman hai");
            
                
        }
    }
    public static void main(String[] args) {
      /* Scanner s=new Scanner(System.in);
       System.out.println("enter your gre marks");
       int marks=s.nextInt();
       System.out.println(marks);
       System.out.println("hello world");
       Puppy m=new Puppy("nigga");
       m.setage(5);
       m.getage();
       emp a=new emp("aman",20);
       a.print();
       a.age=3;
       a.print();
       
       Practice asd=new Practice();
       //asd.test();
      // asd.looptest();
       //maths c=new maths();
       //c.letsp();
      */
       String x="5";
      //int x=Integer.parseInt("5");
      System.out.println(x+3);
    }
    
}
class Puppy
{
    int page;
    Puppy(String name)
    {
        System.out.println("name passed is "+name); 
    }
    void setage(int n)
    {
        page=n;
    }
    void getage()
    {
        System.out.println(page);
    }
    
}