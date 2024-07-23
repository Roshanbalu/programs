interface Greeting{
    default void sayHello(){
        System.out.println("sayHello");

    }
}
class person implements Greeting{
    public void sayHello(){
        System.out.println("Wewghghfh");
    }
}
public class Main3{
    public static void main(String[]args){
        person P=new person();
        P.sayHello();
    }
}