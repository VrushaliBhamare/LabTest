Vrushali Bhamre
package Arraynconstructorlab;

import java.util.Scanner;

/*Q 1 Wap to define an  3*3 matrix and ask input from user and store it in matrix .
  a) calculate sum of each row or matrix and display it
  b) count even numbers in matrix per row
  c) copy given matrix to another matrix of same size    */

public class Q1 {

	Scanner s= new Scanner(System.in);
	int a[][],row=0,column=0;
	
	void matrix() {
		//System.out.print("Enter number of rows and column");
		row=3;
		column=3;

		a= new int[row][column];
		
		System.out.println("enter "+ row*column+ " number");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				a[i][j]= s.nextInt();
			}
		}
		
		System.out.println("The input matrix is ");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}
		System.out.println();
	}
	
	void rowsum() {
		int sum=0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				sum +=a[i][j];
			}
			System.out.println("Sum of " + (i+1) +" row is : " + sum );
		}
		System.out.println();
	}
	
	void evenumrow() {
		
		for(int i=0; i<row; i++) {
			System.out.println("Even numbers from row " + (i+1) + " are : ");
			for(int j=0; j<column; j++) {
				if(a[i][j]%2==0) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void copy() {
		int b[][];
		b= new int[row][column];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				b[i][j]=a[i][j];
			}
		}
		
		System.out.println("The Copied matrix is ");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(b[i][j]+ " ");
				}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Q1 a = new Q1();
		a.matrix();
		a.rowsum();
		a.evenumrow();
		a.copy();
	}
}
