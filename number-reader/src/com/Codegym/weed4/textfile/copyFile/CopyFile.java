package com.Codegym.weed4.textfile.copyFile;

import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("readFile.txt");
        for (String e : list) {
            readAndWriteFile.writeFile("copyfile.txt", e);

        }
    }
}
