package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.CreateAccountPage;
import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.pages.treinamento.LoginPage;
import br.com.cwi.automation_training.pages.treinamento.MyAccountPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class MyAccountPageSteps {
	
	@Entao("devo visualizar tela Minha Conta")
	public void visualizarTelaMinhaConta() {
		MyAccountPage myAccountPage = new MyAccountPage();
		Assert.assertTrue(myAccountPage.verificarTelaMinhaConta());
	}
	
	
}
