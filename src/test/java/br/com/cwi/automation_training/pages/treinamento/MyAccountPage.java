package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class MyAccountPage extends MyAccountPageElementMap {

	public MyAccountPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public boolean verificarTelaMinhaConta() {
		return center_column.getText().contains("My account");
	}
	
}