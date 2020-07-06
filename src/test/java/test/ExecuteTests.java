package test;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import core.Driver;
import page.RegisterPage;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesCarros.csv")
public class ExecuteTests {
	RegisterPage registerPage = new RegisterPage();
	
	@Before
	public void abreNavegador() {
		Driver.setDriver("https://www.icarros.com.br/principal/index.jsp");
	}
	
	@Test
	public void consultaCarros(){
		
		//	1) Crie uma consulta que retorne uma lista com pelo menos 3 carros 
		//	usados da mesma marca modelo, os demais critérios da consulta são a sua escolha
		registerPage.selecionaMarca("Audi");
		registerPage.selecionaModelo("A3");
		registerPage.clicarFlag();
		registerPage.clicarBuscar();
		
		//  2) Valide o modelo e o valor à vista do primeiro e do segundo carro 
		//  da lista produzida pela consulta
		registerPage.validaPrimeiroNome("Audi A3 1.4 TFSI Sportback Ambiente S Tronic");
		registerPage.validaPrimeiroValor("R$ 122.900,00");
		registerPage.validaSegundoNome("Audi A3 1.4 TFSI Sportback Ambiente S Tronic");
		registerPage.validaSegundoValor("R$ 77.800,00");
	}
	
		//  4) Outro script deve ler a lista de carros criada na tabela anterior, 
		//  buscar pelos veiculos e validar se os dados, especialmente o valor à 
		//  vista continuam os mesmos.

	@Test
	public void mapearElementos(
			@Param(name="marca")String marca, 
			@Param(name="modelo")String modelo, 
			@Param(name="nome")String nome,
			@Param(name="valor")String valor,
			@Param(name="ano")String ano,
			@Param(name="km")String km,
			@Param(name="cor")String cor,
			@Param(name="cambio")String cambio) 
	{	
		registerPage.selecionaMarca(marca);
		registerPage.selecionaModelo(modelo);
		registerPage.clicarFlag();
		registerPage.clicarBuscar();
		registerPage.validaPrimeiroNome(nome);
		registerPage.validaPrimeiroValor(valor);
		registerPage.validaAno(ano);
		registerPage.validaKm(km);
		registerPage.validaCor(cor);
		registerPage.validaCambio(cambio);
	}
		
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
	}
}
