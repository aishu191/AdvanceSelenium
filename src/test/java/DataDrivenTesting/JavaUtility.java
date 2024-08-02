package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {

	public static String main(String[] args, String Key) throws IOException {
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\com.crm.advanceseleniumA6\\ConfigureFile\\DwsLogin.properties");
		prop.load(fis);
		String data = prop.getProperty(Key);
		return data;
		}

		public static String logindata(String string) {

		return null;
		}


	}


