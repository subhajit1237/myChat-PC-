package myChat.view;

import java.util.Scanner;

import myChat.controller.LoginGUIController;

public class LoginGUI {
	
	private static String username;
	private static String password;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		username = sc.nextLine();
		System.out.print("Enter password: ");
		password = sc.nextLine();
		new LoginGUIController().onLoginClicked(username, password);
		sc.close();
	}

}
