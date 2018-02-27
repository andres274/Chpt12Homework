/* 12.26 (Create a directory) Write a program that prompts the user to a enter a directory name and creates a directory using the File's mkdirs method. The program displays the message "Directory created successfully" if a directory is created or "Directory already exists" if the directory already exists.
 */

import java.io.File;
import java.util.Scanner;

public class Chpt12Assignment {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a directory to make");
		File dir = new File(keyboard.next());
		if (!dir.exists() && dir.mkdir()) {
			System.out.println(dir.getAbsolutePath());
			System.out.println("Directory created successfully");
		}
		else {
			System.out.println("Directory already exists");
		}
	}
}
