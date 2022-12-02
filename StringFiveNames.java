import java.util.Scanner;
public class StringFiveNames {
    public static void main(String[] args) {
        System.out.println("Enter Five names");
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        
        for (int i = 0; i < 5; i++) {
            Scanner s1 = new Scanner(System.in);
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        /*int k=0;
        for(int i=0; i<5;i++){
            if(names[i].startsWith("A")){
                System.out.println(" aName[1]");*/
        }
    }
}
