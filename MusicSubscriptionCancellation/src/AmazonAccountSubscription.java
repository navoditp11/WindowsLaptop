package amazonaccountsubscription;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.read.biff.BiffException;


public class AmazonAccountSubscription {

                public static void main(String[] args) throws BiffException, IOException {
                                int i =1;
                                Sheet s;
                                FileInputStream fs = new FileInputStream("/Users/XXX/Desktop/accountDetails.xlsx");
                                Workbook workbook = new XSSFWorkbook(fs);
                                Sheet sheet = workbook.getSheetAt(0);
                                int rowCount = sheet.getLastRowNum();
                                
                                for (int row=1; row<=rowCount; row++) {
                                                
                                                WebDriverManager.chromedriver().setup();
                                               WebDriver driver=new ChromeDriver();
                                               driver.manage().window().maximize();
                                               
                                                driver.get("https://www.amazon.com/hz/mycd/digital-console/devicedetails?deviceFamily=DASH");
                                               try { 
                                                                 
                                    String email =sheet.getRow(row).getCell(0).getStringCellValue();
                                    System.out.println("US account"+"="+email);
                                                
                                    String password = sheet.getRow(row).getCell(1).getStringCellValue();
                                    System.out.println("Password"+"="+password);
                                  
                                                driver.findElement(By.name("email")).sendKeys(email);
                                                driver.findElement(By.id("continue")).click();
                                                                
                                                if(driver.findElement(By.name("password")).isDisplayed())
                                                {
                                                driver.findElement(By.name("password")).sendKeys(password);
                                                driver.findElement(By.id("signInSubmit")).click();
                                                }
                                                
                                                WebDriverWait wait = new WebDriverWait(driver,90);
                                                WebElement ele = driver.findElement(By.id("nav-link-accountList"));
                                                
                                                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
                                                Actions action = new Actions(driver);
                                                action.moveToElement(ele).build().perform();
                                                
                                                driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[10]/span")).click();
                                                
                                                if(driver.findElement(By.linkText("Amazon Music Unlimited")).isDisplayed());
                                                                
                                                driver.findElement(By.xpath("//*[@id=\"a-autoid-2\"]/span/input")).click(); 
                                                
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
                                                }}}}
