package example;

public class Student {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        if(newScore >= 0 && newScore <= 100) {
            this.score = newScore;
        }else {
            System.out.println("Invalid score");
        }
    }
}
