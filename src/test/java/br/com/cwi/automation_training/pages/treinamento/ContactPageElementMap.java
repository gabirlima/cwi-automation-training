package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class ContactPageElementMap extends BasePage {

	protected WebElement id_contact;
	
	@FindBy(css = "#id_contact > option:nth-child(2)")
	protected WebElement opcaoCustomerService;
	
	protected WebElement email;
	
	protected WebElement id_order;
	
	protected WebElement message;
	
	protected WebElement submitMessage;
	
	@FindBy(className = "alert alert-success")
	protected WebElement alertSucesso;
	
		
}