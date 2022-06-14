package com.java.zakhar.IOService;

import java.io.*;
import java.nio.file.Path;

public class FileSystemIoService implements IIoService{
    final private String storageDirectory;

    public FileSystemIoService(String storageDirectory) {
        this.storageDirectory = storageDirectory;
    }

    @Override
    public String[] listFiles()
    {
        File dir = new File(storageDirectory);
        File [] files = dir.listFiles();
        String[] fileNames = new String[files.length];
        for(int i=0; i<files.length; i++)
            fileNames[i] = files[i].getName();
        return fileNames;
    }

    @Override
    public BufferedReader openFile(String fileName) throws FileNotFoundException {
        String filePath = Path.of(storageDirectory, fileName).toString();
        return new BufferedReader(new FileReader(filePath));
    }

    @Override
    public PrintWriter createFile(String fileName) throws IOException {
        String filePath = Path.of(storageDirectory, fileName).toString();
        return new PrintWriter(new FileWriter(filePath));
    }

    public void ensureFolderExist() {
        File f = new File(storageDirectory);
        if (f.exists() && f.isDirectory())
            return;
        f.mkdir();
    }
}
