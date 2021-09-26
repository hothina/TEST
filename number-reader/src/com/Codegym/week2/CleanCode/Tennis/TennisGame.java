package com.Codegym.week2.CleanCode.Tennis;

public class TennisGame {

    public static final int loveAll = 0;
    public static final int fifteenAll = 1;
    public static final int thirtyAll = 2;
    public static final int fortyAll = 3;
    public static String score = "";
    public static int tempScore = 0;
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Socre) {
       
        if (player1Name == player2Name)
        {
            switch (player1Score)
            {
                case loveAll:
                    score = "Love-All";
                    break;
                case fifteenAll:
                    score = "Fifteen-All";
                    break;
                case thirtyAll:
                    score = "Thirty-All";
                    break;
                case fortyAll:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1Score>=4 || player1Score>=4)
        {
            int minusResult = player1Score-player1Score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { score+="-"; tempScore = player1Score;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
