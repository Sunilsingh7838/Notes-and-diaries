import java.io.BufferedReader;
import java.io.FileReader;

public
class IO_read {
    public static
    void main(String[] args) {
        //reading a file

        try {
            FileReader file = new FileReader("output.txt");
        BufferedReader reader = new BufferedReader(file);
        String text;
        while((text = reader.readLine()) != null){
            System.out.println(text);
        }
        reader.close();
        }catch (Exception e){
            System.out.println("Error : " + e);
        }
    }
}
