package MultiClassesReport.Multiplereports;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class HomePage extends ReportGenerate{
  
	
	@Test(priority=1)
	public void OpenHomePage(){
		
		
		test = extent.createTest("Test 1 - Open Home Page");
		webdriver.get("https://www.wittyfeed.tv");
		String title = webdriver.getTitle();
		Assert.assertTrue(title.contains("WittyFeed - Latest News, Viral Stories and Trending Videos"));
		test.log(Status.PASS, "Open WittyFeed Website");		
	}
	
	@Test(priority=2)
	public void Open_First_Promoted_Story(){
		
		test=extent.createTest("Test 2 - First Promoted Story Open.");
		
		WebElement first_promo_img= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div.col.m8.vtpl_card.m-b-15.s12.l9"));
				//("body > app-root > app-home > div > div > div.col.m8.vtpl_card.m-b-15.s12.l9 > a > div"));
		
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(first_promo_img.isDisplayed()==true){
			System.out.println("1st Promoted Story is Displayed ");
			test.log(Status.PASS, "1st Promoted Story is Displayed ");
			try {
				first_promo_img.click();	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
					
			try {
				Get_story_details();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Unable to get 1st Promoted Story");
			test.log(Status.FAIL, "Unable to get 1st Promoted Story");
		}
	}
	
/*	@Test(priority=3)
	public void Open_First_Promoted_Story_from_title()throws Throwable{
		
		test=extent.createTest("Test 3 - First Promoted Story Open from Title");
		
		WebElement first_promo_title= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div.col.m8.vtpl_card.m-b-15.s12.l9 > h1 > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(first_promo_title.isDisplayed()==true){
			System.out.println("1st Promoted Story Title is Displayed ");
			test.log(Status.PASS, "1st Promoted Story Title is Displayed ");
			first_promo_title.click();
			Get_story_details();
		}else{
			System.out.println("Unable to get 1st Promoted Story Title");
			test.log(Status.FAIL, "Unable to get 1st Promoted Story Title");
		}		
	}*/
	
	  @Test(priority=3)
	  public void Open_Second_Promoted_Story(){
		  
		  test=extent.createTest("Test 3 - Second Promoted Story Open ");
		  WebElement second_promoted_img =webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(2)"));
				  //("body > app-root > app-home > div > div > div:nth-child(2) > a"));
		  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if(second_promoted_img.isDisplayed()==true){
			  System.out.println("Second Story is showing and clicked");
			  test.log(Status.PASS,"Second Story is showing and clicked");
			 try {
				 second_promoted_img.click();	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			  		
			  try {
				Get_story_details();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }else{
			  System.out.println("Second story is not showing");
			  test.log(Status.FAIL, "Second story is not showing");
		  }
	  }
	  
	/*  
	  @Test(priority=5)
	  public void Open_Second_Promoted_Story_from_title()throws Throwable{
		  
		  test=extent.createTest("Test 5 - Second Promoted Story Open from Title");
		  WebElement second_promoted_story_title =webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(2) > h1"));
		  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if(second_promoted_story_title.isDisplayed()==true){
			  System.out.println("Second Story title is showing and clicked");
			  test.log(Status.PASS, "Second Story title is showing and clicked");
			  second_promoted_story_title.click();			
				Get_story_details();
		  }else{
			  System.out.println("Unable to get Second story title");
			  test.log(Status.FAIL, "Unable to get Second story title");
		  }		  
	  }
*/
	  @Test(priority=4)
	  public void Open_Third_Promoted_Story(){
		  
		  test=extent.createTest("Test 4 - Third Promoted Story Open ");
		  WebElement third_promoted_img =webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(3)"));
				  //("body > app-root > app-home > div > div > div:nth-child(3) > a > div"));
		  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if(third_promoted_img.isDisplayed()==true){
			  System.out.println("Third Story is showing and clicked");
			  test.log(Status.PASS, "Third Story is showing and clicked");
			  
			  try {
				  third_promoted_img.click();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			  			
				try {
					Get_story_details();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }else{
			  System.out.println("Third story is not showing");
			  test.log(Status.FAIL, "Third story is not showing");
		  }
	  }
	  
	  
/*	  @Test(priority=7)
	  public void Open_Third_Promoted_Story_from_title()throws Throwable{
		  
		  test=extent.createTest("Test 7 - Third Promoted Story Open from Title");
		  WebElement third_promoted_story_title =webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(3) > h1 > a"));
		  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if(third_promoted_story_title.isDisplayed()==true){
			  System.out.println("Third Story title is showing and clicked");
			  test.log(Status.PASS, "Third Story title is showing and clicked");
			  third_promoted_story_title.click();			
				Get_story_details();
		  }else{
			  System.out.println("Third story title is not showing");
			  test.log(Status.FAIL, "Third story title is not showing");
		  }		  
	  }
	  */
	  
		public void homepage_scroll_Down()throws Throwable{
	 		JavascriptExecutor jse = (JavascriptExecutor)webdriver;
	 		jse.executeScript("window.scrollBy(0,600)", "");
	 		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  }	

	//Latest Stories Section

	  @Test(priority=5)
	  
	  public void Open_Latest_Section_First_Story(){
		test=extent.createTest("Test 5 - Latest Section First Story Open ");		  
		try {
			homepage_scroll_Down();
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		WebElement first_story_img= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(1) > div > p.vtpl_storyCaption.small_caption > a"));
				//("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(1) > div > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(first_story_img.isDisplayed()==true){
			System.out.println("Latest Section - First Story is showing and clicked");
			test.log(Status.PASS, "Latest Section - First Story is showing and clicked");
			try {
				first_story_img.click();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				Get_story_details();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Unable to get Latest First story ");
			test.log(Status.FAIL, "Unable to get Latest First story ");
		}
	  }
	  
/*	  @Test(priority=9)
	  public void Open_Latest_Section_First_Story_from_Title()throws Throwable{
		  test=extent.createTest("Test 9 - Latest Section First Story Open from Title");
		  WebElement first_story_title= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(1) > div > p.vtpl_storyCaption.small_caption > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(first_story_title.isDisplayed()==true){
			System.out.println("Latest Section - First Story Title is showing and clicked");
			test.log(Status.PASS, "Latest Section - First Story Title is showing and clicked");
			
			first_story_title.click(); 
			Get_story_details();
		}else{
			System.out.println("Unable to get Latest First story title");
			test.log(Status.FAIL, "Unable to get Latest First story title");
		}
	  }*/
	  
	  @Test(priority=6)
	  public void Open_Latest_Section_Second_Story(){
		  
		test=extent.createTest("Test 6 - Latest Section Second Story Open");
		WebElement second_story_img= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(2) > div > p.vtpl_storyCaption.small_caption > a"));
				//("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(2) > div > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(second_story_img.isDisplayed()==true){
			System.out.println("Latest Section - Second Story is showing and clicked");
			test.log(Status.PASS, "Latest Section - Second Story is showing and clicked");
			try {
				second_story_img.click();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				Get_story_details();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Unable to get Latest Second story");
			test.log(Status.FAIL, "Unable to get Latest Second story");
		}
	  }
	  
/*	  @Test(priority=11)
	  public void Open_Latest_Section_Second_Story_from_Title()throws Throwable{
		
		test=extent.createTest("Test 11 - Latest Section Second Story Open from Title");
		WebElement second_story_title= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(2) > div > p.vtpl_storyCaption.small_caption > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(second_story_title.isDisplayed()==true){
			System.out.println("Latest Section - Second Story Title is showing and clicked");
			test.log(Status.FAIL, "Latest Section - Second Story Title is showing and clicked");
			second_story_title.click();			
			Get_story_details();
		}else{
			System.out.println("Unable to get Latest Second story title");
			test.log(Status.FAIL, "Unable to get Latest Second story title");
		}
	  }*/
	  
	  @Test(priority=7)
	  public void Open_Latest_Section_Third_Story(){
		test=extent.createTest("Test 7 - Latest Section Third Story Open");
		WebElement third_story_img= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(3) > div > p.vtpl_storyCaption.small_caption > a"));
				//("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(3) > div > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(third_story_img.isDisplayed()==true){
			System.out.println("Latest Section - Third Story is showing and clicked");
			test.log(Status.PASS, "Latest Section - Third Story is showing and clicked");
			try {
				third_story_img.click();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				Get_story_details();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Unable to get Latest Third story");
			test.log(Status.FAIL, "Unable to get Latest Third story");
		}
	  }
	  
	 /* @Test(priority=13)
	  public void Open_Latest_Section_Third_Story_from_Title()throws Throwable{
		  test=extent.createTest("Test 13 - Latest Section Third Story Open from Title");
		WebElement third_story_title= webdriver.findElement(By.cssSelector("body > app-root > app-home > div > div > div:nth-child(5) > section > div > div > div > div:nth-child(3) > div > p.vtpl_storyCaption.small_caption > a"));
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(third_story_title.isDisplayed()==true){
			System.out.println("Latest Section - Third Story Title is showing and clicked");
			test.log(Status.PASS, "Latest Section - Third Story Title is showing and clicked");
			third_story_title.click();
			Get_Single_Story_detail();
			Get_story_details();
			story_page_scroll();
		}else{
			System.out.println("Unable to get Latest Third story title");
			test.log(Status.FAIL, "Unable to get Latest Third story title");
		}
	  }
	  */
	  public void Get_story_details()throws Throwable{
			String promoted_url=webdriver.getCurrentUrl();
			System.out.println(" Story URL is: "+ promoted_url);
			test.log(Status.INFO, " Story URL is: "+ promoted_url);
			
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
			
			WebElement sidedrawer=webdriver.findElement(By.xpath("//*[@id='vtpl_header']/nav/div/div"));
			if(sidedrawer.isDisplayed()==true){
				System.out.println("Side Drawer is displaying. \n");
				test.log(Status.PASS, "Side Drawer is displaying. \n");
			}else{
				System.out.println("Side Drawer is not showing. \n");
				test.log(Status.FAIL, "Side Drawer is not showing. \n");
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
			
			webdriver.navigate().back();
			System.out.println("Navigate Back"+"\n");
			test.log(Status.INFO,"Navigate Back"+"\n");
		}	

		  
		  public void Get_Single_Story_detail()throws Throwable{
				String promoted_url=webdriver.getCurrentUrl();
				System.out.println(" Story URL is: "+ promoted_url);
				test.log(Status.INFO, " Story URL is: "+ promoted_url);
				
				WebElement story_image=webdriver.findElement(By.xpath("/html/body/app-root/app-story/div[1]/div[1]/div[1]/div[1]"));
				webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				if(story_image.isDisplayed()==true){
					System.out.println("Story image is showing on Story page");
					test.log(Status.PASS, "Story image is showing on Story page");
					
					String story_img_src1 =story_image.getAttribute("style");
					System.out.println("Story image url is : "+story_img_src1);
					test.log(Status.INFO, "Story image url is : "+story_img_src1);
				}else{
					System.out.println("Story image is not showing on Story page");
					test.log(Status.FAIL, "Story image is not showing on Story page");
				}
				
				
				WebElement writer_logo = webdriver.findElement(By.className("slide_author_profile"));
				if(writer_logo.isDisplayed()==true){
					
					System.out.println("Writer logo is displaying");
					test.log(Status.PASS, "Writer logo is displaying");
					
					String profilesrc =writer_logo.getAttribute("href");
					System.out.println("Writer profile url is: "+profilesrc);
					test.log(Status.INFO, "Writer profile url is: "+profilesrc);
					
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
				
				WebElement sidedrawer=webdriver.findElement(By.xpath("//*[@id='vtpl_header']/nav/div/div"));
				if(sidedrawer.isDisplayed()==true){
					System.out.println("Side Drawer is displaying. \n");
					test.log(Status.PASS, "Side Drawer is displaying. \n");
				}else{
					System.out.println("Side Drawer is not showing. \n");
					test.log(Status.FAIL, "Side Drawer is not showing. \n");
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
				story_page_scroll();
				webdriver.navigate().back();
				System.out.println("Navigate Back"+"\n");
				test.log(Status.INFO,"Navigate Back"+"\n");
			}		
		  
		  public void story_page_scroll()throws Throwable{
				
				String current_url="";
				String last_url="";
				int storycount = 0;
				for(int i= 1;storycount<=2;i++){
					
					if(current_url=="" || last_url.equals(current_url)==false){
						current_url= webdriver.getCurrentUrl();
						storycount ++;
					}
					System.out.println("\nstr="+storycount);
					//test.log(LogStatus.INFO, "\nstr="+storycount);
					
					JavascriptExecutor jse = (JavascriptExecutor) webdriver;
					//jse.executeScript("arguments[1].scrollIntoView();",story_images);
					//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
					jse.executeScript("window.scrollBy(0,800)");
					//Count_Images();
					
					System.out.println(i+ " Scroll" );
					webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
					String changed_url = webdriver.getCurrentUrl();
		  			System.out.println("\nChanged story url is: " + changed_url);
					last_url = webdriver.getCurrentUrl();
				}	
			}
}
