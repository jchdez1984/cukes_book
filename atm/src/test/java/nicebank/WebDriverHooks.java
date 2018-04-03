package nicebank;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import support.KnowsTheDomain;

public class WebDriverHooks {
    private final KnowsTheDomain helper;

    public  WebDriverHooks(KnowsTheDomain helper){
        this.helper = helper;
    }

    @After
    public void finish(Scenario scenario){
        try {
            byte[] screenshot =
                    helper.getWebDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException e){
            System.err.println(e.getMessage());
        }
    }
}
