import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class driver {

    public static void main(String[] args) {
        // Inicializa o WebDriver para o Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Opcional: executa o navegador em modo headless (sem interface gráfica)
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://youtube.com/");

        WebElement pesquisa = driver.findElement(By.name("search_query"));
        pesquisa.sendKeys("Java Tutorial");
        pesquisa.submit();
        // Espera até que o elemento de pesquisa esteja visível e interativo
        String digitar = driver.getTitle();
        System.out.println(digitar);
        // Fecha o navegador
        // driver.quit();
    }
}
