
import java.util.Scanner;

public class Branch {
public static void main (String[] args){
    System.out.println("Enter the num: ");
    Scanner Sc = new Scanner(System.in);
    int num = Sc.nextInt();
    if (num==1)
    System.out.println(" This is a Sunday");
    else if (num==2)
        System.out.println("This is a Monday");
    else if (num==3)
        System.out.println("This is a Tuesday");
    else if (num==4)
        System.out.println("This is a Wednesday");
    else if (num==5)
        System.out.println("This is a Thursday");
    else if (num==6)
        System.out.println("This is a Friday");
    else if (num==7)
        System.out.println("This is a Saturday");


}

}
