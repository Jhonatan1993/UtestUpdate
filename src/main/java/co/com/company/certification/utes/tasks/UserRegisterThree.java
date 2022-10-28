package co.com.company.certification.utes.tasks;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.userinterface.UtestPageRegisterPartThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class UserRegisterThree implements Task {

    private UtestPageRegisterPartThree utestPageRegisterPartThree;
    private InfoUser infoUser;
    public UserRegisterThree(InfoUser infoUser) {this.infoUser = infoUser;}

    public static UserRegisterThree inUtest(InfoUser infoUser) {
        return Tasks.instrumented(UserRegisterThree.class, infoUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPageRegisterPartThree.COMPUTER_SELECT),
                Enter.theValue(infoUser.getComputer()).into(UtestPageRegisterPartThree.COMPUTER_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.VERSION_SELECT),
                Enter.theValue(infoUser.getVersion()).into(UtestPageRegisterPartThree.VERSION_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.LANGUAGE_SELECT),
                Enter.theValue(infoUser.getLanguaje()).into(UtestPageRegisterPartThree.LANGUAGE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.MOBILE_DEVICE_SELECT),
                Enter.theValue(infoUser.getMobileDevice()).into(UtestPageRegisterPartThree.MOBILE_DEVICE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.MODEL_SELECT),
                Enter.theValue(infoUser.getModel()).into(UtestPageRegisterPartThree.MODEL_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.SYSTEM_SELECT),
                Enter.theValue(infoUser.getOpertaingSystem()).into(UtestPageRegisterPartThree.SYSTEM_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(UtestPageRegisterPartThree.BTN_NEXT_THREE)
        );
    }
}
