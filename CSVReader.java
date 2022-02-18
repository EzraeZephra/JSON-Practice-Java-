import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

class CSVReader {
    protected String currentLine;
    protected String line;
    protected Scanner input;
    protected Formatter output;
    File myFile;

    public CSVReader(String path) throws FileNotFoundException {
        myFile = new File(path);
        input = new Scanner(myFile);
        output = new Formatter(myFile);
    }

    public void readNextLine() throws FileNotFoundException {
        currentLine = input.nextLine();
        System.out.println(currentLine);
    }

    public String getColumn(int n) {
        String data = currentLine;
        if (n != 1) {
            for (int i = 1; i < n; i++) {
                data = data.substring(data.indexOf(",")+1);
            }  
        }
        data = data.substring(0,data.indexOf(","));

        return data;
    }

    public void writeLine(String input) {
        output.format("input" + ",");
    }
    
    public void closeThings(){
        input.close();
        output.close();
    }
}
