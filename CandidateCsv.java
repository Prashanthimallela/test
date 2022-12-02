import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CandidateCsv {
        public static void main(String args[]) throws IOException {
            String line = "";
            BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
            while((line = reader.readLine())!=null){

                String[] employee = line.split(",");
                System.out.println("Candidatename"

                        + ",Phone Number="+employee[3]+ ",Salary="+employee[4]
                        + ",Address="+employee[5]);

            }
        }

}
