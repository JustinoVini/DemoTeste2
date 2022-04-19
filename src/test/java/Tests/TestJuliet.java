package Tests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Web;

public class TestJuliet extends Web {
	
	@Test
	public void TestCharlie() throws InterruptedException {
		
		CreateChrome("https://m.pontofrio.com.br/conta/criar");

		WebElement rbPessoafisica = navegador.findElement(By.xpath("//label[@class='input-label radio-label radio-label-text']"));
		WebElement campoCpf = navegador.findElement(By.xpath("//input[@name='cpf']"));
		WebElement campoName = navegador.findElement(By.xpath("//input[@name='name']"));
		WebElement campoTelefone = navegador.findElement(By.xpath("//input[@name='cellphone']"));
		WebElement campoDianascimento = navegador.findElement(By.xpath("//input[@name='birthDay']"));
		WebElement campoMesnascimento = navegador.findElement(By.xpath("//input[@name='birthMonth']"));
		WebElement campoAnonascimento = navegador.findElement(By.xpath("//input[@name='birthYear']"));
		WebElement campoSexo = navegador.findElement(By.xpath("//select[@name='gender']"));
		WebElement campoEmail = navegador.findElement(By.xpath("//input[@id='email']"));
		WebElement campoEmailconfirmation = navegador.findElement(By.xpath("//input[@id='emailConfirmation']"));
		WebElement campoSenha = navegador.findElement(By.xpath("//input[@id='password']"));
		WebElement campoSenhaconfirmation = navegador.findElement(By.xpath("//input[@name='passwordConfirmation']"));
		rbPessoafisica.click();
		campoCpf.sendKeys("01234567890");
		campoName.sendKeys("Vinicius Silva Barreto Justino");
		campoTelefone.sendKeys("11962631101");
		campoDianascimento.sendKeys("03");
		campoMesnascimento.sendKeys("07");
		campoAnonascimento.sendKeys("2000");
		campoSexo.click();
		campoSexo.sendKeys("masculino");
		campoSexo.click();
		campoEmail.sendKeys("vinicius.justino@gmail.com");
		campoEmailconfirmation.sendKeys("vinicius.justino@gmail.com");
		campoSenha.sendKeys("oliver123");
		campoSenhaconfirmation.sendKeys("oliver123");
		WaitingSeconds(5);
	}

	@After
	public void tearDown() {
		navegador.quit();
	}

}
