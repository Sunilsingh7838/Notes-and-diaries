import java.io.BufferedWriter;
import java.io.FileWriter;

public
class IO_Write {
    public static
    void main(String[] args) {
        // I/O write
        FileWriter location = null;
        try {
             location = new FileWriter("output.txt");
            BufferedWriter writer = new BufferedWriter(location);
            writer.write("Hello! Streams....");
            writer.newLine();
            writer.write("Hello Sunil");
            writer.close();
            System.out.println("Data Inserted.....");
        }catch (Exception e){
            System.out.println("Error : " + e);
        }
    }
}
