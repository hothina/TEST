package com.Codegym.week1.array;

public class CountCharInString {

    public static void main(String[] args) {
            String myString="Khai bao mot chuoi gia tri";
            char myChar='i';
            int count=0;
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i)==myChar)
                count++;
        }
        System.out.println("SO luong ki tu "+myChar+ ":"+count);

    }
}
