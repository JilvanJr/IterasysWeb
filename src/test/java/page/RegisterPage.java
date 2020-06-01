package page;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import map.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	
	public void selecionaMarca(String marca) {
		registerMap.marca.click();
		registerMap.inputMarca.sendKeys(marca);
		registerMap.inputMarca.sendKeys(Keys.ENTER);
	}
	
	public void selecionaModelo(String modelo) {
		registerMap.inputModelo.sendKeys(modelo);
		registerMap.inputModelo.sendKeys(Keys.ENTER);
	}
	
	public void clicarFlag() {
		registerMap.clickFlag.click();
	}
	
	public void clicarBuscar() {
		registerMap.clickBuscar.click();
	}
	
	public void validaPrimeiroNome(String nome) {
		Assert.assertEquals(nome, registerMap.validaPrimeiroNome.getText());
	}
	
	public void validaPrimeiroValor(String valor) {
		String h3 = registerMap.validaPrimeiroValorH3.getText();
		String span = registerMap.validaPrimeiroValorSpan.getText();
		String valorCorreto = h3.replace(span,"").trim();
		Assert.assertEquals(valor, valorCorreto);
	}
	
	public void validaSegundoNome(String nome) {
		Assert.assertEquals(nome, registerMap.validaSegundoNome.getText());
	}
	
	public void validaSegundoValor(String valor) {
		String h3 = registerMap.validaSegundoValorH3.getText();
		String span = registerMap.validaSegundoValorSpan.getText();
		String valorCorreto = h3.replace(span,"").trim();
		Assert.assertEquals(valor, valorCorreto);
	}
	
	public void validaAno(String ano) {
		Assert.assertEquals(ano, registerMap.validaAno.getText());
	}
	
	public void validaKm(String km) {
		Assert.assertEquals(km, registerMap.validaKm.getText());
	}
	
	public void validaCor(String cor) {
		Assert.assertEquals(cor, registerMap.validaCor.getText());
	}
	
	public void validaCambio(String cambio) {
		Assert.assertEquals(cambio, registerMap.validaCambio.getText());
	}
}
