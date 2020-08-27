package Quantinsti.Quantinsti_Auto;

import WebPages.CourseDetail;
import WebPages.Login_Page;
import WebPages.WebElements;

public class Test_Case extends BaseClass {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//call login method from login class
		Login_Page page = new Login_Page();
		WebElements wb= new WebElements();
		CourseDetail cd=new CourseDetail();
		
		Test_Case t = new Test_Case();
		t.open_browser();
		page.login();
		wb.browse_course();
		Thread.sleep(2000);
		cd.detail();
		Thread.sleep(2000);
		cd.detaiedlist();
		Thread.sleep(2000);
		cd.detaiedlistprice();
		Thread.sleep(2000);
		cd.viewdetails();
		Thread.sleep(2000);
		cd.removelink();
		Thread.sleep(2000);
		cd.coupon();
		Thread.sleep(2000);
		page.signout();
		
		
	}

}
