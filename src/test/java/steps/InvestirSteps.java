package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InvestirPage;

public class InvestirSteps {
    InvestirPage investirPage;// = new InvestirPage();

    @Given("^Eu estou na tela inicial$")
    public void euEstouNaTelaInicial() {
        investirPage = new InvestirPage();
    }

    @When("^Eu informo os valores de \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
    public void euInformoOsValoresDeE(String perfil, String valorAplicar, String valorPoupar, String tempo) {
        investirPage.InformarDados(perfil, valorAplicar, valorPoupar, tempo);
    }

    @And("^Clico no botão Simular$")
    public void clicoNoBotãoSimular() {
    }

    @Then("^Eu vejo os dados da simulacao \"([^\"]*)\"$")
    public void euVejoOsDadosDaSimulacao(String resultado) {
        investirPage.ValidarResultado(resultado);
    }

    @When("^Eu informo os valores de \"([^\"]*)\", \"([^\"]*)\",, \"([^\"]*)\"$")
    public void euInformoOsValoresDe(String perfil, String valorAplicar, String valorPoupar) {
        investirPage.InformarDados(perfil, valorAplicar, valorPoupar);
    }

    @Then("^Eu vejo a mensagem de erro \"([^\"]*)\">$")
    public void euVejoAMensagemDeErro(String mensagem) {
        investirPage.ValidarMensagemErro(mensagem);
    }

    @And("^Fecho o navegador$")
    public void fechoONavegador() {
        investirPage.FechaNavegador();
    }
}
