import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        File myFile = new File("test.dat"); //file creation
        if(!myFile.exists()) { //check to see if file exists, if not, creates a new one
            myFile.createNewFile();
        }

        Formatter output = new Formatter(myFile);
        output.format("Hello\n");
        output.format("from the Java Community");
        output.close(); //remember to close

        /*Scanner input = new Scanner(myFile);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();*/

        CSVReader myReader = new CSVReader("/Users/take/JSON-Practice-Java-/CSV TESTER - Sheet1.csv");
        myReader.addToArrayList();
        myReader.readNextLine();
        myReader.readNextLine();
        System.out.println(myReader.getColumn(3));

    }
}