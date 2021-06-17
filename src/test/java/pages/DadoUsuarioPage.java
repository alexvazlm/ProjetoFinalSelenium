package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DadoUsuarioPage {

	WebDriver driver;
	
	By nome = By.id("firstname");
	By sobreNome = By.id("lastname");
	By emailUsuario = By.id("email");
	By loginUsuario = By.id("username");
	By senhaUsuario = By.id("password");
	By confirmSenhaUsuario = By.id("confirmpassword");
	By dtNascimento = By.id("birthdate");
	By genero = By.cssSelector("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(1)>span");
	By endereco = By.id("streetaddress");
	By pais = By.id("country");
	By codigPostal = By.id("zipcode");
	By cidade = By.id("city");
	By ocupacao = By.id("occupation");
	By hobbie1 = By.cssSelector("#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(2)>span");
	By hobbie2 = By.cssSelector("#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(4)>span");
	By site = By.id("website");
	By nextButton = By.id("nextenterproductdata");
	By sendEmail = By.id("sendemail");
	
	
	public DadoUsuarioPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void insereNomeUsuario() {
		
		driver.findElement(nome).sendKeys("Alex");
		
	}
	
	public void insereSobreNomeUsuario() {
		
		driver.findElement(sobreNome).sendKeys("Vaz");
		
	}
	
	public void insereDataNascimento() {
		
		driver.findElement(dtNascimento).sendKeys("09/17/1992");
		
	}
	
	public void selecionaGenero() {
		
		driver.findElement(genero).click();
		
	}
	
	public void insereEnderecoUsuario() {
		
		driver.findElement(endereco).sendKeys("Rua Antônio Cândido da Silva");
		
	}
	
	public void selecionaPaisUsuario() {
		
		WebElement comboPais = driver.findElement(pais);
		Select SelectPais = new Select(comboPais);
		SelectPais.selectByVisibleText("Brazil");
		
	}
	
	
	public void insereCodigoPostal() {
		
		driver.findElement(codigPostal).sendKeys("11722000");
		
	}
	
	public void insereCidadeUsuario() {
		
		driver.findElement(cidade).sendKeys("Praia Grande");
		
	}
	
	public void selecionaOcupacaoUsuario() {
		
		WebElement comboOcup = driver.findElement(ocupacao);
    	Select SelectOcup = new Select(comboOcup);
    	SelectOcup.selectByVisibleText("Selfemployed");
		
	}
	
	public void selecionaHobbiesUsuario() {
		
		driver.findElement(hobbie1).click();
		driver.findElement(hobbie2).click();
		
	}
	
	public void insereSiteUsuario() {
		
		driver.findElement(site).sendKeys("https://www.linkedin.com/in/alexvazlm/");
		
	}
	
	public void clicaNext() {
		
		driver.findElement(nextButton).click();
		
	}
	
	public void insereEmailUsuario() {
		
		driver.findElement(emailUsuario).sendKeys("Alexvz@live.co.uk");
		
	}
	
	public void insereLoginUsuario() {
		
		driver.findElement(loginUsuario).sendKeys("Alexvaz");
		
	}
	
	public void insereSenhaUsuario() {
		
		driver.findElement(senhaUsuario).sendKeys("Alex123456");
		
	}
	
	public void confereSenhaUsuario() {
		
		driver.findElement(confirmSenhaUsuario).sendKeys("Alex123456");
		
	}
	
	public void clicaEnviarEmail() {
		
		driver.findElement(sendEmail).click();
		
	}
	
}
