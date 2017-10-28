package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomePageSteps {
	
	@Dado("que acessei a homepage")
	public void acessarHomePage() {
		TestRule.openApplicationChrome("http://automationpractice.com/");
		
	}
	
	@E("cliquei no link \"Contact us\"")
	public void clicarNoLink() {
		HomePage homePage = new HomePage();
		homePage.clicarNoLinkContato();
	}
	
	@Quando("adiciono produto no carrinho")
	public void incluirProdutoNoCarrinho() {
		HomePage homePage = new HomePage();
		homePage.incluirProdutoNoCarrinho();
	}
	
	@Entao("deve exibir o alert de produto incluído no carrinho com sucesso")
	public void verificarAlertIncluidoNoCarrinho() {
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.verificarProdutoIncluidoNoCarrinho());
	}
	
	@E("selecionei o link Sign in")
	public void selecionarLinkSignIn() {
		HomePage homePage = new HomePage();
		homePage.clicarNoLinkLogin();
	}

}
