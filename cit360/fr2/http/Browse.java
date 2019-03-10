package fr2.http;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Browse {

	public static void main(String args[]) {

		File f = null;
		URI uri = null;

		try {
			// Create new File object.
			f = new File("C:\\Users\\Robert\\Desktop\\Nerfed.htm");

			// Return the URI string.
			uri = f.toURI();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Desktop.getDesktop().browse(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
