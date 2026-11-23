package Mastery;


public class Bowler {
    private String name;
    private int totalScore;

    public Bowler(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    public void bowlFrame(int frameNumber) {
        Frame frame = new Frame();
        int score = frame.getScore();

        totalScore += score;

        System.out.println(name + " - Frame " + frameNumber + ": " + frame);
        System.out.println("Score this frame: " + score);
        System.out.println("Total score: " + totalScore);
        System.out.println("---------------------------");
    }

    public int getScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }
}