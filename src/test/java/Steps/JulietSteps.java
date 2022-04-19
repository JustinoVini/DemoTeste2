package Steps;

import PageObject.Juliet;
import Suporte.Web;
import Tests.TestJuliet;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class JulietSteps extends Web {

	private Juliet juliet = new Juliet();

	@Given("^That i access the pontofrio$")
	public void that_i_access_the_pontofrio() throws Throwable {
		CreateChrome("https://m.pontofrio.com.br/conta/criar");
		WaitingSeconds(5);
	}

	@Given("^and click register button$")
	public void and_click_register_button() throws Throwable {
		juliet.clicaBotaoCadastro(navegador);
	}

	@Given("^select phisical person$")
	public void select_phisical_person() throws Throwable {
		juliet.selecionePessoaFisica(navegador);
	}

	@Given("^fill the field cpf \"([^\"]*)\"$")
	public void fill_the_field_cpf(String arg1) throws Throwable {
		juliet.preencherCampoCpf(navegador);
	}

	@Given("^fill the field name \"([^\"]*)\"$")
	public void fill_the_field_name(String arg1) throws Throwable {
		juliet.preencherCampoNome(navegador);
	}

	@Given("^fill the field celular \"([^\"]*)\"$")
	public void fill_the_field_celular(String arg1) throws Throwable {
		juliet.preencherCampoCelular(navegador);
	}

	@Given("^fill the field dianascimento \"([^\"]*)\"$")
	public void fill_the_field_dianascimento(String arg1) throws Throwable {
		juliet.preencherCampoDiaNascimento(navegador);
	}

	@Given("^fill the field mesnascimento \"([^\"]*)\"$")
	public void fill_the_field_mesnascimento(String arg1) throws Throwable {
		juliet.preencherCampoMesNascimento(navegador);
	}

	@Given("^fill the field anonascimento \"([^\"]*)\"$")
	public void fill_the_field_anonascimento(String arg1) throws Throwable {
		juliet.preencherCampoAnoNascimento(navegador);
	}

	@Given("^fill the field sexo \"([^\"]*)\"$")
	public void fill_the_field_sexo(String arg1) throws Throwable {
		juliet.preencherCampoSexo(navegador);
	}

	@Given("^fill the field email \"([^\"]*)\"$")
	public void fill_the_field_email(String arg1) throws Throwable {
		juliet.preencherCampoEmail(navegador);
	}

	@Given("^fill the field emailconfirm \"([^\"]*)\"$")
	public void fill_the_field_emailconfirm(String arg1) throws Throwable {
		juliet.preencherCampoEmailConfirm(navegador);
	}

	@Given("^fill the field senha \"([^\"]*)\"$")
	public void fill_the_field_senha(String arg1) throws Throwable {
		juliet.preencherCampoSenha(navegador);
	}

	@Given("^fill the field senhaconfirm \"([^\"]*)\"$")
	public void fill_the_field_senhaconfirm(String arg1) throws Throwable {
		juliet.preencherCampoSenhaConfirm(navegador);
	}

	@Given("^click the button finalcadastro \"([^\"]*)\"$")
	public void click_the_button_finalcadastro(String arg1) throws Throwable {
		juliet.clicaBotaoFinalCadastro(navegador);
	}

	@After
	public void tearDown() throws InterruptedException {
		WaitingSeconds(10);
		navegador.quit();
	}
}
