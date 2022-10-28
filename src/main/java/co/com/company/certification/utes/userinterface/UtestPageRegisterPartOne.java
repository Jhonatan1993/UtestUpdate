package co.com.company.certification.utes.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPageRegisterPartOne extends PageObject {

    public static final Target BTN_JOIN_TODAY = Target.the("Boton opcion registrar").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRSTNAME_INPUT = Target.the("Ingresar Nombre").located(By.id("firstName"));
    public static final Target LASTNAME_INPUT = Target.the("Ingresar apellido").located(By.id("lastName"));
    public static final Target EMAIL_INPUT =  Target.the("Ingresar email").located(By.id("email"));
    public static final Target MONTH_SELECT = Target.the("").located(By.id("birthMonth"));
    public static final Target DAY_SELECT = Target.the("").located(By.id("birthDay"));
    public static final Target YEAR_SELECT = Target.the("").located(By.id("birthYear"));
    public static final Target BTN_NEXT = Target.the("").located(By.xpath("//a[@class='btn btn-blue']"));
}
