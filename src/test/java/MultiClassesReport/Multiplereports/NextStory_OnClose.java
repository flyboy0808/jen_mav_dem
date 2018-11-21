package MultiClassesReport.Multiplereports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class NextStory_OnClose extends ReportGenerate{
  
static WebElement closeButton;

	@Test(priority=21)
	public void OpenFirstStory()throws Throwable {
		test = extent.createTest("Test 21 - Go to Story Page");
		webdriver.get("https://www.wittyfeed.tv");
		WebElement story = webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div.col.m8.vtpl_card.m-b-15.s12.l9 > a"));
		if(story.isDisplayed()==true){
		   
		   story.click();
		   System.out.println("Story page open");
		   test.log(Status.PASS, "Story page open");		   
		   
		   String story1=webdriver.getCurrentUrl();
		   System.out.println("1st story url is : "+ story1);
		  
		   JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		   jse.executeScript("window.scrollBy(0,500)");		 
		  
		   closeButton=webdriver.findElement(By.id("close_story"));
		   closeButton.click();
		  
		   JavascriptExecutor jse2 = (JavascriptExecutor) webdriver;
		   jse2.executeScript("window.scrollBy(0,500)");		 
		  
		   String url2 = webdriver.getCurrentUrl();
		   System.out.println(url2);
		   
		   /*closeButton = webdriver.findElement(By.cssSelector("#nav-mobile > li > a"));
		   Actions actions = new Actions(webdriver);
		   if(closeButton.isDisplayed()==true){
		   actions.moveToElement(closeButton).click().perform();
		   System.out.println("Click on close button");
		   }else{
			   System.out.println("Not Found close button");
		   }*/
		   /*closeButton=webdriver.findElement(By.cssSelector("#nav-mobile > li > a"));
		   closeButton.click();*/
		  /* String url2= webdriver.getCurrentUrl();
		   System.out.println("Second story url is : "+ url2);*/
		 /*  if(closeButton.isDisplayed()){
			   closeButton.click();
			   System.out.println("Clicked on Story Close button");
		   }else{
			   System.out.println("Close button is not showing");
		   }*/
		  /* closeButton=webdriver.findElement(By.id("close_story"));		  
		   if(closeButton.isDisplayed()==true)
		   {
			   System.out.println("Close button is showing");
			   closeButton.click();
			   System.out.println("New Story is open");
			   
			   String url2=webdriver.getCurrentUrl();
			   //String story2url=webdriver.get("url2");
			   System.out.println("2nd story url is : "+ url2);
		   }else{
			   System.out.println("Close button is not found");
		   }*/
		   //scroll();
		  /* closeButton=webdriver.findElement(By.id("close_story"));		  
		   if(closeButton.isDisplayed()==true)
		   {
			   closeButton.click();
		   }
		   String story3url=webdriver.getCurrentUrl();
		   System.out.println("3rd story url is : "+ story3url);*/
		   
		}else{
			   	System.out.println("Story Page is not Open");
			   	test.log(Status.FAIL, "Story Page is not Open");
			 }
         
         
		 /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > app-story > div.container-fluid.vtpl_storypage.p-0 > div.row.vtpl_story.m-b-5 > div.vtpl_storyCover"))	;
		 System.out.println(webdriver.getCurrentUrl());*/
	}
	
/*	@Test(priority=22)
	public void SecondStoryOpen()throws Throwable{
   		   closeButton=webdriver.findElement(By.id("close_story"));		  
		   if(closeButton.isDisplayed()==true)
		   {
			   System.out.println("Close button is showing");
			   closeButton.click();
			   System.out.println("New Story is open");
			   
			   String url2=webdriver.getCurrentUrl();
			   System.out.println("2nd story url is : "+ url2);
		   }else{
			   System.out.println("Close button is not found");
		   }
	}
	*/
	public void scroll(){
	   JavascriptExecutor jse = (JavascriptExecutor) webdriver;
	   jse.executeScript("window.scrollBy(0,800)");
	  
	}
	
	public void Click_on_CloseButton()throws Throwable{
		
		closeButton = webdriver.findElement(By.id("close_story"));
		 if(closeButton.isDisplayed()==true){
	   			System.out.println("close button is showing");
	   			webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
	   			closeButton.click();
	   			System.out.println("Clicked on Close button on story page");
		   		test.log(Status.PASS, "Clicked on Close button on story page");
		   		//Get_story_details();
		   		}else{
		   			System.out.println("Close button not showing");
		   			test.log(Status.FAIL, "Close button not showing");
		   		}
		 webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
		 JavascriptExecutor jse2 = (JavascriptExecutor) webdriver;
		 jse2.executeScript("window.scrollBy(0,800)");
		 //webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
	}
		
	public void Get_story_details()throws Throwable{
		
		
		WebElement story_image=webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[1]"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(story_image.isDisplayed()==true){
			System.out.println("Story image is showing on Story page");
			test.log(Status.PASS, "Story image is showing on Story page");
			
			String story_img_src =story_image.getAttribute("style");
			System.out.println("Story image url is : "+story_img_src);
			test.log(Status.INFO, "Story image url is : "+story_img_src);
		}else{
			System.out.println("Story image is not showing on Story page");
			test.log(Status.FAIL, "Story image is not showing on Story page");
		}
		
		
		WebElement writer_logo = webdriver.findElement(By.className("slide_author_profile"));
		if(writer_logo.isDisplayed()==true){
			String src =writer_logo.getAttribute("href");
			
			System.out.println("Writer profile url is: "+src);
			test.log(Status.INFO, "Writer profile url is: "+src);
			
			
			System.out.println("Writer logo is displaying");
			test.log(Status.PASS, "Writer logo is displaying");
			
			String img_src= writer_logo.getAttribute("style");
			System.out.println("Writer image url is: "+img_src);
			test.log(Status.INFO, "Writer image url is: "+img_src);

		}else{
			System.out.println("Writer logo is not displaying");
			test.log(Status.FAIL, "Writer logo is not displaying");
		}
		
		WebElement writer_name= webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[2]/div/div/a/span"));
		if(writer_name.isDisplayed()==true){
			System.out.println("Writer name is displaying");
			test.log(Status.PASS, "Writer name is displaying");
			System.out.println("Writer name is: " + writer_name.getText());
			test.log(Status.INFO, "Writer name is: " + writer_name.getText());
		}else{
			System.out.println("Writer name is not displaying");
			test.log(Status.FAIL, "Writer name is not displaying");
		}
		
		WebElement story_date = webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[2]/div/div/span"));
		if(story_date.isDisplayed()==true){
			System.out.println("Story Date is displaying");
			test.log(Status.PASS,"Story Date is displaying");
			System.out.println("Story Date is: "+ story_date.getText());
			test.log(Status.INFO, "Story Date is: "+ story_date.getText());
		}else{
			System.out.println("Story Date is not displaying");
			test.log(Status.FAIL, "Story Date is not displaying");
		}
		WebElement story_category = webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[2]/a"));
		if(story_category.isDisplayed()==true){
			System.out.println("Story category is displaying");
			test.log(Status.PASS, "Story category is displaying");
			System.out.println("Story category name is : " + story_category.getText());
			test.log(Status.INFO, "Story category name is : " + story_category.getText());
		}
		
		WebElement story_title = webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[2]/div[1]/div/h1"));
		if(story_title.isDisplayed()==true){
			System.out.println("Story Title is showing. ");
			test.log(Status.PASS, "Story Title is showing.");
			System.out.println("Story Title is: "+story_title.getText());
			test.log(Status.INFO,"Story Title is: "+story_title.getText());
		}else{
			System.out.println("Story Title is not showing.");
			test.log(Status.FAIL, "Story Title is not showing.");
		}
		
		WebElement story_short_desc = webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[2]/div[1]/div/p"));
		Assert.assertTrue(story_short_desc.isDisplayed());
		System.out.println("Story short description is: "+ story_short_desc.getText());
		test.log(Status.INFO, "Story short description is: "+ story_short_desc.getText());
		
		
		String promoted_url=webdriver.getCurrentUrl();
		System.out.println(" Story URL is: "+ promoted_url);
		test.log(Status.INFO, " Story URL is: "+ promoted_url);
	}	

}
