import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginSteps {

	@Given("User navigate to login page")
	def navigateToLogin() {
		println "navigateToLogin"
	}

	@When("User enter (.*) and (.*)")
	def enterDetails(String login , String password) {
		println "username: " + login
		println "password: " +password
	}

	@And("I click on Login button")
	def clickLoginBtn() {
		println "clickLoginBtn"
	}

	@Then("user is navigated to registation page")
	def navigation() {
		println "navigation"
	}
}