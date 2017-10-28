package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class HomePageElementMap extends BasePage {

	@FindBy(id= "contact-link")
	protected WebElement linkContato ;
	
	@FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
	protected WebElement botaoIncluirNoCarrinho;
	
	protected WebElement layer_cart;
	
	@FindBy(className = "login")
	protected WebElement linkLogin;
		
}