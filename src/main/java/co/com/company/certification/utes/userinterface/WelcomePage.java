package co.com.company.certification.utes.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage extends PageObject {
    public static final Target TEXT_WELCOME = Target.the("Text welcome").located(By.xpath("//div[@class='image-box-header']//h1"));
}
