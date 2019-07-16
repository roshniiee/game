package com.UI;

import java.util.Scanner;

import com.Bean.Bean;

public class MainUI {
	public static void main(String args[]) {
		int ch;
		char choice;
		UserUI userobj=new UserUI();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n *********************\n MENU\n 1.Login  \n 2.Create an account \n 3.Exit\n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				userobj.login();
				break;
			case 2:
				userobj.createacccount();
				break;
			case 3:
				System.out.println("Exit");
				System.exit(0);
			}
				System.out.print("Do you want to continue (y/n)...? : ");
				choice = sc.next().charAt(0);
				if(choice == 'y' || choice=='Y')
					continue;
				else {
					System.out.println("Thank You !");
					System.exit(0);
				}
				
		}while(ch!=4);
		sc.close();
}
}