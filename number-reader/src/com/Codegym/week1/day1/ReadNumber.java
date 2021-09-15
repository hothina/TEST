package com.Codegym.week1.day1;


import java.util.Scanner;

public class ReadNumber {
    public static String readOne(int a) {
        String str = "";
        switch (a) {
            case 1: {
                str = "one";
                break;
            }
            case 2: {
                str = "two";
                break;
            }
            case 3: {
                str = "three";
                break;
            }
            case 4: {
                str = "four";
                break;
            }
            case 5: {
                str = "five";
                break;
            }
            case 6: {
                str = "six";
                break;
            }
            case 7: {
                str = "seven";
                break;
            }
            case 8: {
                str = "eight";
                break;
            }
            case 9: {
                str = "nine";
                break;
            }

        }
        return str;
    }

    public static String read10_19(int a) {
        String str = "";
        switch (a) {
            case 0: {
                str = "teen";
                break;
            }
            case 1:
                str = "elevent";
                break;

            case 2:
                str = "twelve";
                break;

            case 3:
                str = "thirteen";
                break;

            case 5:
                str = "fifteen";
                break;

            case 8:
                str = "eighteen";
                break;

            case 6:
            case 7:
            case 4:
            case 9:
                str = readOne(a) + "teen";
                break;


        }
        return str;
    }

    public static String readGreater20(int a) {
        String str = "";
        switch (a) {
            case 2: {
                str = "twenty";
                break;
            }
            case 3: {
                str = "thirty";
                break;
            }
            case 5: {
                str = "fifty";
                break;
            }
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                str = readOne(a) + "ty";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        int weight;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight: ");
        weight = scanner.nextInt();
        int hundred = weight / 100;
        int dozens = weight % 100;
        int ones = weight % 10;
        String readH = "";
        String readD = "";
        if (weight != 0) {
            if (hundred != 0) {
                if (weight % 100 == 0) {
                    readH = readOne(hundred) + " hundred";
                } else {
                    readH = readOne(hundred) + " hundred and ";
                }
            }

            if (dozens >= 20) {
                if (ones != 0) {
                    readD = readGreater20(dozens / 10) + " " + readOne(ones);
                } else
                    readD = readGreater20(dozens / 10);
            } else {
                if (dozens >= 10) {
                    readD = read10_19(dozens % 10);
                } else {
                    if (ones != 0) {
                        readD = readOne(ones);
                    }

                }
            }
            System.out.print(weight + " read is '" + readH + readD + "' kg ");
        } else
            System.out.print(weight + " read is zero kg ");


    }

}
