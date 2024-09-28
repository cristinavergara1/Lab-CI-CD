package com.udea.labcicd;

import com.fasterxml.jackson.databind.JsonNode;
import com.udea.labcicd.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class  LabcicdApplicationTests {

	@Autowired
	DataController datacontroller;
	@Test
	void health(){
		assertEquals("Proyecto Activo", datacontroller.healthCheck());

	}


	@Test
	void version(){
		assertEquals("la versión actual es 0.0.1",datacontroller.version());

	}
	@Test
	void nationLenght(){
		Integer nationsLenght= datacontroller.getRandomNation().size();
		assertEquals(10,nationsLenght);

	}
	@Test
	void currenciesLenght(){
		Integer currenciesLenght= datacontroller.getRandomCurrencies().size();
		assertEquals(20,currenciesLenght);
	}
	@Test
	public void testRandomCurrenciesCodeFormat(){
        DataController controller =new DataController();
		JsonNode responde =controller.getRandomCurrencies();

		for(int i=0; i < responde.size(); i++){
		JsonNode currency =responde.get(i);
		String code=currency.get("code").asText();
		assertTrue(code.matches("[A-Z]{3}"));}

	}


	@Test
	public void testRandomNationsPerformance(){
		DataController controller = new DataController();
		long startTime = System.currentTimeMillis();
		controller.getRandomNation();
		long endTime=System.currentTimeMillis();
		long excecutionTime=endTime-startTime;
		assertTrue(excecutionTime<2000);}


	@Test
	void aviationLength(){
		Integer aviationLenght = datacontroller.getRandomAviation().size();
		assertEquals(20,aviationLenght);

	}
}





