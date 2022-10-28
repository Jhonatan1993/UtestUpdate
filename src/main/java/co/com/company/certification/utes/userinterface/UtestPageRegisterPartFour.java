package co.com.company.certification.utes.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPageRegisterPartFour extends PageObject {
    public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECK_ONE = Target.the("Select check one").located(By.id("termOfUse"));
    public static final Target CHECK_TWO = Target.the("Select check two").located(By.id("privacySetting"));
    public static final Target BTN_COMPLETE = Target.the("Complete setup").located(By.id("laddaBtn"));

}
