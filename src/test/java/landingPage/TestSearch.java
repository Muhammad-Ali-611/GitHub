package landingPage;

import javafx.scene.chart.PieChart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSearch {

        public void TestSearch () {

            WebDriver driver = new FirefoxDriver();
            System.setProperty("webDriver.gecko.driver", "C:\\Users\\chma6\\Links\\GitHub\\driver\\geckodriver.exe");
            driver.get("https://www.mozilla.org/en-US/firefox/");
        }
    }


