package co.com.company.certification.utes.tasks;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.userinterface.UtestPageRegisterPartOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class UserRegisterOne implements Task {

    private UtestPageRegisterPartOne utestPageRegister;
    private InfoUser infoUser;
    public UserRegisterOne(InfoUser infoUser) {this.infoUser = infoUser;}

    public static UserRegisterOne inUtest(InfoUser infoUser) {
        return Tasks.instrumented(UserRegisterOne.class, infoUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPageRegisterPartOne.BTN_JOIN_TODAY),
                Enter.theValue(infoUser.getFirstName()).into(UtestPageRegisterPartOne.FIRSTNAME_INPUT),
                Enter.theValue(infoUser.getLastName()).into(UtestPageRegisterPartOne.LASTNAME_INPUT),
                Enter.theValue(infoUser.getEmailAdress()).into(UtestPageRegisterPartOne.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(infoUser.getMonth()).from(UtestPageRegisterPartOne.MONTH_SELECT),
                SelectFromOptions.byVisibleText(infoUser.getDay()).from(UtestPageRegisterPartOne.DAY_SELECT),
                SelectFromOptions.byVisibleText(infoUser.getYear()).from(UtestPageRegisterPartOne.YEAR_SELECT),
                Click.on(UtestPageRegisterPartOne.BTN_NEXT)
        );

    }
}
