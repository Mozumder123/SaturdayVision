package com.upskill.assignment_3;

public class Assignment_3_2 {
	static int count=1;
	Assignment_3_2(String name,int age,int salary,String address){
          	System.out.println("Employee Number: "+count);
          	System.out.println("Employee Name: "+name);
          	System.out.println("Employee Age: "+age);
          	System.out.println("Employee Salary: "+salary);
          	System.out.println("Employee Address: "+address);
          	count++;
          	System.out.println("");
   	}
 
   	public static void main(String[] args) {
   		Assignment_3_2[] obj=new Assignment_3_2[5];
          	obj[0]=new Assignment_3_2("Shohid",37,190000,"Flushing");
          	obj[1]=new Assignment_3_2("Rasel",26,170000,"New Jersey");
          	obj[2]=new Assignment_3_2("Juel",33,100000,"Jamaica");
          	obj[3]=new Assignment_3_2("Jahangir",28,160000,"Jackson Heights");
          	obj[4]=new Assignment_3_2("Zain",5,150000,"Jamaica");
   	}
 
}