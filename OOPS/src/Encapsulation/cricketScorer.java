package Encapsulation;

public class cricketScorer {
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score + score;
	}

	public void six() {
		addRuns(6);
	}

	public void four() {
		addRuns(4);
	}
	
	public void twos() {
		addRuns(2);
	}
	
	public void threes() {
		addRuns(3);
	}
	
	public void fives() {
		addRuns(5);
	}

	public void single() {
		addRuns(1);
	}

	public void printScore() {
		System.out.println("Score : " + score);
	}

}
