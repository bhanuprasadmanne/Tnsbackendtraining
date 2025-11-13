import java.util.Scanner;
public class InputDemo{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your id:");
        int id=sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Your Address");
        String address=sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        sc.close();
        
    }
}