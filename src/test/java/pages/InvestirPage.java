package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.InitBrowser;

public class InvestirPage extends elementMaps.InvestirElementMaps {
    private InitBrowser automation = InitBrowser.getInstance();
    private WebDriver driver;

    public InvestirPage() {
        driver = automation.openBrowser();
        driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        PageFactory.initElements(driver, this);
    }

    public void InformarDados(String perfil, String valorAplicar, String valorPoupar, String tempo) {
        //Perfil.click();
        ValorAplicar.sendKeys(valorAplicar);
        ValorInvestir.sendKeys(valorPoupar);
        Tempo.sendKeys(tempo);

        btn_Simular.click();
    }

    public void ValidarResultado(String resultado) {
        boolean status = driver.getPageSource().contains(resultado);

        //assertTrue(status);
    }

    public void InformarDados(String perfil, String valorAplicar, String valorPoupar) {
        Perfil.click();
        ValorAplicar.sendKeys(valorAplicar);
        ValorInvestir.sendKeys(valorPoupar);
    }

    public void ValidarMensagemErro(String mensagem) {
        boolean resultado = false;
        if (Integer.parseInt(ValorAplicar.getText()) < 20)
            resultado = ValorAplicarError.getText().equals(mensagem);

        if (Integer.parseInt(ValorInvestir.getText()) < 20)
            resultado = ValorAplicarError.getText().equals(mensagem);

        assertTrue(resultado);
    }

    public void FechaNavegador() {
        automation.close();
    }
}
