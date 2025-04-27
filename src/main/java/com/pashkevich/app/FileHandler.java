package com.pashkevich.app;

import java.io.*;

public class FileHandler {

    public void writeFile(String fileContent, File filePath) {
        if (filePath.canWrite()) {
            try (FileWriter fileWriter = new FileWriter(filePath.getAbsoluteFile())){
                fileWriter.write(fileContent);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String readFile(File filePath) {
        StringBuilder stringBuilder = new StringBuilder();
        if (filePath.canRead()) {
            try {
                int res;
                FileReader fileReader = new FileReader(filePath);
                while ((res = fileReader.read()) != -1) {
                    stringBuilder.append((char) res);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringBuilder.toString();
    }
}