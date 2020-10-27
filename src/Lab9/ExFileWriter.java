package Lab9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExFileWriter {
    public static void main(String[] args) {


        Path mypath = Paths.get("C:/Users/LabCom_MT-4/Documents/myFileCP/Test.txt");
        BufferedWriter Writer = null;
        try {
            Writer = Files.newBufferedWriter(mypath, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            Writer.write("Natsuda Thongsuk");
            Writer.newLine(); //ขึ้นบรรทัดใหม่


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}