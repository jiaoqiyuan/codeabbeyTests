package DecoratorPattern;

import java.io.*;

public class SimpleIO {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("patterns/src/main/resources/data");
        InputStream in = new BufferedInputStream(inputStream);
        DataInputStream di = new DataInputStream(in);
        byte data[] = new byte[di.available()];
        while (di.read(data) != -1) {
            System.out.println(new String(data));

        }
    }
}
