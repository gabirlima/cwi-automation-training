package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.CreateAccountPage;
import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.pages.treinamento.LoginPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CreateAccountPageSteps {
	
	@Quando("selecionar o tratamento (.*)")
	public void selecionarTratamento(String tratamento) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.selecionarTratamento(tratamento);
		
	}
	
	@E("incluir o nome (.*)")
	public void incluirNome(String nome) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoPrimeiroNome(nome);
	}
	
	@E("incluir o sobrenome (.*)")
	public void incluirSobrenome(String sobrenome) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoSobrenome(sobrenome);
	}
	
	@E("incluir minha senha (.*)")
	public void incluirSenha(String senha) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoSenha(senha);
	}
	
	@E("incluir o endereço (.*)")
	public void incluirEndereco(String endereco) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoEndereco(endereco);
	}
	
	@E("incluir a cidade (.*)")
	public void incluirCidade(String cidade) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoCidade(cidade);
	}
	
	@E("incluir o zipcode (.*)")
	public void incluirZipcode(String zipcode) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoCodigoPostal(zipcode);
	}
	
	@E("o número do celular (.*)")
	public void incluirCelular(String celular) {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.preencherCampoCelular(celular);
	}	
	
	@E("clicar no botão Register")
	public void clicarNoBotaoRegistrar() {
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.selecionarBotaoCriarConta();
	}
}
