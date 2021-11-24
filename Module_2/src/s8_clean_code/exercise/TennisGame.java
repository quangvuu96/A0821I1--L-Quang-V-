package s8_clean_code.exercise;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore = 0;
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            score = getResult(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            score = getScore(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            score = getResult(scoreOfPlayer1, scoreOfPlayer2, score);
        }
        return score;
    }

    private static String getResult(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1) {
            case ZERO:
                score = "Love-All";
                break;
            case ONE:
                score = "Fifteen-All";
                break;
            case TWO:
                score = "Thirty-All";
                break;
            case THREE:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

    }
        return score;
    }

    private static String getResult(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case ZERO:
                    score += "Love";
                    break;
                case ONE:
                    score += "Fifteen";
                    break;
                case TWO:
                    score += "Thirty";
                    break;
                case THREE:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getResult(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
