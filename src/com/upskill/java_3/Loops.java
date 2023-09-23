package com.upskill.java_3;

public class Loops {
	/*
	1. For Loop
	2. While Loop
	3. Do while Loop
	4. Infinite Loop
	5. Nested for Loop
	*/

	public static void main(String[] args) {
//	practiceForLoop();
//	practiceWhileLoop();
//  practiceDoWhileLoop();
//	practiceInfiniteLoop();
	practiceNestedForLoop();
}
	
	public static void practiceForLoop(){  //For Loop - Do again and again upto upper limit
		int i ;                            //Initialize the variable
		for(i = 1; i<=10; i++){            //Setting lower limit, Upper limit, Increment or Decrement
			System.out.println(i);         //Statement
			i++;                           //Increment or decrement
		}	
}
	public static void practiceWhileLoop(){                            //While Loop - Do again and again upto upper limit
		int i = 1;                                                     //Initialize the variable
		while(i <= 10){                                                //Setting Condition
			System.out.println("While Loops NUmber = " + i);           //Statement
			i++;                                                       //Increment or decrement
		}
	}
    public static void practiceDoWhileLoop(){                          //Do While Loop - Do action then match condition
    	int i = 1;                                                     //Initialize the variable
    	do {                                                           //Statement
        System.out.println("Do While Loops Number = " + i);            //Increment or Decrement
    	}while (i<=0);                                                 //Checking Condition 
    }
    	public static void practiceInfiniteLoop(){                     //Infinite Loop - never ending loop
      	int i = 1;                                                     //Initialize the variable
    	for(i = 1; ; i++){                                             //Setting No Upper Limit
        System.out.println("Infinite Loops Number = " + i);                  //Statement
    	}
    	}
        public static void practiceNestedForLoop(){
        	int i;
        	int j;
        	for(i=1; i<=10; i++){
        		for (j=1; j<=10; j++){
        		int multiplicationTable = i * j;
        		System.out.print(multiplicationTable + " ");
        		
        		}
        		System.out.println("");
        	}
        }
    }



