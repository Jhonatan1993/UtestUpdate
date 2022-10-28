package co.com.company.certification.utes.tasks;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.userinterface.UtestPageRegisterPartFour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UserRegisterFour implements Task {

    private UtestPageRegisterPartFour utestPageRegisterPartFour;
    private InfoUser infoUser;
    public UserRegisterFour(InfoUser infoUser) {this.infoUser = infoUser;}

    public static UserRegisterFour inUtest(InfoUser infoUser) {
        return Tasks.instrumented(UserRegisterFour.class, infoUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(infoUser.getPassword()).into(UtestPageRegisterPartFour.PASSWORD),
                Enter.theValue(infoUser.getPassword()).into(UtestPageRegisterPartFour.CONFIRM_PASSWORD),
                Click.on(UtestPageRegisterPartFour.CHECK_ONE),
                Click.on(UtestPageRegisterPartFour.CHECK_TWO),
                Click.on(UtestPageRegisterPartFour.BTN_COMPLETE)
        );
    }
}
