package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class CreateAccountPage extends CreateAccountPageElementMap {

	public CreateAccountPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void selecionarTratamento(String tratamento) {
		if(tratamento == "Mr") {
			id_gender1.click();
		} else {
			if(tratamento == "Mrs") {
				id_gender2.click();
			}
		}
		
	}
	
	public void preencherCampoPrimeiroNome(String nome) {
		customer_firstname.sendKeys(nome);
	}
	
	public void preencherCampoSobrenome(String sobrenome) {
		customer_lastname.sendKeys(sobrenome);
	}
	
	public void preencherCampoSenha(String senha) {
		passwd.sendKeys(senha);
	}
	
	public void preencherCampoEndereco(String endereco) {
		address1.sendKeys(endereco);
	}
	
	public void preencherCampoCidade(String cidade) {
		city.sendKeys(cidade);
	}
	
	public void preencherCampoCodigoPostal(String codPostal) {
		postcode.sendKeys(codPostal);
	}
	
	public void preencherCampoCelular(String celular) {
		phone_mobile.sendKeys(celular);
	}
	
	public void selecionarBotaoCriarConta() {
		submitAccount.click();
	}
	
}