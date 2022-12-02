import java.util.Scanner;
class Months
{
    public enum Month{
        january(1),
        febraury(2),
        March(3),
        April(4),
        May(5),
        June(6),
        July(7),
        August(8),
        Sepetmber(9),
        October(10),
        November(11),
        December(12);
    private int month;
    private Month(int month)
    {
        this.month=month;
        
    }
    }
    public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
       for (Month m : Month.values()) {
          if (m.month == x) {
             System.out.println(m);

        }
    }

  }
}