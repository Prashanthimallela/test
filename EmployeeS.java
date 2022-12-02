import java.util.ArrayList;

public class EmployeeS {
    public static void main(String[] args){
        ArrayList<String> str =new ArrayList<>();
        str.add("rama");
        str.add("shiva");
        str.add("sai");
        str.add("john");
        str.add("sam");
        System.out.println(str);
        for (String s:str)
        {
            if(s.startsWith("s"))
            {
                System.out.println(s);
            }
        }




    }




}
