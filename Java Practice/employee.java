import java.util.*;
public class employee {
    String name;
    int salary;
    int age;

    employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void emplodetail() {
        System.out.println("enter name:" + name);
        System.out.println("enter salary:" + salary);
        System.out.println("enter age:" + age);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        employee e= new employee(s.next(),s.nextInt(),s.nextInt());
        e.emplodetail();
    }
}