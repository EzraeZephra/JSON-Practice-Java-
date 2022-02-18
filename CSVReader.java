import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

class CSVReader {
    private int index;
    ArrayList<String> allLines = new ArrayList<String>();
    File myFile;

    public CSVReader(String path) {
        myFile = new File(path);
    }

    public void addToArrayList() throws FileNotFoundException {
        Scanner input = new Scanner(myFile);
        while (input.hasNext()) {
            allLines.add(input.nextLine());
        }
        input.close();
    }

    public void readNextLine() throws FileNotFoundException {
        index++;
        System.out.println(allLines.get(index));
    }

    public String getColumn(int n) {
        String data = allLines.get(index);
        if (n != 1) {
            for (int i = 1; i < n; i++) {
                data = data.substring(data.indexOf(",")+1);
            }  
        }
        data = data.substring(0,data.indexOf(","));

        return data;
    }
}
