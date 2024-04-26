import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.read.biff.BiffException;

public class AccountCreation {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		int i =1;
		Sheet s;
		FileInputStream fs = new FileInputStream("/Users/pnavodit/Desktop/AccountCreation.xlsx");
		Workbook workbook = new XSSFWorkbook(fs);
		Sheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		                                
		for (int row=1; row<=rowCount; row++) {
		                                                		                                               
			WebDriverManager.chromedriver().setup();		                                               
			WebDriver driver=new ChromeDriver();		                                               
			
			driver.manage().window().maximize();		                                                                                           
			driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=4FH8PZW1V4MH9Z733KF4&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&ref_=ap_sw_aa&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&disableLoginPrepopulate=1&switch_account=signin&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");                                           
			try { 
                            
				System.out.println("Account Created Successfully");
				String customerName =sheet.getRow(row).getCell(0).getStringCellValue();
				System.out.println("Name"+"="+customerName);
				String email =sheet.getRow(row).getCell(1).getStringCellValue();
				System.out.println("Email"+"="+email);                            
				String password = sheet.getRow(row).getCell(2).getStringCellValue();                            
				System.out.println("Password"+"="+password);
				String passwordCheck = sheet.getRow(row).getCell(2).getStringCellValue();
				System.out.println("Parent CustomerID");
				System.out.println("Child CustomerID");
		        
				driver.findElement(By.name("customerName")).sendKeys(customerName);
				driver.findElement(By.name("email")).sendKeys(email);		                                                
			
		                                                                                                        
				if(driver.findElement(By.name("password")).isDisplayed())                                      
				{                                    
					driver.findElement(By.name("password")).sendKeys(password);
					driver.findElement(By.name("passwordCheck")).sendKeys(passwordCheck);
					//driver.findElement(By.id("signInSubmit")).click();
					driver.findElement(By.id("continue")).click();
				}
		        
				//driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
				//driver.findElement(By.className("a-button-input")).click();
				Thread.sleep(90000);
				driver.findElement(By.className("a-button-input")).sendKeys(Keys.ENTER);
				WebDriverWait wait = new WebDriverWait(driver,90);
				//driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
				//driver.findElement(By.name("code")).sendKeys();
				WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		                                                                                        
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));                                        
				Actions action = new Actions(driver);                                        
				action.moveToElement(ele).build().perform();
		                                                                                        
				driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[10]/span")).click();
		                                                                                   
				if(driver.findElement(By.linkText("Amazon Music Unlimited")).isDisplayed());
		                                                                                                        
				driver.findElement(By.xpath("//*[@id=\"a-autoid-3\"]/span/input")).click();
				
				driver.get("https://www.amazon.com/music/settings/?ref_=yms_cncl_ingrs_amu&subscriptionOffboarding=true&returnTo%2Fyourmembershipsandsubscriptions%2Fcancelsubscriptionreturn%3FsubscriptionId%3DJDATDXDX20NNG8ZS4K50%26serviceProviderId%3DDIGITAL_MUSIC_SUB_US%26asin%3DB01IEKNAPY%26agent%3DYMS%26action%3Dcancel=undefined&action=Cancel");
				
				driver.findElement(By.linkText("No, I don't want to provide feedback. Please cancel my subscription.")).click();
		                                                                                                        
				driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div/div[3]/div/span[1]/span/input")).click();
		                                                                                        
				System.out.println("Successfully cancelled the amazon music subscription for this account");
		                                                                                                                           
			}
		                                                
			catch(org.openqa.selenium.NoSuchElementException e) {                                                                        
				System.out.println("No active music subscription found to cancel for this account");
		                                                                
			}
		                                                                                            
			finally {
		                                                                                                                        
				driver.close();                                                        
				driver.quit();
		                                                
			}
		}	

	}

}
