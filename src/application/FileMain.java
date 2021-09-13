package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = new String[] { "good morning ", "good night", "good aftenoon" };
		String path = "c:\\Python//in.txt"; //already at my computer
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // look at  in.txt, and see the changes
				System.out.println("Enter a folder path");
				String strPath = sc.nextLine();
				File path2 = new File(strPath);
				File[] folders = path2.listFiles(File::isDirectory);
				System.out.println("Folders:");
				for (File folder : folders) {
					System.out.println(folder);
				}
				File[] files = path2.listFiles(File::isFile);
				System.out.println("FILES-----");
				for (File file : files) {
					System.out.println(file);

				}

			}
		} catch (IOException s) {
			s.printStackTrace();
		}
	}
}
