/*
* Author:		Kimberlly Salinas 
* Date:			October 12, 2020 
* Course: 		CSC 210, Professor Anjum
* Description: 	This program will tell you your achieved letter grade. 
* 				It calculates your grade point average by dividing grade points 
* 				by the number of classes. 
* 				Based on your grade point average, it tells you your letter grade. 
*/
import javax.swing.JOptionPane; // package needed to create a dialog box to display
								// messages to the user

public class GPACalculator	
{
 public static void main(String args[])
 {
 int classes;	 
 double grades = 0.0;
 String inputString;
 double gradeValue;
 String gradeInputString;
 double gpa;
		 
 inputString = JOptionPane.showInputDialog("How many courses have "+ 
		 "you taken? ");
 classes = Integer.parseInt(inputString); // converting string input to integer
	
 // use input needed to determine grade points		 
 for (int i = 1; i <= classes; i++) {
	gradeInputString = JOptionPane.showInputDialog("Please enter your "+ ""
			+ "grade for class " + i + " (A, B, C, D, F)");		
	gradeValue = 0.0;
			 
 if (gradeInputString.equals("A"))  
	{
	 gradeValue = 4.00;
	 grades += gradeValue;
	}
 if (gradeInputString.equals("B")) {
	gradeValue = 3.00;
	grades += gradeValue;
	}
 if (gradeInputString.equals("C")) {
	gradeValue = 2.00;
	grades += gradeValue;
	}
 if (gradeInputString.equals("D")) {
	gradeValue = 1.00;
	grades += gradeValue;
	} 
 if (gradeInputString.equals("F")) {
	gradeValue = 0.00;
	grades += gradeValue;
	}
    }
	gpa = grades/classes; // algorithm for calculating GPA

	JOptionPane.showMessageDialog(null, "Your GPA is: "+ gpa);
		 	
 if (gpa <= 4.0 && gpa >= 3.5)
	JOptionPane.showMessageDialog(null, "Your grade is A");
 else if (gpa <= 3.49 && gpa >= 2.5)
	JOptionPane.showMessageDialog(null, "Your grade is B");
 else if (gpa <= 2.49 && gpa >= 1.5)
	JOptionPane.showMessageDialog(null,  "Your grade is C");
 else if (gpa <= 1.49 && gpa >= 1.0)
	JOptionPane.showMessageDialog(null, "Your grade is D"); 
 else if (gpa <= 0.99 && gpa >= 0.00)
	JOptionPane.showMessageDialog(null, "Your grade is F");
else if (gpa < 0.00 && gpa > 4.0)
	JOptionPane.showMessageDialog(null, "Invalid Input");
	 }
}
