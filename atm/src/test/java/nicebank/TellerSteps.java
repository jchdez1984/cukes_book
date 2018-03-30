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

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
