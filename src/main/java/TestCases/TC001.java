package TestCases;
//import org.testleaf.leaftaps.bases.Base;
//import org.testleaf.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.Base;

public class TC001 extends Base {


		// TODO Auto-generated method stub
@BeforeTest
public void setData(){
	excelFileName="TC001_Login.xls";
	
}
@Test(dataProvider="fetchData")
public void runLogin(String UserName,String Password){
new Pages.LoginPage()
.enterUsername(UserName)
.enterPassword(Password)
.clickButton();

	
}
	}

