package com.Codegym.bt.thu2;

import java.util.Scanner;

public class ReadNumberLt {
    public static String unit(int input) {
        String letter = "";
        switch (input) {
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
            default:
                letter = " out of ability";
                break;

        }
        return letter;
    }

    public static String from10To20(int input) {
        String str = "";
        switch (input) {
            case 0:
                str = "teen";
                break;
            case 1:
                str = "eleven";
                break;
            case 2:
                str = "twelve";
                break;
            case 3:
                str = "thirteen";
                break;
            case 8:
                str = "eighteen";
                break;
            case 5:
                str = "fifteen";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
                str = String.format("%steen", unit(input));
                break;

        }
        return str;

    }

    public static String dozens(int input) {
        String letter = "";
        switch (input) {
            case 2:
                letter = "twenty";
                break;
            case 3:
                letter = "thirty";
                break;
            case 4:
                letter = "forty";
                break;
            case 5:
                letter = "fifty";
                break;
            case 8:
                letter = "eighty";
                break;
            case 6:
            case 7:
            case 9:
                letter = String.format("%sty", unit(input));
        }
        return letter;
    }

    public static String dozensDigitToLetter(int dozen) {
        String word = "";
        if (dozen >= 10 && dozen < 20)
            word = from10To20(dozen / 10);
        else if (dozen >= 20 && dozen < 100)
            word = dozens(dozen / 10);
        return word;
    }
    public static String hundredDigitToLetter(int hundred) {
        String word = " hundred ";
        word= unit(hundred)+word;
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        int hundered = number / 100;
        int dozen = number % 100;
        int unit = number % 10;
        String read = "";


        if (number>99){
            if(dozen==0 && unit ==0){
                read =hundredDigitToLetter(hundered);
            } if(unit ==0){
                read =  hundredDigitToLetter(hundered) + " and " + dozensDigitToLetter(dozen);
            }else
             read = hundredDigitToLetter(hundered)+ " and " + dozensDigitToLetter(dozen)+" " +unit(unit);
        } else if(number>=20 ){
            if(unit ==0){
                read = dozensDigitToLetter(dozen);
            }else {
                read = dozensDigitToLetter(dozen)+" "+unit(unit);
            }
        } else {
            if(number>=10){
                read = from10To20(unit);
            }else if(number == 0){
                System.out.println("zero");
            }else read = unit(unit);
        }

        System.out.println(read);






    }
}
