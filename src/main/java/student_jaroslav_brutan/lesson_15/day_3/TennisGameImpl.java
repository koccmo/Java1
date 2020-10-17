package student_jaroslav_brutan.lesson_15.day_3;

public class TennisGameImpl implements TennisGame{

    private String firstPlayer;
    private String secondPlayer;
    private int firstPlayerScored;
    private int secondPlayerScored;

    public TennisGameImpl(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    @Override
    public void wonPoint(String playerName){
        if (playerName.equals(firstPlayer)){
            firstPlayerScored++;
        } else {
            secondPlayerScored++;
        }
    }

    @Override
    public String score(){
        if (firstPlayerScored > 4){
            if (firstPlayerScored - secondPlayerScored >=2){
                return firstPlayer + " wins the set!";
            }
        }
        if (secondPlayerScored >4){
            if (secondPlayerScored - firstPlayerScored >=2){
                return secondPlayer + " wins the set!";
            }
        }
        if ((firstPlayerScored >=1) && (secondPlayerScored >=1)){
            if (firstPlayerScored == secondPlayerScored)
                return "Deuce";
            if (firstPlayerScored > secondPlayerScored)
                return "Advantage" + firstPlayer;
            return "Advantage" + secondPlayer;
        } else {
            return numberToStringScore(firstPlayerScored) + "" + numberToStringScore(secondPlayerScored);
        }
    }

    private String numberToStringScore(int number){
        if (number == 0) return "Love";
        if (number == 1) return "Fifteen";
        if (number == 2) return "Thirty";
        return "Forty";
    }
}
