import java.util.*;


class Employee {
    int eno;
    String ename;
    //float sal;
    Employee(){
        this.eno=0;
        this.ename="xyz";
    }   
    Employee(int eno, String ename){
        this.eno=eno;
        this.ename=ename;
    }

    void calsal(int gs){
        if(gs>=0&&gs<=300000){
            int ns=gs;
            System.out.println("Net Salary of employee is3: "+gs);
        }
        else if(gs>=300001&&gs<=1000000){
            float t=(float)(15.00/100.00)*gs;
            float ns=gs-t;
            System.out.println("Net Salary of employee is7: "+ns);
        }
        else{
            float t=(float)(30.00/100.00)*gs;
            float ns=gs-t;
            System.out.println("Net Salary of employee is11: "+ns);
        }
    }

    void display(){
        System.out.println("Details of employee are");
        System.out.println("Name: "+ename+"\nID: "+eno);
    }
}


class Manage extends Employee {
    int ta,da,hra,bs;
    int pf,pt;
    int gs;
    Manage(){
        super();
        this.bs=0;
        this.da=0;
        this.ta=0;
        this.hra=0;
    }
    Manage(int bs, int ta, int da, int hra, int pf, int pt, int eno, String ename){
        super(eno,ename);
        this.bs=bs;
        this.da=da;
        this.ta=ta;
        this.hra=hra;
        this.pf=pf;
        this.pt=pt;
    }
    int calsal(){
        int s=bs+da+ta+hra;
        int gss=s-pf-pt;
        return gss;
    }    
    void display(){
        super.display();
        System.out.println("bs: "+bs+"\nta: "+ta+"\nda: "+da+"\nhra: "+hra);
        gs=calsal();
        System.out.println("gross salary is "+gs);
        super.calsal(gs);
    }
}

class Wage extends Employee {
    int wage,hr,gs;
    Wage(){
        super();
    }
    Wage(int wage, int hr, int eno, String ename){
        super(eno, ename);
        this.wage=wage;
        this.hr=hr;
    }
    int calsal(){
        int s=hr*wage;
        return s;
    }
    void display(){
        super.display();
        System.out.println("wage: "+wage+"\nhr worked: "+hr);
        gs=calsal();
        System.out.println("gross salary is "+gs);
        super.calsal(gs);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Wage Employee or 2 for Manager Employee");
        int ch=sc.nextInt();
        switch(ch){
            case 1: 
                System.out.println("Enter details of wage employee");
                String wname=sc.next();
                int wno=sc.nextInt();
                int hr=sc.nextInt();
                int wage=sc.nextInt();
                Wage w  =new Wage(wage,hr,wno,wname);
                w.display();
                break;
            
            case 2: 
                System.out.println("Enter details of manager employee");
                String mname=sc.next();
                int mno=sc.nextInt();
                int bs=sc.nextInt();
                int ta=sc.nextInt();
                int da=sc.nextInt();
                int hra=sc.nextInt();
                int pf=sc.nextInt();
                int pt=sc.nextInt();

                Manage m  =new Manage(bs,ta,da,hra,pf,pt,mno,mname);
                m.display();
                break;
            
            default:
                System.out.println("Enter correct number");
                break;
        }
        sc.close();
    }
}

