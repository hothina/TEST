package com.Codegym.week2.TDD.FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number%3 ==0;
        boolean isBuzz = number%5==0;
        if(isBuzz && isFizz) return "FizzBizz";
        if(isBuzz) return "Buzz";
        if(isFizz) return "Fizz";
        return readNumber100(number);
    }


    public static String readNumber100(int number) {
        boolean isNumDivision10AndBiger10 = number % 10 == 0 && number != 10;
        boolean isNumSmaller10 = number < 10;
        boolean is10 = number == 10;
        boolean isNum11To19 = number > 10 && number < 20;

      if(isNumDivision10AndBiger10) return readNumSmaller10(number/10) + "mươi";
      if(is10) return "mười";
      if(isNumSmaller10) return readNumSmaller10(number);
      if(isNum11To19) return "mười" + readNumSmaller10(number%10);
      return readNumSmaller10(number/10) + "mươi" + readNumSmaller10(number%10);

    }

    public static String readNumSmaller10(int number) {
        String str ="" ;
        switch (number) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str ;

    }
}
