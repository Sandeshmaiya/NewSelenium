package openPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static Properties prop ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream((System.getProperty("user.dir")+"/src/openPackage/config.properties"));
		
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username = prop.getProperty("username");
		String password  = prop.getProperty("password");
		String age = prop.getProperty("age");
		System.out.println(username + " "+ password +" "+age);
		

	}

}
