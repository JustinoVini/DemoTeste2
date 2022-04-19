package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Juliet {


	public void clicaBotaoCadastro(WebDriver navegador) {
		WebElement rbPessoafisica = navegador.findElement(By.xpath("//label[@class='input-label radio-label radio-label-text']"));
		rbPessoafisica.click();
	}

	public void selecionePessoaFisica(WebDriver navegador) {
		WebElement rbPessoafisica = navegador.findElement(By.xpath("//label[@class='input-label radio-label radio-label-text']"));
		rbPessoafisica.click();
	}

	public void preencherCampoCpf(WebDriver navegador) {
		WebElement campoCpf = navegador.findElement(By.xpath("//input[@name='cpf']"));
		campoCpf.sendKeys();
	}

	public void preencherCampoNome(WebDriver navegador) {
		WebElement campoName = navegador.findElement(By.xpath("//input[@name='name']"));
		campoName.sendKeys();
	}

	public void preencherCampoCelular(WebDriver navegador) {
		WebElement campoTelefone = navegador.findElement(By.xpath("//input[@name='cellphone']"));
		campoTelefone.sendKeys();
	}

	public void preencherCampoDiaNascimento(WebDriver navegador) {
		WebElement campoDianascimento = navegador.findElement(By.xpath("//input[@name='birthDay']"));
		campoDianascimento.sendKeys();
	}

	public void preencherCampoMesNascimento(WebDriver navegador) {
		WebElement campoMesnascimento = navegador.findElement(By.xpath("//input[@name='birthMonth']"));
		campoMesnascimento.sendKeys();
	}

	public void preencherCampoAnoNascimento(WebDriver navegador) {
		WebElement campoAnonascimento = navegador.findElement(By.xpath("//input[@name='birthYear']"));
		campoAnonascimento.sendKeys();
	}

	public void preencherCampoSexo(WebDriver navegador) {
		WebElement campoSexo = navegador.findElement(By.xpath("//select[@name='gender']"));
		campoSexo.click();
		campoSexo.sendKeys();
		campoSexo.click();
	}

	public void preencherCampoEmail(WebDriver navegador) {
		WebElement campoEmail = navegador.findElement(By.xpath("//input[@id='email']"));
		campoEmail.sendKeys();
	}

	public void preencherCampoEmailConfirm(WebDriver navegador) {
		WebElement campoEmailconfirmation = navegador.findElement(By.xpath("//input[@id='emailConfirmation']"));
		campoEmailconfirmation.sendKeys();
	}

	public void preencherCampoSenha(WebDriver navegador) {
		WebElement campoSenha = navegador.findElement(By.xpath("//input[@id='password']"));
		campoSenha.sendKeys();
	}

	public void preencherCampoSenhaConfirm(WebDriver navegador) {
		WebElement campoSenhaconfirmation = navegador.findElement(By.xpath("//input[@name='passwordConfirmation']"));
		campoSenhaconfirmation.sendKeys();
	}

	public void clicaBotaoFinalCadastro(WebDriver navegador) {
		WebElement btnEnter = navegador.findElement(By.id("btnClienteRegister"));
		btnEnter.sendKeys(Keys.ENTER);
	}

}
