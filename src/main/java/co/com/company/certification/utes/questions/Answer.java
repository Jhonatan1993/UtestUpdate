package co.com.company.certification.utes.questions;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {


    private InfoUser infoUser;
    public Answer(InfoUser infoUser) {this.infoUser = infoUser;}

    public static Answer toThe(InfoUser infoUser) {return new Answer(infoUser);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeText = Text.of(WelcomePage.TEXT_WELCOME).viewedBy(actor).asString();

        if (infoUser.getStrConfirmWelcome().equals(welcomeText)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
