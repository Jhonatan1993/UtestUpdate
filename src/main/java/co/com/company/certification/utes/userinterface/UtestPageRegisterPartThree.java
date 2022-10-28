package co.com.company.certification.utes.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPageRegisterPartThree extends PageObject {

    public static final Target COMPUTER_SELECT = Target.the("Select Computer").located(By.xpath("//div[@name='osId']"));
    public static final Target COMPUTER_INPUT = Target.the("Input Computer").located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target VERSION_SELECT = Target.the("Select Version").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target VERSION_INPUT = Target.the("Input Version").located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final Target LANGUAGE_SELECT = Target.the("Select Language").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target LANGUAGE_INPUT = Target.the("Input Language").located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final Target MOBILE_DEVICE_SELECT =  Target.the("Select Mobile Device").located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target MOBILE_DEVICE_INPUT =  Target.the("Input Mobile Device").located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target MODEL_SELECT = Target.the("Select Model").located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target MODEL_INPUT = Target.the("Input Model").located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target SYSTEM_SELECT = Target.the("Select Operating system").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target SYSTEM_INPUT = Target.the("Input Operating system").located(By.xpath("//div[@name='handsetOSId']//input"));

    public static final Target BTN_NEXT_THREE = Target.the("Button netx").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
