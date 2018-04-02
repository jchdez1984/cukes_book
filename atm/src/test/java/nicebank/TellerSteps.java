package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

public class TellerSteps {
    KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper){
        this.helper = helper;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), amount);
    }
}
