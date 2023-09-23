package com.upskill.java_5;

public interface Interface {
	//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method doesn't have any implementation
	public abstract void iDoor();
	public abstract void iWheel();
	public abstract void iSeat();
	public abstract void iColor();
/*
(Parent)           (Keyword)        (Child)
Class               extends          Class 
Abstract Class(+2)  extends          Class (-2)
Interface(+2)     implements         Class (-2)
Interface(+2)       extends         Interface (+2)      implements     Class(-4)
	
	
	*/
}
