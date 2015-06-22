package onlineTest;

import java.util.ArrayList;
import java.util.Collections;

public class FillBlankQuestion extends Question {
	
	protected String[] answer;
	
	public FillBlankQuestion(int questionNumber, String text, double points, String[] answer) {
		super(questionNumber, text, points);
		this.answer=answer;
	}
	
	public int getQuestionNumber(){
		return super.getQuestionNumber();
	}
	
	public double getPoints(){
		return super.getPoints();
	}
	
	public ArrayList<String> getAnswer() {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < answer.length; i++) {
			temp.add(answer[i]);
		}
		return temp;
	}
	
	public String toString(){
		ArrayList<String> temp = new ArrayList<String>();
		for(int i =0; i < answer.length; i++){
			temp.add(answer[i]);
		}
		Collections.sort(temp);
		return super.toString() + "Correct Answer: " + temp;
	}
	
	public int compareTo(FillBlankQuestion obj) {
		if (super.getQuestionNumber() > obj.getQuestionNumber()) {
			return 1;
		} else if (super.getQuestionNumber() == obj.getQuestionNumber()) {
			return 0;
		}
		return -1;
	}

}
