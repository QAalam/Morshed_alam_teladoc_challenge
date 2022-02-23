package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import common.teladocBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.teladocPage;

public class deleteSteps extends teladocBase{

teladocPage page;
	
	@Given("the user naviagtes to Teladoc homepage")
	public void the_user_naviagtes_to_teladoc_homepage() {
	   
		getDriver();
		
		page = PageFactory.initElements(driver, teladocPage.class);
	    
	}

	@When("I click on cross icon")
	public void i_click_on_cross_icon() {
	   
	    page.getCrossIcon();
	}

	@When("I click ok button")
	public void i_click_ok_button() {
	   
	    page.getOKbtn(); 
	    
	}

	@Then("I see the user has been deleted")
	public void i_see_the_user_has_been_deleted() {
	   
	if
	
	(driver.findElement(By.xpath("//td[contains(text(),'novak')]")).isDisplayed())
	
	System.out.println("the user is visible");
	
	else System.out.println("user has been deleted");
		
	}
	
	
}
