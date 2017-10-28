package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class ContactPage extends ContactPageElementMap {

	public ContactPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void selecionarAssunto() {
		id_contact.click();
		opcaoCustomerService.click();
	}
	
	public void preencherCampoEmail(String valorEmail) {
		email.sendKeys(valorEmail);
	}
	
	public void preencherCampoNumeroPedido(String pedido) {
		id_order.sendKeys(pedido);
	}
	
	public void preencherCampoMensagem() {
		String mensagem = "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";
		message.sendKeys(mensagem);
	}
	
	public void clicarNoBotaoEnviar() {
		submitMessage.click();
	}
	
	public boolean verificarAlertSucesso() {
		return alertSucesso.getText().contains("Your message has been successfully sent to our team.");
	}
	
}