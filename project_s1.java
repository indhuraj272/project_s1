package com.runner;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.reusuable.Base_Class;

public class project_s1 extends Base_Class{

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		browserlanuch("chrome");
//		screenscot();
		String title = title();
		System.out.println(title);
		urllanuch("https://adactinhotelapp.com/");
		String title1 = title();
		System.out.println(title1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement r1 = driver.findElement(By.id("username"));
		sendkey(r1,"indhuraj2702");
		WebElement r2 = driver.findElement(By.id("password"));
sendkey(r2, "@yy8dPATFSL3Wm");
		screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_1\\snap.png");
		WebElement r3 = driver.findElement(By.id("login"));
		clickon(r3);
		
	    WebElement r4 = driver.findElement(By.id("location"));
//    clickon(r4);]
//    down(); down(); 
    dropdown_Index(r4, 1);
		    
//		    enter();
			WebElement r5 = driver.findElement(By.id("hotels"));
//			clickon(r5);
			dropdown_Index(r5, 1);
//			down(); down(); enter();
			WebElement r6 = driver.findElement(By.id("room_type"));
			dropdown_Index(r6, 1);
//			clickon(r6); 
//			down(); down(); enter();
		    WebElement r7 = driver.findElement(By.id("room_nos"));
		    dropdown_Index(r7, 1);
//		    clickon(r7); down(); down(); enter();
		    WebElement r8 = driver.findElement(By.id("adult_room"));
		    dropdown_Index(r8, 1);
//		    clickon(r8); down(); down(); down(); enter();
		    WebElement r9 = driver.findElement(By.id("child_room"));
		    dropdown_Index(r9, 2);
//		    clickon(r9); down(); down(); down(); enter();
		    screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_2\\snap.png");
		    WebElement r10 = driver.findElement(By.id("Submit"));
		    clickon(r10);   
//		    tick the 1st row
		   	    WebElement sh1 = driver.findElement(By.xpath("//table[@cellspacing='1']/tbody/tr[2]/td/input"));
		        clickon(sh1);
				WebElement sh2 = driver.findElement(By.id("continue"));
				clickon(sh2);
				
				
				WebElement sh3 = driver.findElement(By.id("first_name"));
				sendkey(sh3,"indhu");
				
				WebElement sh4 = driver.findElement(By.id("last_name"));
				sendkey(sh4,"Raj");
				
				WebElement sh5 = driver.findElement(By.id("address"));
				sendkey(sh5,"2/62,pappyanayakarpatti, srivilliputtur,mallipost");
				WebElement sh6 = driver.findElement(By.id("cc_num"));
				sendkey(sh6,"1234567887653456");
				
				WebElement sh7 = driver.findElement(By.id("cc_type"));
				dropdown_Index(sh7, 3);
//				clickon(sh7); 
//				down(); down(); down(); down(); enter();
				
				WebElement sh8 = driver.findElement(By.id("cc_exp_month"));
				dropdown_Index(sh8, 3);
//				clickon(sh8); down(); down(); down(); down(); enter();
				
				WebElement sh9 = driver.findElement(By.id("cc_exp_year"));
				dropdown_Index(sh9, 3);
//				clickon(sh9); down(); down(); down(); down(); enter();
				
				WebElement sh10 = driver.findElement(By.id("cc_cvv"));
				sendkey(sh10,"234");
				screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_3\\snap.png");
				WebElement sh11 = driver.findElement(By.id("book_now"));
				clickon(sh11);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement sh12 = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
				clickon(sh12);
				
				driver.get("https://adactinhotelapp.com/BookedItinerary.php");
				
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_4\\snap.png");	
		
		WebElement s1 = driver.findElement(By.xpath("//table[@cellpadding='5']/tbody/tr[2]/td[1]"));
		clickon(s1);
		WebElement s2 = driver.findElement(By.xpath("//input[@name='cancelall']"));
		clickon(s2);
		alertaccept();
		screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_5\\snap.png");
		WebElement s3 = driver.findElement(By.name("logout"));
		clickon(s3);
		screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_6\\snap.png");
				}

		 
	
	}
