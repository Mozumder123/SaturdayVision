package com.upskill.assignment_3;

public class Assignment_3_3 {
	void displayInterestRate(){
      	System.out.println("Default interest rate is NONE");
	}

	public static void main(String[] args) {
		ChaseBank obj=new ChaseBank();
      	obj.displayInterestRate();
      	new CityBank().displayInterestRate();
      	new TDBank().displayInterestRate();
	}
}

class ChaseBank extends Assignment_3_3{
	void displayInterestRate(){
      	System.out.println("Chase Bank interest rate is 8%");
	}
}

class CityBank extends Assignment_3_3{
	void displayInterestRate(){
      	System.out.println("City Bank interest rate is 7%");
	}
}

class TDBank extends Assignment_3_3{
	void displayInterestRate(){
      	System.out.println("TD Bank interest rate is 9%");
	}
}



