package co.com.company.certification.utes.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPageRegisterPartTwo extends PageObject {

    public static final Target CITY_INPUT = Target.the("City").located(By.id("city"));
    public static final Target STATE_SELECT = Target.the("State").located(By.id(""));
    public static final Target POSTAL_CODE_INPUT = Target.the("Postal code").located(By.id("zip"));
    public static final Target COUNTRY_SELECT =  Target.the("Select country").located(By.xpath("//div[@name='countryId']"));
    public static final Target COUNTRY_INPUT =  Target.the("Input country").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BTN_NETX_TWO = Target.the("Boton siguiente").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
