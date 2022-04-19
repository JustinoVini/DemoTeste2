Feature: Cadastro de Usuarios ponto frio
   

  Scenario Outline: Here i do the title of my scenario 
   	Given That i access the pontofrio
    And and click register button    
    And select phisical person
    And fill the field cpf "<CPF>"
    And fill the field name "<name>"
    And fill the field celular "<celular>"
    And fill the field dianascimento "<dianascimento>"
    And fill the field mesnascimento "<mesnascimento>"
    And fill the field anonascimento "<anonascimento>"
    And fill the field sexo "<sexo>"
    And fill the field email "<email>"
    And fill the field emailconfirm "<emailconfirm>"
    And fill the field senha "<senha>"
    And fill the field senhaconfirm "<senhaconfirm>"
   	And click the button finalcadastro "<finalcadastro>"

    Examples: 
      | cpf         | name    | celular   | dianascimento | mesnascimento | anonascimento | sexo      | email                   | emailconfirm            | senha  | senhaconfirm | finalcadastro |
      | 11111111111 | Joaquim | 999999999 | 03            | 05            | 1989          | Masculino | joaquim.silva@gmail.com | joaquim.silva@gmail.com | 123456 | 123456       | enter         |
      | 22222222222 | Jose    | 988888888 | 04            | 04            | 1991          | Masculino | jose.neto@gmail.com     | jose.neto@gmail.com     | 654321 | 654321       | enter         |
