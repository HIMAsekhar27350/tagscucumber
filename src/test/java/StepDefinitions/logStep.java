package StepDefinitions;

import io.cucumber.java.en.*;

public class logStep {


  //@SmokeTest
    @Given("launch Chrome browser and land on Google.com website")
    public void launch_chrome_browser_and_land_on_google_com_website() {
        System.out.println("----------=======@SmokeTest======is succeccfully completed");
        System.out.println("launch Chrome browser and land on Google.com website");
    }

    @When("Click on Images link")
    public void click_on_images_link() {
        System.out.println("Click on Images link");
    }
    @Then("Search for Bengaluru images and hit Enter button")
    public void search_for_bengaluru_images_and_hit_enter_button() {
        System.out.println("Search for Bengaluru images and hit Enter button");
    }
    @Then("Close the browser")
    public void close_the_browser() {
        System.out.println("Close the browser");
    }

//@HimaTest
    @Given("launching Chrome browser and land on Google.com website")
    public void launching_chrome_browser_and_land_on_google_com_website() {
        System.out.println("----------=======@HimaTest======is succeccfully completed");
        System.out.println("launching Chrome browser and land on Google.com website");
    }
    @When("Click on the Images link")
    public void click_on_the_images_link() {
        System.out.println("Click on the Images link");
    }
    @Then("Searching for Punganur images and hit Enter button")
    public void searching_for_punganur_images_and_hit_enter_button() {
        System.out.println("Searching for Punganur images and hit Enter button");
    }
    @Then("Closeing the browser")
    public void closeing_the_browser() {
        System.out.println("Closeing the browser");
    }


//@logTest
@Given("launch Chrome browser and land on www.google.com website")
public void launch_chrome_browser_and_land_on_www_google_com_website() {
    System.out.println("----------=======@logTest======is succeccfully completed");
    System.out.println("launch Chrome browser and land on www.google.com website");
}
    @When("hit on the images link")
    public void hit_on_the_images_link() {
        System.out.println("hit on the images link");
    }
    @Then("searching the Roman regins photos and hit the enter button")
    public void searching_the_roman_regins_photos_and_hit_the_enter_button() {
        System.out.println("searching the Roman regins photos and hit the enter button");
    }
    @Then("close the chrome browser")
    public void close_the_chrome_browser() {
        System.out.println("close the chrome browser");
    }
}
