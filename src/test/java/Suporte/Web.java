package Suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class Web {
	protected WebDriver navegador;
	
	@BeforeTest
	public void CreateChrome(String URL) {
		System.setProperty("webdriver.chrome.driver", "src/lib/CHR/chromedriver");
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		this.navegador = new ChromeDriver();
		this.navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		final ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("window-size-1920,1080");
		chromeOptions.addArguments("start-maximized"); // abre o browser no tamanho maximizado
		chromeOptions.addArguments("disable-infobars"); // desabilita barra de informações.
		chromeOptions.addArguments("--disable-extensions"); // desabilita extensões
		chromeOptions.addArguments("--disable-gpu"); // Aplicações para o windows somente.
		chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		
		DesiredCapabilities capForChrome = DesiredCapabilities.chrome();
		capForChrome.setCapability(ChromeOptions.CAPABILITY, capForChrome);
		
		this.navegador.get(URL);
		
	}
	
	public void WaitingSeconds(int segundos) throws InterruptedException {
		Thread.sleep(1000 * segundos);
	}
}
