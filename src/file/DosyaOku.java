package file;

import java.io.*;

public class DosyaOku {
    public static void main(String[] args) throws Exception {
        String path = "src/veri.txt"; // 👈 dosyanın tam yolu
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("📄 " + line);
        }
        reader.close();
    }
}
