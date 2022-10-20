package com;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class NewTest {
	
	    
	   	
	@Test
	  public void savePatient () {
		wd.get("http://localhost:4200/patient/savepat");
	    
		    wd.manage().window().maximize();
		    wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		    
		    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[1]"));
		    textFiledRef.sendKeys("naruto");
		    
		    WebElement textFiledRef2 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[2]"));
		    textFiledRef2.sendKeys("male");
		    
		    WebElement textFiledRef3 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[3]"));
		    textFiledRef3.sendKeys("22");
		    
		    WebElement textFiledRef4 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[4]"));
		    textFiledRef4.sendKeys("paradise");
		    
		    WebElement textFiledRef5 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[5]"));
		    textFiledRef5.sendKeys("cold");
		    
		    WebElement textFiledRef6 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[6]"));
		    textFiledRef6.sendKeys("naruto@gmail.com");
		    
		    WebElement textFiledRef7 = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[7]"));
		    textFiledRef7.sendKeys("456321789");
		    
		    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-admit/div/form/input[8]"));
		    submitButtonRef.click();
		    
		    
	}
	
	
		    
		    
		    
		    
		    
	
	
	   	
	    	
	    
	    
	    
	    
	   
	    
	    
	    
	   
	  
		
	  
	    
	    
	    
	    
	  
	  
 

 WebDriver wd;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\phase 5 WorkPhase\\chromedriver_win32\\chromedriver.exe");
		
		 wd = new ChromeDriver();
		 
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
