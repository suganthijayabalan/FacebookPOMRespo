package Bases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Util.ReadExcel;


public class Base {
	public String excelFileName;
		
		public static FirefoxDriver driver;

	@BeforeMethod
			public void launchApp() 
	{
				
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver");
				driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}

		@AfterMethod
		private void closeApp(){
		driver.close();
	
		}
		@DataProvider(name="fetchData")
		public String[][] sendData() throws IOException {
			ReadExcel excel = new ReadExcel();
			//return excel.excelRead(excelFileName);
			return excel.readData(excelFileName);
		}

	}



