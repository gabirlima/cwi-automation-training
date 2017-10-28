package br.com.cwi.automation_training.steps.treinamento;

import br.com.cwi.automation_training.pages.treinamento.ContactPage;
import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class ContactPageSteps {
	
	@Quando("eu seleciono o assunto da mensagem")
	public void selecionarAssuntoDaMensagem() {
		ContactPage contactPage = new ContactPage();
		contactPage.selecionarAssunto();
		
	}
	
	@E("preencho com o e-mail \"(.*)\"")
	public void preencherCampoEmail(String email) {
		ContactPage contactPage = new ContactPage();
		contactPage.preencherCampoEmail(email);
	}
	
	@E("preencho com o número do pedido \"(.*)\"")
	public void preencherCampoNumeroPedido(String pedido) {
		ContactPage contactPage = new ContactPage();
		contactPage.preencherCampoNumeroPedido(pedido);
	}
	
	@E("preencho o campo mensagem")
	public void preencherCampoMensagem() {
		ContactPage contactPage = new ContactPage();
		contactPage.preencherCampoMensagem();
	}
	
	@E("clico no botão Send")
	public void selecionarBotaoEnviar() {
		ContactPage contactPage = new ContactPage();
		contactPage.clicarNoBotaoEnviar();
	}
	
	@Entao("deve exibir o alert de mensagem enviada")
	public void verificarAlertDeMensagemEnviadaComSucesso() {
		ContactPage contactPage = new ContactPage();
		Assert.assertTrue(contactPage.verificarAlertSucesso());
	}

}
