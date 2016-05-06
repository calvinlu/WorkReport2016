import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOJavaTest {

    public static void main(String[] args) {
        String fileName = "DataFile.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null){
                FileLine myFileLine = new FileLine(line);
                System.out.println(myFileLine.getLineArrayString()[0]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}