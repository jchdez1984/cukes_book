package support;

import nicebank.Account;
import nicebank.Teller;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {
    private final EventFiringWebDriver webDriver;


    public AtmUserInterface() {
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            webDriver.get("http://192.168.0.5:9988/");
            webDriver.findElement(By.id("amount")).sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("withdraw")).click();
        } finally {
            webDriver.close();
        }
    }
}
