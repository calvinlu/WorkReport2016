import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOJavaTest {

    public static void main(String[] args) {
        String fileName = "DataFile.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            //skip first line header
            String line = br.readLine();
            long startTime = System.currentTimeMillis();
            while ((line = br.readLine()) != null){
                FileLine myFileLine = new FileLine(line);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("IO Read Time: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}