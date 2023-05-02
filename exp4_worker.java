// Write a class Worker and derive classes DailyWorker and SalariedWorker from it.Every worker has a name and a salary rate. Write method ComPay (int hours) tocompute the week pay of every worker. A Daily Worker is paid on the basis of thenumber of days he/she works. The Salaried Worker gets paid the wage for 40 hours aweek no matter what the actual hours are. Test this program to calculate the pay ofworkers. You are expected to use the concept of polymorphism to write this program.
class worker{
    int compay(int day,int pay){
        return day*pay;
    }
    int compay(int pay){
        return 7*pay;
    }
}
class SalariedWorker extends worker{
    void  detail(){
        String name="mohan";
        int age=30;
        worker w1=new worker();
        int pay=3400;
        int cw=w1.compay(pay);
        System.out.println(name);
        System.out.println("calculate wage is = "+cw);
    }
}
class DailyWorker extends worker{
    void  detail(){
        String name="rohan";
        int age=30;
        worker w1=new worker();
        int pay=3400;
        int day=30;
        int cw=w1.compay(day,pay);
        System.out.println(name);
        System.out.println("calculate wage is = "+cw);
    }
}
public class exp4_worker {
    public static void main(String[] args) {
        SalariedWorker s1=new SalariedWorker();
        DailyWorker d1=new DailyWorker();
        s1.detail();
        d1.detail();
    }
}