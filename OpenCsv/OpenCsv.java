import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import com.opencsv.*;

public class OpenCsv {
        private static final String CSV_FILE_PATH ="E:\\OpenCsv.csv";
        public static void readDataLineByLine(String file)
        {
            try {
                FileReader filereader = new FileReader(file);
                CSVReader csvReader = new CSVReader(filereader);
                String[] nextRecord;
                while ((nextRecord = csvReader.readNext()) != null) {
                    for (String cell : nextRecord) {
                        System.out.print(cell + "\t");
                    }
                    System.out.println();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    public static void writeData() throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH));
        String[] r = "Name,Email,PhoneNum,Country".split(",");
        String[] r1= "Afsar,afsar720@gmail.com,8118838819,India".split(",");
        String[] r2= "Geeth,geeth15@gmail.com,9128394393,India".split(",");
        String[] r3= "Mohan,mohan09@gmail.com,6328394393,India".split(",");
        String[] r4= "Narayan,nara15@gmail.com,878394393,India".split(",");

        writer.writeNext(r);
        writer.writeNext(r1);
        writer.writeNext(r2);
        writer.writeNext(r3);
        writer.writeNext(r4);

        writer.close();
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Write data Successfully");
        writeData();
        System.out.println();
        System.out.println("--------------Reading Data From CSV_FILE---------------");
        readDataLineByLine(CSV_FILE_PATH);



    }
}



