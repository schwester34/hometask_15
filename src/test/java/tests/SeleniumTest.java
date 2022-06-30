package tests;

import helpers.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest extends TestBase {
    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        String title = driver.getTitle();
        //assertEquals(title, "GitHub: Where the world builds software · GitHub");
        assertTrue(title.contains("Where the world builds software" ));

    }

    @AfterEach
    public void stopDriver() {
        driver.quit();}
}

