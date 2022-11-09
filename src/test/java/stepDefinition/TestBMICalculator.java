package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestBMICalculator {

	WebDriver driver;

	@Given("Open BMI calculator URL {string}")
	public void open(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003FH7744\\Documents\\IBM Reskill Program - FST\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
	}

	@Then("Validate the Title {string} of the current page")
	public void validate_the_Title_of_the_current_page(String title) {

		String currentTitle = driver.getTitle();
		System.out.println("Page title: " + currentTitle);
		if (title.equals(currentTitle)) {
			System.out.println("Title Matched...");
		} else {
			System.out.println("Title not matched!");
		}

	}

	@When("Click on BMI Calculator")
	public void click_on_BMI_Calculator() {
		driver.findElement(By.linkText("BMI Calculator")).click();
	}

	@When("Enter Age {string}")
	public void enter_Age(String age) {

		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys(age);

	}

	@When("Enter Height {string}")
	public void enter_Height(String height) {
		driver.findElement(By.id("cheightmeter")).clear();
		driver.findElement(By.id("cheightmeter")).sendKeys(height);

	}

	@When("Enter Weight {string}")
	public void enter_Weight(String weight) {
		driver.findElement(By.id("ckg")).clear();
		driver.findElement(By.id("ckg")).sendKeys(weight);
	}

	@When("Tap on Calulate BMI")
	public void tap_on_Calulate_BMI() {
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	}

	@Then("Print the BMI Result")
	public void print_the_BMI_Result() {
		String result = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
		System.out.println("Result: " + result);

	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
