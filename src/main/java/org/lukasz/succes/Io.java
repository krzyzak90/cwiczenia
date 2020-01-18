package org.lukasz.succes;

import javax.xml.xpath.XPath;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Io {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(200);
        baos.write(201);
        baos.write(202);
        byte[] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//        int read1 = bais.read();
//        System.out.println(read1);
        byte[] buf = new byte[1024];
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        int read;
        while ((read = bais.read(buf)) != -1) {
            baos2.write(buf, 0, read);
        }
        byte[] wszystkie = baos2.toByteArray();
        System.out.println(Arrays.toString(wszystkie));

        Path path = Paths.get("help.txt");

        OutputStream outputStream = Files.newOutputStream(path);
        outputStream.write(65);
        outputStream.write(66);
        outputStream.write(67);
        outputStream.write(68);
        outputStream.close();

        InputStream inputStream = Files.newInputStream(path);
        byte[] bytes1 = new byte[4];
        inputStream.read(bytes1);
        for (int i = 0; i < 4; i++) {
            System.out.println(inputStream.read());
        }
        inputStream.close();
        Path path1 = Paths.get("Input.txt");
        Path path2 = Paths.get("Output.txt");
        BufferedReader reader = Files.newBufferedReader(path1);
        char[] cbuf = new char[4];
        int ilośćOdczytanych;
        StringBuilder sb = new StringBuilder();
        while ((ilośćOdczytanych = reader.read(cbuf)) != -1) {
            sb.append(cbuf, 0, ilośćOdczytanych);
        }
        String zawartość = sb.toString();
        System.out.println(zawartość);
        reader.close();


        BufferedWriter writer = Files.newBufferedWriter(path2,
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE);

        writer.write(zawartość);
        writer.close();

    }
}

