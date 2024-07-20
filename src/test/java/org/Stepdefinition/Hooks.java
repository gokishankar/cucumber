package org.Stepdefinition;
import org.help.samplebase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends samplebase{
	
	@Before
	public void bef() {
		browserlaunch();
		launchurl("https://www.facebook.com/");

	}
	@After
	public void after() {
		close();

	}

}
