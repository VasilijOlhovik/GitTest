import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;

public class dick {
	static String[][] m = new String[5][3];
	static Scanner scn;
	
	public static void main(String args[]) {
		OpenFile();
		ReadFile();
		Out();
	}
	
	private static void Out() {
		for(int row=0;row<m.length;row++) {
			for(int col=0;col<m[row].length;col++) {
				System.out.print(m[row][col]+ " 1 ");
			}
			System.out.println();
		}
	}
	
	private static void ReadFile() {
		while(scn.hasNext()) {
			for(int row=0;row<m.length;row++) {
				for(int col=0;col<m[row].length;col++) {
					m[row][col] = scn.next();
				}
			}
		}
	}
	private static void OpenFile() {
		try {
			scn = new Scanner(new File("res//1.txt"));
			
		} catch(Exception e) {JOptionPane.showMessageDialog(null, "Файл не найден");}
	}
}
