package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoFracoesTesteFuncional extends BaseTest {
	
	@Test
	public void testeFracoes() {
		assertEquals(60f, this.estacionamento1.calculafracoes("06:00", "06:30"));
		assertEquals(40f, this.estacionamento2.calculafracoes("06:00", "06:30"));
		assertEquals(20f, this.estacionamento3.calculafracoes("06:00", "06:30"));
	}

}
