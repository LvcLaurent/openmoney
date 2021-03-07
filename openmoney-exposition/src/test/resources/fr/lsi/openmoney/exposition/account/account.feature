#Author: lau.sion@gmail.com
# Scénario pour le service d'authentification
@tag
Feature: account
  Le service account permet la création de compte, le changement de mot de passe, ainsi que tout la partie modification et connexion à l API

  @tag1
  Scenario Outline: Test du WebService de creation via la request account
    Given Construction de la request avec le "<login>", "<mdp>", "<prenom>", "<nom>", "<mail>", "<tel>", "<rue>", "<codeP>", "<ville>" et la "<birthDate>"
    When Verification de la requete
    Then Verification du <code> et si appel OK alors test de la presence du login

    Examples: 
      | login     | mail                  | mdp       | tel        | nom  | prenom | rue                 | codeP | ville  | birthDate  | code |
      | LvcMarcel | newadress@hotmail.com | Qsdfgh21! | 0855221144 | Sion | bilbon | 134 rue jean jaures | 59172 | Roeulx | 05-04-1988 | 200  |
      | LvcLaurent| nsdfdress@hotmail.com | Qsdfgh21! |            | Sion | bilbon | 134 rue jean jaures | 59172 | Roeulx | 05-04-1988 | 200  |
      | LvcLaurent|                       | Qsdfgh21! | 0855221144 | Sion | bilbon | 134 rue jean jaures | 59172 | Roeulx | 05-04-1988 | 400  |
      | LvcLaurent| newadress@hotmail.com | Qsdfgh21! | 0855221144 | Sion | bilbon | 134 rue jean jaures | 59172 | Roeulx |            | 400  |
      |           |                       |           |            |      |        |                     |       |        |            | 400  |
      | LvcLuurent| sdfzfrrss@hotmail.com | Azerty245 | 0855245144 |      |        |                     |       |        | 05-04-1988 | 2008 |
      | LvcLuurent| sdfzfrrss@hotmail.com | Azerty2!5 | 45886512   |      |        |                     |       |        | 05-04-1988 | 2003 |
      | LvcLuurent| sdfzfrrss@hotmail.com | Azerty2!5 | 8855221144 |      |        |                     |       |        | 05-04-1988 | 2003 |
      | LvcLuurent| plop@gmail            | Azerty2!5 | 0855221144 |      |        |                     |       |        | 05-04-1988 | 400  |
      | LvcLuurent| plop.g@gmail.com      | Azerty2!5 | 0855221144 |      |        |                     |       |        | 05/04/1988 | 400  |
      | LvcLuurent| plop.g@gmail.com      | Azerty2!5 | 0855221144 |      |        |                     |       |        | 1988-02-01 | 400  |
      | LvcLuurent| plop.g@gmail.com      | Azerty2!5 | 0845921144 |      |        |                     |       |        | 05-04-1988 | 200  |
