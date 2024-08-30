// n cricket players
// meme - pid, name, total_runs, inn_played, not_out_times
// calc - average of all players, diplay details having max average
import java.util.Scanner;
class ass2c3{
    int pid;
    String name;
    int tr, inp, not;
    float avg;
    ass2c3(){
        this.pid=0;
        this.name="xyz";
        this.tr=0;
        this.inp=0;
        this.not=0;
    }
    ass2c3(int pid, int tr, int inp, int not, String name){
        this.pid=pid;
        this.name=name;
        this.tr=tr;
        this.inp=inp;
        this.not=not;
        average();
    }
    void average(){
        avg=(float)tr/inp;
        System.out.println("Average is "+avg);
    }
    static void max(ass2c3 ob[]){
        float max=Float.MIN_VALUE;
        int count=0;
        for (int i = 0; i < ob.length; i++) {
            if(ob[i].avg > max){
                max=ob[i].avg;
                count=i;
            }
        }
        System.out.println("The player with most average run is "+max);
        ob[count].display();
    }
    void display(){
        System.out.println("Name= "+name+"\n Pid= "+pid+"\n Total"+tr+"\n Innings played= "+inp+"\nNumber of not outs= "+not);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of players");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ass2c3[] a=new ass2c3[n];
        for (int i = 0; i < n; i++) {
            String name=sc.next();
            int pid=sc.nextInt();
            int tr=sc.nextInt();
            int inp=sc.nextInt();
            int not=sc.nextInt();
            a[i]=new ass2c3(pid, tr, inp, not, name);
        }
        max(a);
        sc.close();
    }
}