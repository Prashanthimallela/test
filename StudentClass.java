import java.util.ArrayList;
import java.util.Scanner;
public class StudentClass {


    public static <list, students> void main(String[] args) {
        int StdId;
        String Stdname;
        int Stdage;
        String StdClgname;
        Student2 s1=new Student2(1,"pras",21,"sphn");
        Student2 s2=new Student2(2,"sravs",22,"sphn");
        Student2 s3=new Student2(3,"megh",23,"gnpt");
        Student2 s4=new Student2(4,"suppu",22,"jntu");
        Student2 s5=new Student2(5,"srija",22,"sphn");
        Student2 s6=new Student2(6," konda anna",22,"rlja");
        Scanner Sc=new Scanner(System.in);
        ArrayList<Student2> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        ArrayList<Student2> sameclglist=new ArrayList<>();
        System.out.println("enter the college name");
        String cname =Sc.next();
        for(Student2 student:students){
            Object cName = null;
            if(student.StdClgname.equalsIgnoreCase(cname))
            {
                sameclglist.add(student);
            }
        }
        
        for (Student2 std:sameclglist){
            System.out.println(std.Stdname+std.StdId+std.Stdage);
        }
        
        
    }
}
