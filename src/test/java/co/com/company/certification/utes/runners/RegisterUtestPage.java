package co.com.company.certification.utes.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\register_utes_page.feature",
        glue = "co.com.company.certification.utes.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@CaseOne"
)


public class RegisterUtestPage {
}
