package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DadoVeiculoPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By selAutomovel = By.id("nav_automobile");
	By selMarca = By.id("make");
	By perfMotor = By.id("engineperformance");
	By dtFabricacao = By.id("dateofmanufacture");
	By numLugares = By.id("numberofseats");
	By tpCombustivel = By.id("fuel");
	By valorVeiculo = By.id("listprice");
	By numPlaca = By.id("licenseplatenumber");
	By milAnual = By.id("annualmileage");
	By next = By.id("nextenterinsurantdata");

	
	public DadoVeiculoPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void selecinaAutomovelMenu() {
		
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(selAutomovel)).click();
		
	}
	
	public void selecionaMarca() {
		
		WebElement comboMarca = driver.findElement(selMarca);
    	Select selectMarca = new Select(comboMarca);
    	selectMarca.selectByVisibleText("Audi");
		
	}
	
	public void inserePerformanceMotor() {
		
		driver.findElement(perfMotor).sendKeys("167");
		
	}
	
	public void insereDataFabricacao() {
		
		driver.findElement(dtFabricacao).sendKeys("05/15/2021");
		
	}
	
	public void selecionaNumeroAssentos() {
		
		WebElement comboAssent = driver.findElement(numLugares);
    	Select selectAssent = new Select(comboAssent);
    	selectAssent.selectByVisibleText("4");
		
	}
	
	public void selecionaTipoCombustivel() {
		
		WebElement comboComb = driver.findElement(tpCombustivel);
    	Select selectComb = new Select(comboComb);
    	selectComb.selectByVisibleText("Gas");
		
	}
	
	public void insereValorVeiculo() {
		
		driver.findElement(valorVeiculo).sendKeys("56200");
		
	}
	
	public void insereNumeroPlaca() {
		
		driver.findElement(numPlaca).sendKeys("5TN467");
		
	}
	
	public void insereMilhagemAnual() {
		
		driver.findElement(milAnual).sendKeys("13500");
		
	}
	
	public void clicaNext() {
		
		driver.findElement(next).click();
		
	}

}
