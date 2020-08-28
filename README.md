# interview

Assignment 1:

i tried to create the automation framework using POM.

this is a maven project which i used .
under POM.xml file i have added selenium dependency.

In my project i have created 3 packages i.e webpages,quantinsti auto and qunatinsti auto in src/test.

under src/java 
-- qauntinsti auto conatins base class in which i ahve created method called open_browser() which launch the browser and common to all project.
--under web pages there is a class called course detail in which i have created all weblement object and method to locate the all the required element.
-- there is alos one more java cass called as login_page in that i have created two method called as login() and signout().

in src/test
i have created test case class in eg=hich i call all the methods mwntioned in src/java to get the desired output.

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

=================================================================================================================================================

Assignment 3:

java program:

in this java prog i have created 3 variabe type int a=3, b=5, and sum =0
i create 
