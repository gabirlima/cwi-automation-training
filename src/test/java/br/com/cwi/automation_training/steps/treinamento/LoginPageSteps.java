package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.pages.treinamento.LoginPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginPageSteps {
	
	@E("preenchi o campo email com (.*)")
	public void preencherCampoEmailParaCriarConta(String email) {
		LoginPage loginPage = new LoginPage();
		loginPage.preencherCampoEmailParaIncluirUsuario(email);
	}
	
	@E("selecionei o botão Create an account")
	public void selecionarBotaoCriarConta() {
		LoginPage loginPage = new LoginPage();
		loginPage.selecionarBotaoCriarContar();
	}

}
