import java.util.Scanner;
import java.util.InputMismatchException;
public class CandidateClass {
    public static void main(String[] args) {
        String Name;
        String gender;
        double Salary;
        System.out.println("enter the name of the candidate");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("enter the gender of the candidate");
        String str = sc.next();
        System.out.println("enter the salary of the candidate ");
        double d = sc.nextDouble();
        System.out.println("name is:" + s + " " + "gender is:" + str + " " + "sal is: " + d);
        /*try {
            System.out.println(" enter the name ");
            Name = sc.next();
            boolean result=Name.matches("^[a-zA_Z]*$");
            if(!(result==true)) {
                throw new InputMismatchException();
            }
            System.out.println("enter the gender");
            gender = sc.next().charAt(0);
            if (!(gender == 'M' || gender =='F')) {
                throw new InputMismatchException("input invalid exception ");
            }*/
    }
}