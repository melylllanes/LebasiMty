package com.example.springboot.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.springboot.entity.Pedido;


@SpringBootTest
public class TestingWebApp {



	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetLatas() {
		Pedido instance = new Pedido();
		int expResult = 2;
		instance.setLatas(expResult);
		int result = instance.getLatas();
		assertEquals(expResult, result);
		System.out.println("Resultado esperado: " + expResult + "\nResultado: " + result);
	}
	
	 

}
