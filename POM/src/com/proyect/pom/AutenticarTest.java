package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AutenticarTest {
	
	private WebDriver driver;
	AuntenticarPage autenticar;

	@Before
	public void setUp() throws Exception {
		
		autenticar=new AuntenticarPage(driver);
		driver=autenticar.ChromeConection();
		autenticar.visit("https://demo.guru99.com/test/newtours/");
		
	}

	@After
	
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		autenticar.Autenticar();
		Thread.sleep(2000);
		//
		assertTrue(autenticar.MensajeExitoso());
	}

}
