package Test_scripts;


import org.testng.annotations.Test;

import generic_methods.Excel;
import generic_methods.Generic_test;
import pom.Flipkartloginpage;


public class Flipkartloginscript extends Generic_test {
	@Test
	public void scrp1() throws InterruptedException {
		
		
		String un = Excel.getdata("Sheet1", 1, 0);
		String un1 = Excel.getdata("Sheet1", 1, 1);

		


Flipkartloginpage f=new Flipkartloginpage(driver);


f.setusername(un);
Thread.sleep(3000);
f.setpassrd(un1);
Thread.sleep(3000);
f.clicklogin();
Thread.sleep(5000);
f.clickprofile();
Thread.sleep(5000);
f.clickonlogoutbutton();
Thread.sleep(3000);
f.logoutclick();

}
}

