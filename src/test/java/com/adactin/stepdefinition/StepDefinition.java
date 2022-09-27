package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Properties.FileReaderManager;
import com.adactin.runner.RunnerClass;
import com.baseclass.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;
	
	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		
		String url = FileReaderManager.fileReaderMethod().ConfigurationManagermethod().getUrl();
		
		Baseclass.geturl(url);
		
	}

	@When("^user Enter The Username In Username Feild$")
	public void user_Enter_The_Username_In_Username_Feild() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AKASHRAGHUNATHAN");
		
	}

	@When("^user Enter The Password In Password Feild$")
	public void user_Enter_The_Password_In_Password_Feild() throws Throwable {
	   
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("73627362");

	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

	@When("^user Select The Location In Location Drop Down List$")
	public void user_Select_The_Location_In_Location_Drop_Down_List() throws Throwable {
		
		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(loc);
		s.selectByValue("Melbourne");
	}

	@When("^user Select The Hotel In Hotels Drop Down List$")
	public void user_Select_The_Hotel_In_Hotels_Drop_Down_List() throws Throwable {
	
		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select v = new Select(hot);
		v.selectByVisibleText("Hotel Sunshine");
	}

	@When("^user Select The Room Type In Room Type Drop Down List$")
	public void user_Select_The_Room_Type_In_Room_Type_Drop_Down_List() throws Throwable {
	    
		WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select w = new Select(type);
		w.selectByVisibleText("Double");
	}

	@When("^user Select The Number Of Rooms in Number Of Rooms Drop Down List$")
	public void user_Select_The_Number_Of_Rooms_in_Number_Of_Rooms_Drop_Down_List() throws Throwable {
	
		WebElement room = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select x = new Select(room);
		x.selectByValue("2");
		
	}

	@When("^user Enter The Check In Date In Check In Date Text Feild$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Text_Feild() throws Throwable {
	    
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/12/2022");
		
	}

	@When("^user Enter The Check Out Date In Check Out Date Text Feild$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Text_Feild() throws Throwable {
	    
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("11/12/2022");
		
	}

	@When("^user Select Number Of Adults In Adults Per Room Drop Down List$")
	public void user_Select_Number_Of_Adults_In_Adults_Per_Room_Drop_Down_List() throws Throwable {
	    
		WebElement per = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select y = new Select(per);
		y.selectByValue("3");
		
	}

	@When("^user Select Number Of Children In Children Per Room Drop Down List$")
	public void user_Select_Number_Of_Children_In_Children_Per_Room_Drop_Down_List() throws Throwable {
	    
		WebElement child = driver.findElement(By.id("child_room"));
		Select se = new Select(child);
		se.selectByValue("2");
		
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	    
		WebElement click = driver.findElement(By.xpath("//input[@value='Search']"));
		click.click();
		
	}

	@When("^user Select The Radio Button After Verification Of Hotel Details$")
	public void user_Select_The_Radio_Button_After_Verification_Of_Hotel_Details() throws Throwable {
	
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Click The Continue Button And It Navigates to$")
	public void user_Click_The_Continue_Button_And_It_Navigates_to() throws Throwable {
	
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@When("^user Enter First Name In First Name Text Feild$")
	public void user_Enter_First_Name_In_First_Name_Text_Feild() throws Throwable {
	
		WebElement findElement = driver.findElement(By.xpath("//input[@id='first_name']"));
		findElement.sendKeys("Akash");
	}

	@When("^user Enter Second Name In Second Name Text Feild$")
	public void user_Enter_Second_Name_In_Second_Name_Text_Feild() throws Throwable {
	
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Raghunathan");

	}

	@When("^user Enter Billing Address In Billing Address Text Feild$")
	public void user_Enter_Billing_Address_In_Billing_Address_Text_Feild() throws Throwable {
	
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("21,venbakkam");

	}

	@When("^user Enter Credit Card Number In Credit Card No Text Feild$")
	public void user_Enter_Credit_Card_Number_In_Credit_Card_No_Text_Feild() throws Throwable {
	
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1232 1213 2132 1225");

	}

	@When("^user Select Credit Card Type In Credit Card Type Drop Down List$")
	public void user_Select_Credit_Card_Type_In_Credit_Card_Type_Drop_Down_List() throws Throwable {
	
		WebElement date = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select z = new Select(date);
		z.selectByValue("MAST");
	}
	
	@When("^user Select Expiry Date In Expiry Date Month And Year Drop Down List$")
	public void user_Select_Expiry_Date_In_Expiry_Date_Month_And_Year_Drop_Down_List() throws Throwable {
	
		WebElement ex = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select l = new Select(ex);
		l.selectByValue("2");

		WebElement exd = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select m = new Select(exd);
		m.selectByIndex(2);
	}

	@When("^user Enter Cvv Number In Cvv Number Text Feild$")
	public void user_Enter_Cvv_Number_In_Cvv_Number_Text_Feild() throws Throwable {
	
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("256");

	}


	@Then("^user Click The Search Button and It Navigates to Booking Confirmation Page$")
	public void user_Click_The_Search_Button_and_It_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	
		driver.findElement(By.xpath("//input[@value='Book Now']")).click();

	}
	
	@Then("^user Click Logout Button And Application  Exits$")
	public void user_Click_Logout_Button_And_Application_Exits() throws Throwable {
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		
	}


}
