package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

import pages.DadoSeguroPage;
import pages.DadoUsuarioPage;
import pages.DadoVeiculoPage;



public class ValidarMensagemConfirmacaoSteps {
	
	WebDriver driver;
    WebDriverWait wait;
    DadoVeiculoPage veiculo = new DadoVeiculoPage(driver);
    DadoUsuarioPage usuario = new DadoUsuarioPage(driver);
    DadoSeguroPage seguro = new DadoSeguroPage(driver);
    
    @Before
    public void iniciar() {
    	System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,30);

    }
	
	@Dado("que o usuário está na página de cadastro de seguro Tricentis")
	public void que_o_usuário_está_na_página_de_cadastro_de_seguro_tricentis() {
		
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
	}

	@Dado("Preenche o formulário na aba Vehicle Data e clica em next")
	public void preenche_o_formulário_na_aba_vehicle_data_e_clica_em_next() {
		
		
		veiculo.selecinaAutomovelMenu();
		veiculo.selecionaMarca();
		veiculo.inserePerformanceMotor();
    	veiculo.insereDataFabricacao();
    	veiculo.selecionaNumeroAssentos();
    	veiculo.selecionaTipoCombustivel();
    	veiculo.insereValorVeiculo();
    	veiculo.insereNumeroPlaca();
    	veiculo.insereMilhagemAnual();
    	veiculo.clicaNext();
		
	}

	@Dado("Preenche o formulário na aba Insurant Data e clica em next")
	public void preenche_o_formulário_na_aba_insurant_data_e_clica_em_next() {

		usuario.insereNomeUsuario();
    	usuario.insereSobreNomeUsuario();
    	usuario.insereDataNascimento();
    	usuario.selecionaGenero();
    	usuario.insereEnderecoUsuario();
    	usuario.selecionaPaisUsuario();
    	usuario.insereCodigoPostal();
    	usuario.insereCidadeUsuario();
    	usuario.selecionaOcupacaoUsuario();
    	usuario.selecionaHobbiesUsuario();
    	usuario.insereSiteUsuario();
    	usuario.clicaNext();
		
	}

	@Dado("Preenche o formulário na aba Product Data e clica em next")
	public void preenche_o_formulário_na_aba_product_data_e_clica_em_next() {
	    
		seguro.insereDataInicioSeguro();
    	seguro.selecionaCapitalSeguro();
    	seguro.selecionaClassificacaoMerito();
    	seguro.selecionaTipoSeguroDanos();
    	seguro.selecionaOpcionais();
    	seguro.selecionaOpcaoCarroReserva();
    	seguro.clicaNext();
		
	}

	@Dado("Preenche o formulário na aba Price Option e clica em next")
	public void preenche_o_formulário_na_aba_price_option_e_clica_em_next() {
	    
		seguro.selecionaTipoSeguro();
    	seguro.clicaEnviarCotacao();
		
	}

	@Dado("Preenche o formulário na aba Send Quote e clica em enviar")
	public void preenche_o_formulário_na_aba_send_quote_e_clica_em_enviar() {
	    
		usuario.insereEmailUsuario();
    	usuario.insereLoginUsuario();
    	usuario.insereSenhaUsuario();
    	usuario.confereSenhaUsuario();
    	usuario.clicaEnviarEmail();
		
	}

	@Então("o usuário deve receber uma {string} de confirmação")
	public void o_usuário_deve_receber_uma_de_confirmação(String msgValidacao) {
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"))).click();
		String validacao = driver.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2")).getText();
		System.out.println(validacao);
		assertEquals(validacao, msgValidacao);
		
	}
	
	@After public void sair() {
	  
	  driver.quit();
		  
	}

}
