import java.util.Scanner;
public class resort {
    private  String name;
    private  int noroom;
    private int age;
    private int days;
    private double charges;
    private  double compute(int days,double charges){ 
        double a = days*charges;
            if(a>11000){
                a=1.02*days*charges;
            }
            return a;
            }
            public void getinfo(){
                Scanner s = new Scanner(System.in);
                System.out.println("enter");
                this.name=s.next();
                this.age=s.nextInt();
                this.noroom=s.nextInt();
                this.charges=s.nextDouble();
                this.days=s.nextInt();
            }


    public void resortdetail(){
        System.out.println("enter name:" + this.name);
        System.out.println("enter noroom:" + this.noroom);
        System.out.println("enter age:" + this.age);
        System.out.println("enter days:"+this.days);
        System.out.println("enter charges:"+this.charges);


    }

    public static void main(String[] args) {
        resort e =new resort();
     
        
        e.getinfo();
        e.resortdetail();
    }
}
