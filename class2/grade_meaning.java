package class2;

import java.util.Scanner;

public class grade_meaning {

	public static void main(String[] args) {
		
		System.out.println("enter your grade..");
		
		Scanner sc=new Scanner(System.in);
        char a =sc.next().charAt(0);

        switch(a){
            case 'A':
                System.out.println("Excellent");
                break;
                
            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;
                
            case 'D':
                System.out.println("Deficient");
                break;
                
            case 'F':
                System.out.println("Failing");
                break;

            default:
                System.out.println("Invalid input");
        }
    }

	}
