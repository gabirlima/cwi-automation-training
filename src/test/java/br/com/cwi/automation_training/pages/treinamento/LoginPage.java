package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class LoginPage extends LoginPageElementMap {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void preencherCampoEmailParaIncluirUsuario(String email) {
		email_create.sendKeys(email);
		
	}
	
	public void selecionarBotaoCriarContar() {
		SubmitCreate.click();
	}
}