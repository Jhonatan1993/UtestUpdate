package co.com.company.certification.utes.stepsdefinitions;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.questions.Answer;
import co.com.company.certification.utes.tasks.UserRegisterFour;
import co.com.company.certification.utes.tasks.UserRegisterOne;
import co.com.company.certification.utes.tasks.UserRegisterThree;
import co.com.company.certification.utes.tasks.UserRegisterTwo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterUtestPageStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jhonatan");
    }

    @Given("^the user in the aplication (.*)$")
    public void theUserInTheAplicationHttpsWwwUtestCom(String page) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(page));
    }


    @When("^the user register in aplication$")
    public void theUserRegisterInAplication(List<InfoUser> infoUsers) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                UserRegisterOne.inUtest(infoUsers.get(0)),
                UserRegisterTwo.inUtest(infoUsers.get(0)),
                UserRegisterThree.inUtest(infoUsers.get(0)),
                UserRegisterFour.inUtest(infoUsers.get(0))
        );

    }

    @Then("^the user should see message$")
    public void theUserShouldSeeMessage(List<InfoUser> infoUsers) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(infoUsers.get(0))));

    }


}
