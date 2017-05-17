package com.viashare.read;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Jeffy on 16/5/17.
 */
public class ReadMain {

    private static final String READ_PATH = "/Users/jeffy-pc/Downloads/test.txt";
    private static final String WRITE_PATH = "/Users/jeffy-pc/Downloads/test2.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
//        bufferRead();
//        ByteReader();
//        randomRead();

        readAndCopy();
    }

    private static final void bufferRead() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(READ_PATH));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while((line = input.readLine())!=null){
            sb.append(line);
        }
        if(input != null){
            input.close();
        }
        System.err.println(sb.toString());
    }

    private static final void ByteReader() throws IOException {
        File file = new File(READ_PATH);
        InputStream in = new FileInputStream(file);
        System.err.println(convertStreamToString(in));
        in.close();
    }

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    private static final  void randomRead() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(READ_PATH,"r");
        long length = randomAccessFile.length();
        randomAccessFile.seek(0);
        byte[] bytes = new byte[1024];
        int readByte = 0;
        while((readByte = randomAccessFile.read(bytes)) != -1){
            System.out.write(bytes, 0, readByte);
        }
        if(null != randomAccessFile){
            randomAccessFile.close();
        }

    }


    private static final void readAndCopy() throws URISyntaxException, IOException {
        Files.lines(Paths.get(READ_PATH), StandardCharsets.UTF_8).forEach(System.out::println);
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(WRITE_PATH), StandardCharsets.UTF_8);
        writer.write(new String(Files.readAllBytes(Paths.get(READ_PATH))));
        writer.flush();
    }
}
