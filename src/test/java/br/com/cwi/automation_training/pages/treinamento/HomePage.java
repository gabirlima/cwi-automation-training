package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class HomePage extends HomePageElementMap {

	public HomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void clicarNoLinkContato() {
		linkContato.click();
	}
	
	public void incluirProdutoNoCarrinho() {
		botaoIncluirNoCarrinho.click();
	}
	
	public boolean verificarProdutoIncluidoNoCarrinho() {
		return layer_cart.getText().contains("Product successfully added to your shopping cart");
	}
	
	public void clicarNoLinkLogin() {
		linkLogin.click();
	}
}