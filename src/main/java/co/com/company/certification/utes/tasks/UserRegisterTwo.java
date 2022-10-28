package co.com.company.certification.utes.tasks;

import co.com.company.certification.utes.models.InfoUser;
import co.com.company.certification.utes.userinterface.UtestPageRegisterPartTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UserRegisterTwo implements Task {

    private UtestPageRegisterPartTwo utestPageRegisterPartTwo;
    private InfoUser infoUser;
    public UserRegisterTwo(InfoUser infoUser) {this.infoUser = infoUser;}

    public static UserRegisterTwo inUtest(InfoUser infoUser) {
        return Tasks.instrumented(UserRegisterTwo.class, infoUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(infoUser.getCity()).into(UtestPageRegisterPartTwo.CITY_INPUT),
                Enter.theValue(infoUser.getPostalCode()).into(UtestPageRegisterPartTwo.POSTAL_CODE_INPUT),
                Click.on(UtestPageRegisterPartTwo.COUNTRY_SELECT),
                Enter.theValue(infoUser.getCountry()).into(UtestPageRegisterPartTwo.COUNTRY_INPUT),
                Click.on(UtestPageRegisterPartTwo.BTN_NETX_TWO)

        );

    }
}
