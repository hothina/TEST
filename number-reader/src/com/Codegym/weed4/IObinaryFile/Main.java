package com.Codegym.weed4.IObinaryFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buff = new byte[1024];
            int length;
            while ((length = is.read(buff))>0){
                os.write(buff,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7File(sourceFile,destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe){
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }

}
