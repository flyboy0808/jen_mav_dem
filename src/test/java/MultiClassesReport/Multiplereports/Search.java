package MultiClassesReport.Multiplereports;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Search extends ReportGenerate{
  
  @Test(priority=19)
  public void Click_On_Search() {
	  
	  test = extent.createTest("Test 1 - Open Home Page for Search Functionality");
	  webdriver.get("https://www.wittyfeed.tv");
	  WebElement searchicon= webdriver.findElement(By.className("searchselect"));
	  if(searchicon.isDisplayed()==true){
		  searchicon.click();
		  test.log(Status.PASS, "Clicked On Search Icon");
		  System.out.println("Clicked On Search Icon");
		  webdriver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		  WebElement search_bar=webdriver.findElement(By.id("search"));
		 if(search_bar.isDisplayed()==true){
			  test.log(Status.PASS, "Search Bar is showing");
			  System.out.println("Search Bar is showing");
			  search_bar.sendKeys("cricket");
			  webdriver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
			  search_bar.sendKeys(Keys.ENTER);
			  test.log(Status.INFO, "Clicked for Search Result");
			  System.out.println("Clicked for Search Result");
			  String Search_pageTitle= webdriver.getTitle();
			  String expected_searchTitle = "Search";
			  webdriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			  
			  if(Search_pageTitle.equals(expected_searchTitle)){
				  System.out.println("Search Result Page is showing");
				  test.log(Status.PASS, "Search Result Page is showing");
				  
				  String search_result_url=webdriver.getCurrentUrl();
				  System.out.println("Search Result URL is : "+ search_result_url);
				  test.log(Status.INFO, "Search Result URL is : "+ search_result_url);
			  }else{
				  test.log(Status.FAIL, "Unable to Get Search Result Page");
				  System.out.println("Unable to Get Search Result Page");
			  }
		  }else{
			  test.log(Status.FAIL, "Search bar is not showing.");
			  System.out.println("Search bar is not showing.");
		  }		  
	  }else{
		  System.out.println("Unable to Clicked on Search Icon");
		  test.log(Status.FAIL, "Unable to Clicked on Search Icon");
	  }
  }
  
  @Test(priority=20)
  public void Get_Search_Result_Stories(){
	  JavascriptExecutor jse = (JavascriptExecutor) webdriver;
	  jse.executeScript("window.scrollBy(0,500)");
	  webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
	  List<WebElement> search_stories=webdriver.findElements(By.tagName("article"));
			  //webdriver.findElements(By.tagName("article"));
	  /*for(WebElement e: search_stories){
		  String links= e.getAttribute("href");
		  if(null==links){
			  links=e.getAttribute("src");
			  System.out.println(e.getTagName() + "=" + links);
			  test.log(Status.INFO, e.getTagName() + "=" + links);
		  }
	  }*/
	  System.out.println("Search Stories Total counts are : " +search_stories.size());
	  test.log(Status.INFO, "Search Stories Total counts are : " +search_stories.size());
	  
	  for(int i=0;i<=search_stories.size()-1;i=i+1){
		  System.out.println(search_stories.get(i).getText());
		  test.log(Status.INFO, search_stories.get(i).getText());	
		  //search_stories.get(i).click();
		  //webdriver.navigate().back();
	  }
  }
}
