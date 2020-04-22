package Cheesecake.Maven_TestParametros;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class CalculosMatematicosTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@DisplayName(value = "Potencia")
	@ParameterizedTest
	@CsvSource(value = { "1,1,1", "2,2,4", "2,10,1024","5,11,48828125" })
	public void potenciaTest(int base, int exponente, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 5, 19, 79, 199 })
	void esPrimoTest(int numero) {
		System.out.println(numero);
		assertTrue(CalculosMatematicos.esPrimo(numero));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 4, 8,100,777555222,1991,1115 })
	void esNoPrimoTest(int numero) {
		System.out.println(numero);
		assertFalse(CalculosMatematicos.esPrimo(numero));
	}
	//añadidos
	@DisplayName(value = "factorial con for")
	@ParameterizedTest
	@CsvSource(value = { "0,1", "1,1", "2,2", "7,5040", "11,39916800", "12,479001600", "13,-1"})
	void factorialTest(int numero, int resultadoEsperado) {
		System.out.println(numero);
		assertEquals(resultadoEsperado,CalculosMatematicos.factorial(numero));
	}
	
	@DisplayName(value = "factorial con while")
	@ParameterizedTest
	@CsvSource(value = { "0,1", "1,1", "2,2", "7,5040", "11,39916800", "12,479001600", "13,-1"})
	void factorial2Test(int numero, int resultadoEsperado) {
		System.out.println(numero);
		assertEquals(resultadoEsperado,CalculosMatematicos.factorial2(numero));
	}
	
}
