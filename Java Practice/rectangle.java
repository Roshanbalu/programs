import java.util.Scanner;
class Shape{
    public int GetArea(int len,int bre){
        return len*bre;

    }
}
public class rectangle extends Shape{
    public int GetArea(int len,int bre){
        return super.GetArea(len,bre);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        rectangle obj=new rectangle();
        System.err.println("shape"+obj.GetArea(len, bre));
    
    }
}