package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoHorasCompletasTesteFuncional extends BaseTest {
	
	@Test
	public void calculoHorasTesteFuncional() {
		assertEquals(204f, estacionamento1.calculaHorasCheias("05:00;07:00"));
		assertEquals(144f, estacionamento2.calculaHorasCheias("05:00;07:00"));
		assertEquals(80f, estacionamento3.calculaHorasCheias("05:00;07:00"));
	}

}
