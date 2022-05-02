package day8;

import java.util.Scanner;

//1 ....
//2 ..
//3...
public class Switchexample2
{
 void add() {System.out.println("add employee");}
 
 void display() {System.out.println("display employee");}
 
 void update() {System.out.println("update employee");}
	
	
	public static void main(String[] args) {

		System.out.println(" Add      add employee");
		System.out.println(" Display  display employee");
		System.out.println(" Update   update employee");
		System.out.println(" Exit     exit");
		System.out.println(" enter your choice");
		Scanner s= new Scanner(System.in);
		String choice=s.next();
		Switchexample e= new Switchexample();
		switch(choice)
		{
		case "add":     e.add();
		                break;//terminate switch
		case "display": e.display();
		                break;
		case "update":	e.update();
		       break;
		default: System.out.println("wrong choice");
        break;	
		
		}
		}
		
	}


