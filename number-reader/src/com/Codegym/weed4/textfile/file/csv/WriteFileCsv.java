package com.Codegym.weed4.textfile.file.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFileCsv {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) {

        String fileName = "contries.csv";
        writeFileCsv(fileName);
    }

    public static void writeFileCsv(String fileName) {
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");

        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Country country : countries) {
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("csv file was created successfully");

        } catch (Exception e) {
            System.out.println("error in csv file");
            e.getStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }


    }
}
