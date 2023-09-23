package com.upskill.java_2;

public class IfElseStatement {
//Conditional Statement - Unknown Data
	public static void main(String[] args) {
    int percentage = 75;
    if (percentage >= 90){
    System.out.println("Grade A");
    } else if (percentage >= 75){
    System.out.println("Grade B");
    } else if (percentage >= 65){
    System.out.println("Grade C");
    }else {
    System.out.println("Grade D");
    }
	}

}
//For example, assigning grades (A, B, C) based on the 
//percentage obtained by a student.
//
//if the percentage is above 90, assign grade A
//if the percentage is above 75, assign grade B
//if the percentage is above 65, assign grade C
