package steps;

import static utils.Utils.*;

import java.util.ArrayList;
import com.codeborne.selenide.Selenide;
import commons.BaseTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	BaseTests baseTests = new BaseTests();

	@Before
	public void setUp() throws Exception {
		baseTests.settingsDevice();
	}

	@After
	public void tearDown(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
	}

}
