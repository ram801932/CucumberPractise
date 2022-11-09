package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestElearningUpSkill {

	WebDriver driver;

	@Given("Open {string}")
	public void open(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003FH7744\\Documents\\IBM Reskill Program - FST\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
	}

	@When("Click on Sign up")
	public void click_on_Sign_up() {
		driver.findElement(By.partialLinkText("Sign up")).click();
	}

	@When("fill up fields {string},{string},{string},{string},{string}")
	public void fill_up_field(String firstname, String lastname, String username, String email, String password) {
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("pass1")).sendKeys(password);
		driver.findElement(By.id("pass2")).sendKeys(password);

		driver.findElement(By.name("submit")).click();
	}

	@Then("verify that the next button is visible on successfull registration")
	public void verify_that_the_next_button_is_visible_on_successfull_registration() {
		System.out.println("Next button displayed: "
				+ driver.findElement(By.cssSelector("button[name='next']")).isDisplayed());
	}

	@When("Click on Next")
	public void click_on_Next() {

		driver.findElement(By.cssSelector("button[name='next']")).click();
	}

	@When("Click on name dropdwon present at top right")
	public void click_on_name_dropdwon_present_at_top_right() {
		driver.findElement(By.xpath("//a[@id='logout_button']/parent::li/preceding-sibling::li/a")).click();

	}

	@When("Click on Profile")
	public void click_on_Profile() {
		driver.findElement(By.partialLinkText("Profile")).click();
	}

	@When("Click on messages")
	public void click_on_messages() {

		driver.findElement(By.xpath("//a[contains(.,'Messages')]")).click();
	}

	@When("Click on Compose message")
	public void click_on_Compose_message() {

		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	}

	@When("Fill up the fields to Send")
	public void fill_up_the_fields_Send() {

		driver.findElement(By.name("title")).sendKeys("Test Subject ");
		// switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'Text Editor')]")));

		driver.findElement(By.xpath("//body//p")).sendKeys("mail description");
		driver.switchTo().defaultContent();
	}

	@Then("Click on send message")
	public void click_on_send_message() {
		driver.findElement(By.name("compose")).click();
	}

	@When("Click on Edit Profile")
	public void click_on_Edit_Profile() {
		driver.findElement(By.partialLinkText("Edit profil")).click();
	}

	@When("fill up edit profile fields {string},{string},{string}")
	public void fill_up_fields(String firstname, String lastname, String phone) {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstname);

		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastname);

		driver.findElement(By.name("phone")).sendKeys(phone);

//	driver.findElement(By.xpath("//input[@name='password0']")).sendKeys(password);
//	
//	driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(newPassword);
//	driver.findElement(By.xpath("//input[@name='password2']")).sendKeys(newPassword);
	}

	@Then("Click on Save settings")
	public void click_on_Save_settings() {
		driver.findElement(By.name("apply_change")).click();

	}

	@Then("Print success message")
	public void print_success_message() {
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText());
	}
}
