package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends testBase{

    @Before
    public void initialization(){
        start();
    }
    @After
    public void end(){finish();}


    @Given("I go to main page")
    public void iGoToMainPage() {
        main.goTo();
    }
    @When("I choose task {string}")
    public void iChooseTask(String taskNumber) {
        main.chooseTask(taskNumber);
    }

    @When("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String login, String password) {
        TaskSix.fillInLogin(login);
        TaskSix.fillInPassword(password);
        TaskSix.clickTheLoginButton();
    }

    @Then("I should see a defitine link")
    public void iShouldSeeADefitineLink() {
        TaskSix.checkIfTheLinkAppeared();

    }


}
