package map;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	
	public Element marca = new Element(".col-xs-6:nth-child(1) .btn", ByValue.css);
	public Element inputMarca = new Element("//input[@aria-label='Search']", ByValue.xpath, 0);
	public Element inputModelo = new Element("//input[@aria-label='Search']", ByValue.xpath, 1);
	public Element clickFlag = new Element("anunciosNovos", ByValue.id);
	public Element clickBuscar = new Element("div.col-xs-4.p-top-xs > button", ByValue.css);
	public Element validaPrimeiroNome = new Element("h2.esquerda", ByValue.css, 0);
	public Element validaPrimeiroValorH3 = new Element("h3.direita", ByValue.css, 0);
	public Element validaPrimeiroValorSpan = new Element("h3 > span", ByValue.css, 0);
	public Element validaSegundoNome = new Element("h2.esquerda", ByValue.css, 1);
	public Element validaSegundoValorH3 = new Element("h3.direita", ByValue.css, 1);
	public Element validaSegundoValorSpan = new Element("h3 > span", ByValue.css, 1);
	public Element validaAno = new Element("li.primeiro > p", ByValue.css, 0);
	public Element validaKm = new Element("li.usado > p", ByValue.css, 0);
	public Element validaCor = new Element("li:nth-child(3) > p", ByValue.css, 0);
	public Element validaCambio = new Element("li.ultimo > p", ByValue.css, 0);
}
