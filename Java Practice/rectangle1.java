import java.util.Scanner;

interface  sshape{
    default void GetArea(int len,int bre){
        System.out.println("Roshan");

    }}

public class rectangle1 implements  sshape{
    public void  GetArea(){
        System.out.println("Welcom");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        rectangle1 obj=new rectangle1();
        obj.GetArea();
    
    }
}