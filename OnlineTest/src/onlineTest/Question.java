package onlineTest;

public class Question implements Comparable<Question> {

	protected int questionNumber;
	protected double points;
	protected String text;

	public Question(int questionNumber, String text, double points) {
		this.questionNumber = questionNumber;
		this.text = text;
		this.points = points;
	}

	public int getQuestionNumber() {
		return this.questionNumber;
	}

	public double getPoints() {
		return this.points;
	}

	public String toString() {
		String results = "";

		results = "Question Text: " + this.text + "\n";
		results += "Points: " + this.points + "\n";
		return results;
	}

	public int compareTo(Question obj) {
		if (this.questionNumber > obj.questionNumber) {
			return 1;
		} else if (this.questionNumber == obj.questionNumber) {
			return 0;
		}
		return -1;
	}

}
