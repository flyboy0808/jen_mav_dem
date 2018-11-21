package MultiClassesReport.Multiplereports;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class OpenCategory extends ReportGenerate{
 
		
	@Test(priority=14)
	  public void Open_category_drawer()throws Throwable{
		
		  webdriver.get("https://www.wittyfeed.tv");	
		  test=extent.createTest("Test 1 - Open Category Drawer");
		  WebElement side_category_drawer=webdriver.findElement(By.cssSelector("body > header > nav > div > div > a.sidenav-trigger > svg > path"));
		  if(side_category_drawer.isDisplayed()==true){
			  System.out.println("Side Drawer icon is showing");
			  side_category_drawer.click();
			  test.log(Status.PASS, "Side Drawer icon is showing");
		  }else{
			  System.out.println("Side Drawer icon is not showing");
			  test.log(Status.FAIL, "Side Drawer icon is not showing");
		  }
	  }

	  @Test(priority=15)
	  public void Open_CategoryOne()throws Throwable{
		  test=extent.createTest("Test 2 - First Category Open");
		  //Open_category_drawer();
		  WebElement first_category=webdriver.findElement(By.linkText("NEWS"));
		  if(first_category.isDisplayed()==true){
			  System.out.println("First Category is showing");
			  test.log(Status.PASS, "First Category is showing");
			  first_category.click();
			  test.log(Status.INFO, "Clicked on First Category");
			  String first_cat_url=webdriver.getCurrentUrl();
			  String second_cat_Title= webdriver.getTitle();
			  System.out.println("First Category URL is: " + first_cat_url);
			  test.log(Status.INFO, "First Category URL is: " + first_cat_url);
			  
			  System.out.println("First Category Page Title is: " + second_cat_Title);
			  test.log(Status.INFO, "First Category Page Title is: " + second_cat_Title);
		  }else{
			  System.out.println("Unable to click on First Category");
			  test.log(Status.FAIL, "Unable to click on First Category");
		  }
	  }
	  
	  @Test(priority=16)
	  public void First_Category_Stories_Open()throws Throwable{
		  
		  test=extent.createTest("Test 3 - First Category: Stories Open");

		 // Category section - First Story Open
		  WebElement category_first_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(3) > a > div.vtpl_articleText > p"));
		  
		  if(category_first_Story.isDisplayed()==true){
			  category_first_Story.click();
			  System.out.println("Category- First Story is open");			  
			  test.log(Status.PASS, "Category- First Story is open");
			  Get_story_details();	
			  
		  }else{
			  System.out.println("Unable to click on Category First Story.");
			  test.log(Status.FAIL, "Unable to click on Category First Story.");
		  }
		  
		  // Category section - Second Story Open
		  WebElement category_second_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(4) > a > div.vtpl_articleText > p"));

		  if(category_second_Story.isDisplayed()==true){
			  category_second_Story.click();
			  System.out.println("Category- Second Story is open");
			  test.log(Status.PASS, "Category- Second Story is open");
			  Get_story_details();			  
		  }else{
			  System.out.println("Unable to click on Category Second Story.");
			  test.log(Status.FAIL, "Unable to click on Category Second Story.");
		  }	
		  
   		 // Category section - Third Story Open
		  WebElement category_third_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(5) > a > div.vtpl_articleText > p"));
		  
		  if(category_third_Story.isDisplayed()==true){
			  category_third_Story.click();
			  System.out.println("Category- Third Story is open");
			  test.log(Status.PASS, "Category- Third Story is open");
			  Get_story_details();			  
		  }else{
			  System.out.println("Unable to click on Category Third Story.");
			  test.log(Status.FAIL, "Unable to click on Category Third Story.");
		  }
		  
		// Category section - Fourth Story Open
		  WebElement category_fourth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(6) > a > div.vtpl_articleText > p"));
		  
		  if(category_fourth_Story.isDisplayed()==true){
			  category_fourth_Story.click();
			  System.out.println("Category- Fourth Story is open");
			  test.log(Status.PASS, "Category- Fourth Story is open");
			  Get_story_details();			  
		  }else{
			  System.out.println("Unable to click on Category Fourth Story.");
			  test.log(Status.FAIL, "Unable to click on Category Fourth Story.");
		  }
		  
		// Category section - Fifth Story Open
		  WebElement category_fifth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(7) > a > div.vtpl_articleText > p"));
		  
		  if(category_fifth_Story.isDisplayed()==true){
			  category_fifth_Story.click();
			  System.out.println("Category- Fifth Story is open");
			  test.log(Status.PASS, "Category- Fifth Story is open");
			  Get_story_details();			  
		  }else{
			  System.out.println("Unable to click on Category Fifth Story.");
			  test.log(Status.FAIL, "Unable to click on Category Fifth Story.");
		  }
		  
		// Category section - Sixth Story Open
		  WebElement category_sixth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(8) > a > div.vtpl_articleText > p"));
		  
		  if(category_sixth_Story.isDisplayed()==true){
			  category_sixth_Story.click();
			  System.out.println("Category- Sixth Story is open");			  
			  test.log(Status.PASS, "Category- Sixth Story is open");
			  Get_story_details();			  
		  }else{
			  System.out.println("Unable to click on Category Sixth Story.");
			  test.log(Status.FAIL, "Category- Sixth Story is open");
		  }
	  }
	  
	  
	  @Test(priority=17)
	  public void Open_CategoryTwo()throws Throwable{
		  test=extent.createTest("Test 4 - Second Category Open");

		  Open_category_drawer();
		  WebElement second_category=webdriver.findElement(By.linkText("LIFESTYLE"));
		  if(second_category.isDisplayed()==true){
			  System.out.println("Second Category is showing");
			  test.log(Status.PASS, "Second Category is showing");
			  second_category.click();
			  test.log(Status.INFO, "Clicked on Second Category");
			  String second_cat_url=webdriver.getCurrentUrl();
			  String second_cat_Title= webdriver.getTitle();
			  System.out.println("Second Category URL is: " + second_cat_url);
			  test.log(Status.INFO, "Second Category URL is: " + second_cat_url);
			  
			  System.out.println("Second Category Page Title is: " + second_cat_Title);
			  test.log(Status.INFO, "Second Category Page Title is: " + second_cat_Title);
		  }else{
			  System.out.println("Unable to click on Second Category");
			  test.log(Status.FAIL, "Unable to click on Second Category");
		  }
	  }
	
	@Test(priority=18)  
	  public void Second_Category_Stories_Open()throws Throwable{
		  test=extent.createTest("Test 5 - Second Category: Stories Open");

			 // Category section - First Story Open
			  WebElement category_first_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(3) > a > div.vtpl_articleText > p"));
			  
			  if(category_first_Story.isDisplayed()==true){
				
				  category_first_Story.click();
				  System.out.println("Category- First Story is open");
				  test.log(Status.PASS, "Category- First Story is open");  
				  Get_story_details();			  
			  }else{
				  System.out.println("Unable to click on Category First Story.");
				  test.log(Status.FAIL, "Unable to click on Category First Story.");
			  }
			  
			  // Category section - Second Story Open
			  WebElement category_second_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(4) > a > div.vtpl_articleText > p"));
			  
			  if(category_second_Story.isDisplayed()==true){
				  category_second_Story.click();
				  System.out.println("Category- Second Story is open");	
				  test.log(Status.PASS, "Category- Second Story is open");
				  Get_story_details();			  
			  }else{
				  System.out.println("Unable to click on Category Second Story.");
				  test.log(Status.FAIL, "Unable to click on Category Second Story.");
			  }	
			  
	   		 // Category section - Third Story Open
			  WebElement category_third_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(5) > a > div.vtpl_articleText > p"));
			  
			  if(category_third_Story.isDisplayed()==true){
				  category_third_Story.click();
				  System.out.println("Category- Third Story is open");	
				  test.log(Status.PASS, "Category- Third Story is open");
				  Get_story_details();			  
			  }else{
				  System.out.println("Unable to click on Category Third Story.");
				  test.log(Status.FAIL, "Unable to click on Category Third Story.");
			  }
			  
			// Category section - Fourth Story Open
			  WebElement category_fourth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(6) > a > div.vtpl_articleText > p"));
			  
			  if(category_fourth_Story.isDisplayed()==true){
				  category_fourth_Story.click();
				  System.out.println("Category- Fourth Story is open");		
				  test.log(Status.PASS, "Category- Fourth Story is open");
				  Get_story_details();			  
			  }else{
				  System.out.println("Unable to click on Category Fourth Story.");
				  test.log(Status.FAIL, "Unable to click on Category Fourth Story.");
			  }
			  
			// Category section - Fifth Story Open
			  WebElement category_fifth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(7) > a > div.vtpl_articleText > p"));
			  
			  if(category_fifth_Story.isDisplayed()==true){
				  category_fifth_Story.click();
				  System.out.println("Category- Fifth Story is open");	
				  test.log(Status.PASS, "Category- Fifth Story is open");
				  Get_story_details();			  
			  }else{
				  System.out.println("Unable to click on Category Fifth Story.");
				  test.log(Status.FAIL, "Unable to click on Category Fifth Story.");
			  }
			  
			// Category section - Sixth Story Open
			  WebElement category_sixth_Story= webdriver.findElement(By.cssSelector("body > div.container-fluid.vtpl-profileContainer > div > article:nth-child(8) > a > div.vtpl_articleText > p"));
			  
			  if(category_sixth_Story.isDisplayed()==true){
				  category_sixth_Story.click();
				  System.out.println("Category- Sixth Story is open");	
				  test.log(Status.PASS, "Category- Sixth Story is open");
				  Get_story_details();	
				  Click_on_Logo();
			  }else{
				  System.out.println("Unable to click on Category Sixth Story.");
				  test.log(Status.FAIL, "Unable to click on Category Sixth Story.");
			  }
			  //Close_Side_Drawer();
			  //webdriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			  
		  }
	
	public void Click_on_Logo()throws Throwable{
		webdriver.get("https://www.wittyfeed.tv");
	}
	
	
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
				//story_page_scroll();
				webdriver.navigate().back();
				System.out.println("Navigate Back"+"\n");
				test.log(Status.INFO,"Navigate Back"+"\n");
			}	
		  
/*	  @AfterTest
	  public void close_browser(){
		  webdriver.quit();
	  }*/
}
