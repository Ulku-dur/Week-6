import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/Users/ulkudurmaz/Desktop/IdeaProjects/Patika/Week-6/ReadFileDemo/ReadFile/src/numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line.trim());
            }
            System.out.println("result: " +total);
        } catch (IOException e ) {
            System.err.println("Error closing the file reader: " + e.getMessage());
        }
    }
}