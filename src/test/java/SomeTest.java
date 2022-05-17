import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SomeTest {

    @Test
    public void testFirstS () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");



        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");

        Thread.sleep(1000);
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        Assert.assertEquals(searchBox.getAttribute("value"), "Selenium");

        driver.quit();
    }

    @Test
    public void testSecond () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://alawar.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.className("b-search__submit"));

        searchBox.sendKeys("COOKING ACADEMY");

        Thread.sleep(1000);
        searchButton.click();

        WebElement d = driver.findElement(By.xpath("//h1[contains(text(), 'Found 3 games')]"));
        Assert.assertEquals(d.getText(),"FOUND 3 GAMES");

        driver.quit();
    }

    @Test
    public void testThird () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://apteka74.ru");

        WebElement searchBox = driver.findElement(By.id("title-search-input"));
        WebElement searchButton = driver.findElement(By.className("search-form__btn"));

        searchBox.sendKeys("Биофер");

        Thread.sleep(1000);
        searchButton.click();

        String m = driver.findElement(By.className("cat-item__title")).getText();
        Assert.assertEquals (m,"Биофер тб N30");

        driver.quit();
    }


}
