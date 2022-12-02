import java.util.Scanner;
public class CourseObject {
    public static void main(String args[]){
        int courseId=0;
        String courseName=null;
        double fee;
        Scanner sc=new Scanner(System.in);
        String[] courseDetails =new String[5];
        String[] cd1=new String[5];
        String[] fee1=new String[5];
        for(int i=0;i<2;i++){
            System.out.println("enter the course details");
            courseDetails[i]=sc.nextLine();
            System.out.println("enter the course id");
            cd1[i]=sc.nextLine();
            System.out.println( "enter course fee");
            fee1[i]=sc.nextLine();

        }
        for(int i=0;i<2;i++){
            System.out.println(courseDetails[i]);
            System.out.println(cd1[i]);
            System.out.println(fee1[i]);
        }

    }
}
