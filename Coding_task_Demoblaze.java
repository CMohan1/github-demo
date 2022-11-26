package demo_Commerical_site;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_demo_site_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// singup

		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys("Amazon123");
		driver.findElement(By.id("sign-password")).sendKeys("Filpkart123");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		// login

		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Amazon123");
		driver.findElement(By.id("loginpassword")).sendKeys("Filpkart123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		// selectPhones

		driver.findElement(By.xpath("//a[text()='Phones']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.navigate().back();
		driver.navigate().back();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.navigate().back();
		driver.navigate().back();

		Thread.sleep(2000);
		
		//selectLaptops

		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(3000);
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		driver.navigate().back();
		driver.navigate().back();

	

		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='MacBook air']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
		driver.navigate().back();
		driver.navigate().back();
		
		//selectMonitor
		
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Apple monitor 24']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alert5 = driver.switchTo().alert();
		alert5.accept();
		driver.navigate().back();
		driver.navigate().back();
		
		// checkingCart
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(10000);
		driver.close();
		

	}

}
