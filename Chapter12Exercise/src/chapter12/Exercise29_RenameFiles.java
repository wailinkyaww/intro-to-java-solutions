package chapter12;

import java.io.File;
import java.io.IOException;

public class Exercise29_RenameFiles {
	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\test\\exe");

		if (!dir.exists()) {
			System.out.println("Directory does not exist");
			System.exit(1);
		}

		File[] files = dir.listFiles();

		for (File file : files) {
			prependZeroBeforeDigit(file);
		}
	}

	public static void prependZeroBeforeDigit(File file) throws IOException {
		StringBuilder newName = new StringBuilder();

		String[] tokens = file.getName().split("_");

		newName.append(tokens[0]);
		newName.append('_');
		
		if(tokens[1].matches("[\\d{1}]"))
			newName.append('0' + tokens[1]);
		else
			newName.append(tokens[1]);

		File newFile = new File(file.getParent() + "\\" + newName);
		file.renameTo(newFile);
	}
}
