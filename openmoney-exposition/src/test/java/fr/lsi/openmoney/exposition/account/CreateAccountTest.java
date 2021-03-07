package fr.lsi.openmoney.exposition.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Create user account Test
 *
 * @author Laurent SION
 *
 */
public class CreateAccountTest extends TestConfig {

	@Given("Construction de la request avec le {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} et la {string}")
	public void construction_de_la_request_avec_le_et_la(final String login, final String mdp, final String prenom,
			final String nom, final String mail, final String tel, final String rue, final String codeP,
			final String ville, final String birthDate) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Verification de la requete")
	public void simulation_de_l_appel() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Verification du {int} et si appel OK alors test de la presence du login")
	public void verification_du_et_si_appel_ok_alors_test_de_la_presence_du_login(final Integer code) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
