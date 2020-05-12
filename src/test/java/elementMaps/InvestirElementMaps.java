package elementMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestirElementMaps {
    @FindBy(id = "perfil")
    protected WebElement Perfil;

    @FindBy(id = "valorAplicar")
    protected WebElement ValorAplicar;

    @FindBy(id = "valorInvestir")
    protected WebElement ValorInvestir;

    @FindBy(id = "tempo")
    protected WebElement Tempo;

    @FindBy(xpath = "//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button")
    protected WebElement btn_Simular;

    @FindBy(id = "valorAplicar-error")
    protected WebElement ValorAplicarError;

    @FindBy(id = "valorInvestir-error")
    protected WebElement ValorInvestirError;

}
