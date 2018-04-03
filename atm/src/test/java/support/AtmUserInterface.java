package support;

import nicebank.Account;
import nicebank.Teller;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {
    private final EventFiringWebDriver webDriver;


    public AtmUserInterface() {
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void withdrawFrom(Account account, int dollars) {
        webDriver.get("http://192.168.0.5:9988/");
    }
}
