import java.util.*;

class Employee{
    private int id;
    private String name, dept;
    private float sal;
    Employee(){
        this.id=0;
        this.name="xyz";
        this.dept="abc";
        this.sal=0.0f;
    }
    Employee(int id, String name, String dept, float sal){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
    }

    float retsal(){
        //static variable here to automatically access 1...n salary
        float ret=sal;
        return ret;
    }
    void dis(){
        System.out.println("Name of employee is "+name+", his id "+id+", his department "+dept+"\n his salary= "+sal);
    }
}
class Manager extends Employee{
    private float bonus;
    Manager(){
        super();
        this.bonus=0;
    }
    Manager(float bonus, int id, String name, String dept, float sal){
        super(id,name,dept,sal);
        this.bonus=bonus;
    }

    void dis(){
        super.dis();
        System.out.println("bonus= "+bonus);
    }

    void calsal(Manager ob[]){
        int cnt=0;
        float max=0.0f;
        for (int i = 0; i < ob.length; i++) {
            float sal=retsal();//incomplete
            if(sal>max){
                cnt++;
                max=sal;
            }
        }
        System.out.println("The maximum salary is "+max+" and the employee details are ");
        ob[cnt].dis();
            
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many employees are there");
        int n=sc.nextInt();
        Manager[] m=new Manager[n];
        System.out.println("Enter the details of "+n+" employees");
        for (int i = 0; i < n; i++) {
            System.out.println("His id= ");
            int id=sc.nextInt();
            System.out.println("His name= ");
            String name=sc.next();
            System.out.println("His working department");
            String dept=sc.next();
            System.out.println("His salary= ");
            float sal=sc.nextFloat();
            System.out.println("his bonus= ");
            float bonus=sc.nextFloat();
            m[i]=new Manager(bonus, id, name, dept, sal);
        }
        m[0].calsal(m);
        sc.close();
    }
}