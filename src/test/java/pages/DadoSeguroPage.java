package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DadoSeguroPage {

	WebDriver driver;
	public WebDriverWait wait;
	
	By dtInicioSeguro = By.id("startdate");
	By capitalSeguro = By.id("insurancesum");
	By classMerito = By.id("meritrating");
	By seguroDanos = By.id("damageinsurance");
	By selectOpcionais = By.cssSelector("#insurance-form>div>section:nth-child(3)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)>span");
	By selectCarroReserv = By.id("courtesycar");
	By tipoSeguro = By.cssSelector("#priceTable>tfoot>tr>th.group>label:nth-child(2)>span");
	By next = By.id("nextselectpriceoption");
	
	
	public DadoSeguroPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void insereDataInicioSeguro() {
		
		driver.findElement(dtInicioSeguro).sendKeys("08/02/2021");
		
	}
	
	public void selecionaCapitalSeguro() {
		
		WebElement comboSeg = driver.findElement(capitalSeguro);
        Select SelectSeg = new Select(comboSeg);
        SelectSeg.selectByVisibleText("7.000.000,00");
		
	}
	
	public void selecionaClassificacaoMerito() {
		
		WebElement comboMerit = driver.findElement(classMerito);
        Select SelectMerit = new Select(comboMerit);
        SelectMerit.selectByVisibleText("Super Bonus");
		
	}
	
	public void selecionaTipoSeguroDanos() {
		
		WebElement comboDan = driver.findElement(seguroDanos);
        Select SelectDan = new Select(comboDan);
        SelectDan.selectByVisibleText("Full Coverage");
		
	}
	
	public void selecionaOpcionais() {
		
		driver.findElement(selectOpcionais).click();
		
	}
	
	public void selecionaOpcaoCarroReserva() {
		
		WebElement comboRes = driver.findElement(selectCarroReserv);
        Select SelectRes = new Select(comboRes);
        SelectRes.selectByVisibleText("Yes");
		
	}
	
	public void clicaNext() {
		
		driver.findElement(next).click();
		
	}
	
	public void selecionaTipoSeguro() {
		
		driver.findElement(tipoSeguro).click();
		
	}
	
	public void clicaEnviarCotacao() {
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextsendquote"))).click();
		
	}
	
}
