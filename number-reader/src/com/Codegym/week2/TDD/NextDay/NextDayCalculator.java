package com.Codegym.week2.TDD.NextDay;

public class NextDayCalculator {
   public static String nextDay(int day,int month, int year) {
       String nextDay = "";
       boolean isYear = year > 0;
       boolean isMonth = month >= 1 && month <= 12;
       if (isYear) {
           if (isMonth) {
               int numDay = numberDayMonth(month, year);
               boolean isDayMonth = day <= numDay && day >= 1;
               boolean isLastDayMonth = day == numDay;
               boolean isLastMonthYear = month == 12;
               if (isDayMonth) {
                   if (isLastDayMonth) {
                       nextDay += 1 + "-";
                       if (isLastMonthYear) {
                           nextDay += 1 + "-" + (year + 1);
                       } else nextDay += (month + 1) + "-" + year;
                   } else nextDay = (day + 1) + "-" + month + "-" + year;
               }
           }
       }
       return nextDay;
   }

   public static boolean isLeapYear(int year){
       boolean isDivision400 = year % 400 == 0;
       boolean isDivision100 = year %100 == 0;
       boolean isDivision4 = year % 4 ==0;
       if((isDivision4 && !isDivision100) || isDivision400)
           return true;
       return false;

       }

    public static int numberDayMonth(int month, int year) {
        int numDay;
        switch (month) {
            case 2:
                if (isLeapYear(year)) numDay = 29;
                else numDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDay = 30;
                break;
            default:
                numDay = 31;
        }
        return numDay;
    }



}
