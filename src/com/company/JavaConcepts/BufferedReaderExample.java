package com.company.JavaConcepts;

import java.io.*;

public class BufferedReaderExample {
    public static void readInput() throws IOException {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("/Users/kumar2.sanu/Desktop/BlackBird/src/com/company/JavaConcepts/PrimitiveDataTypes.txt"));
            String line;

            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
