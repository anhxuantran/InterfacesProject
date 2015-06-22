package tests;
import junit.framework.TestCase;
import onlineTest.*;
import java.util.*;

public class StudentTests extends TestCase{

	public void testAddTrueFalseQuestion(){
		SystemManager manager = new SystemManager();
		manager.addExam(10, "Midterm");
		manager.addTrueFalseQuestion(10, 1, "Is it A", 2.0, true);
		//System.out.println(manager.getKey(10));
	}
	
	public void testAddAnyTypeOfQuestion(){
		SystemManager manager = new SystemManager();
		manager.addExam(10, "Midterm");
		manager.addStudent("Bob");
		
		manager.addTrueFalseQuestion(10, 1, "blah", 1.0, false);
		manager.addMultipleChoiceQuestion(10, 2, "blah", 1.0, new String[]{"A"});
		//System.out.println(manager.getKey(10));
		
		//manager.answerMultipleChoiceQuestion("Bob", 10, 2, new String[]{"B"});
		//manager.answerTrueFalseQuestion("Bob", 10, 1, false);
		//System.out.println(manager.getGradingReport("Bob", 10));

	}
	
	public void testAnswerMultipleChoice(){
		SystemManager manager = new SystemManager();
		manager.addExam(10, "Midterm");
		manager.addStudent("Bob");
		manager.addMultipleChoiceQuestion(10, 1, "A or B", 1.0, new String[]{"A", "B"});
		manager.answerMultipleChoiceQuestion("Bob", 10, 1, new String[]{"B"});
		//System.out.println(manager.getGradingReport("Bob", 10));
	}
	
	public void testAddMultipleExams(){
		SystemManager manager = new SystemManager();
		assertTrue(manager.addExam(9, "Midterm 2"));
		assertTrue(manager.addExam(8, "Midterm"));
		
		//manager.addMultipleChoiceQuestion(10, 1, "A or B", 1.0, new String[]{"A", "B"});
		
		manager.addTrueFalseQuestion(9, 1, "blah", 1.0, false);
		manager.addMultipleChoiceQuestion(9, 2, "blah", 1.0, new String[]{"A"});
		//System.out.println(manager.getKey(10));
		//System.out.println();
		System.out.println(manager.getKey(9));
	}
	
	
}
