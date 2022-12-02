import java.util.ArrayList;

public class Element {
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        int sum=0;
        System.out.println(ar);
        System.out.println("list of odd numbers from 1 to "+10+" ,");
        for(Integer i:ar) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i+"");
            }
        }
        System.out.println(sum+"");
        }

}
