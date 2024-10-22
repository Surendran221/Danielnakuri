package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(4000);
		driver.findElement(By.id("usernameField")).sendKeys("danialnelsonp@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Daniel2456@1");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[text()='editOneTheme'])[1]")).click();
		 driver.findElement(By.id("resumeHeadlineTxt")).sendKeys(" . ");
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}

}