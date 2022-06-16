package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PlantsWriter {
    public void writeToFile(List<Plants> list) {
        try(FileOutputStream fos=new FileOutputStream("outFile.txt");
            PrintWriter writer = new PrintWriter(fos))
        {
            for(int i=0;i<list.size();i++) {
                writer.println(list.get(i).getHeaders());
                writer.println(list.get(i).toCSV());
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
