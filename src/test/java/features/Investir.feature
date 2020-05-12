#Author: alexandreeulampio@gmail.com

Feature: Simular investimento
  Eu quero simular um investimento
  Para exibir o dados da simulacao

  Scenario Outline: Simular investimento na poupanca
    Given Eu estou na tela inicial
    When Eu informo os valores de "<Perfil>", "<ValorAplicar>", "<ValorPoupar>" e "<Tempo>"
    And Clico no botão Simular
    Then Eu vejo os dados da simulacao "<Resultado>"
    And Fecho o navegador

    Examples:
      | Perfil           | ValorAplicar | ValorPoupar | Tempo | Resultado                          |
      | Para voce        | 20,00        | 20,00       | 1     | Veja estas outras opções para você |
      | Para sua Empresa | 21,00        | 21,00       | 1     | Veja estas outras opções para você |

  Scenario Outline: Simular valor minimo a aplicar
    Given Eu estou na tela inicial
    When Eu informo os valores de "<Perfil>", "<ValorAplicar>",, "<ValorPoupar>"
    Then Eu vejo a mensagem de erro "<Mensagem">

    Examples:
      | Perfil           | ValorAplicar | ValorPoupar | Resultado             |
      | Para voce        | 19,00        | 20,00       | Valor mínimo de 20.00 |
      | Para sua Empresa | 21,00        | 19,00       | Valor mínimo de 20.00 |
      | Para sua Empresa | 19,00        | 19,00       | Valor mínimo de 20.00 |
      | Para sua Empresa | 0,00         | 0,00        | Valor mínimo de 20.00 |