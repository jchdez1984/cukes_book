package hooks;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

public class SomeTestHooks {
    @Before
    public void beforeCallingScenario() {
        System.out.println("*********** About to start the scenario.");
    }

    @After
    public void afterRunningScenario(Scenario scenario) {
        System.out.println("*********** Just finished running scenario: " + scenario.getStatus());
    }
}
