
import java.util.Scanner;
public class MailArray {
    public static void main(String[] args) {
        String[] s = new String[4];
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 email address");
        for (int i = 0; i < 4; i++) {

            s[i] = sc.nextLine();
            if(s[i].contains("gmail"))
            {
                c++;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(s[i]);
        }
        int  j=0;
        int k=0;
        String[] arr2=new String[c];
        String[] arr3=new String[4-c];
        for (int i = 0; i < 4; i++) {
            if(s[i].contains("gmail")){
                arr2[j]=s[i];
                System.out.println(arr2[j]);
                j++;
            }
            if(s[i].contains("yahoo")){
                arr3[k]=s[i];
                System.out.println(arr3[k]);
                k++;
            }

        }

    }
}


