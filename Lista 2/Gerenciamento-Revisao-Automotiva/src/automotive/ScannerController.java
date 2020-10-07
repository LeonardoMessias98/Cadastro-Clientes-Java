package automotive;

import java.util.Scanner;

public class ScannerController {
	private Scanner reader;

	public ScannerController() {
		reader = new Scanner(System.in);
	}

	public synchronized int opcao() {
		int op = reader.nextInt();
		reader = reader.reset();
		return op;
	}

	public synchronized String texto() {
		reader = new Scanner(System.in);
		String t = reader.nextLine();
		reader = reader.reset();
		return t;
	}

	@Override
	protected void finalize() throws Throwable {
		reader.close();
	}
}