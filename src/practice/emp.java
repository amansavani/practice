
package practice;

class emp {
    String name;
    int age;
    emp(String nam,int n)
    {
        name=nam;
        age=n;
    }
    void print()
    {
        System.out.println("name is "+name);
        System.out.println("age is "+ age);
        Practice pr=new Practice();
        pr.test();
    }
    
}
