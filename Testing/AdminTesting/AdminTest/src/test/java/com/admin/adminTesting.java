package com.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminTesting {
  @Test
  public void saveDoctorDetails() {
	  wd.get("http://localhost:4200/AddDoctor");  
	  wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[1]"));
	    textFiledRef.sendKeys("6");
	    WebElement textFiledRef1 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[2]"));
	    textFiledRef1.sendKeys("nikhil");
	    WebElement textFiledRef2 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[3]"));
	    textFiledRef2.sendKeys("21");
	    WebElement textFiledRef3= wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[4]"));
	    textFiledRef3.sendKeys("male");
	    WebElement textFiledRef4 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[5]"));
	    textFiledRef4.sendKeys("pending");
	    WebElement textFiledRef5 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[6]"));
	    textFiledRef5.sendKeys("ortho");
	    WebElement textFiledRef6 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[7]"));
	    textFiledRef6.sendKeys("9876543210");
	    WebElement textFiledRef7 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[8]"));
	    textFiledRef7.sendKeys("nikhil@gmail.com");
	    WebElement textFiledRef8 = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[9]"));
	    textFiledRef8.sendKeys("6-7,gandinagar");
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/html/body/app-adddoctor/div/form/input[10]"));
	    submitButtonRef.click();
	    
  }
  
 
  
  
  WebDriver wd;
  
  @BeforeMethod
  public void beforeMethod() {
  	  System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\eclipse-workspace\\PracticeProject\\src\\phase 5 practice projects\\msedgedriver.exe");
  		
  		 wd = new EdgeDriver();
  		 
  		
  }

  @AfterMethod
  public void afterMethod() {
  }

  }

