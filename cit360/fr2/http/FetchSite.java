/* Consider modifying this program by reading anything between the quotations of the href attribute in the string "<link rel="stylesheet" href=" in the source code. 
 * Prepend it with the site's URL, take the source code from that, and save it in the same folder as the HTML file's source code. This will take the site's CSS and 
 * make sure everything is formatted properly. */

package fr2.http;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class FetchSite {
//${import org.apache.logging.log4j.LogManager}${import org.apache.logging.log4j.Logger}private static final Logger logger = LogManger.getLogger(FetchSite);
	// Specify path for file to be created.
	private static final File FOLDER = new File("C:\\Users\\Robert\\Desktop\\Fetched Site");
	private static final File SOURCE_FILE = new File(FOLDER, "source.htm");
	private static String urlPath = "http://music.faintdev.net";

	public static void main(String[] args) {
		// Create site folder.
		FOLDER.mkdirs();
		
		// Get source code from remote website.
		InputStream sourceCode = getSourceCode(urlPath);
		
		// Save source code from remote website to a local file, according to the value of filePath.
		saveSourceCode(sourceCode);
		
		// Launch HTM file in a web browser.
		launchBrowser();
	}

	public static InputStream getSourceCode(String urlPath) {
		URL url = null;
		URLConnection urlcon = null;
		InputStream stream = null;
		try {
			url = new URL(urlPath);
			urlcon = url.openConnection();
			stream = urlcon.getInputStream();

		} catch (Exception e) {
			System.out.println(e);
		}
		return stream;
	}

	public static void saveSourceCode(InputStream code) {
		try {
			byte[] buffer = new byte[code.available()];
			code.read(buffer);

			@SuppressWarnings("resource")
			OutputStream outStream = new FileOutputStream(SOURCE_FILE);
			outStream.write(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void launchBrowser() {
		File f = null;
		try {
			// create the URI string.
			Desktop.getDesktop().browse(SOURCE_FILE.toURI());
		} catch (IOException e) {
//			logger
		}
	}
	
	public static String getUrlPath() {
		return urlPath;
	}

	public static void setUrlPath(String urlPath) {
		FetchSite.urlPath = urlPath;
	}
}