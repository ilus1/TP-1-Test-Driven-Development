package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoHorasCompletasTesteFuncional extends BaseTest {
	
	@Test
	public void calculoHorasTesteFuncional() {
		assertEquals(204f, estacionamento1.calculaHorasCheias("06:00;08:00"));
		assertEquals(144f, estacionamento2.calculaHorasCheias("06:00;08:00"));
		assertEquals(80f, estacionamento3.calculaHorasCheias("06:00;08:00"));
	}

	@Test
	public void calculoHorasDiasDiferentesTesteFuncional() {
		assertEquals(0f, estacionamento1.calculaHorasCheias("06:00;06:59"));
		assertEquals(1296f, estacionamento2.calculaHorasCheias("19:00;13:00"));
		assertEquals(960f, estacionamento3.calculaHorasCheias("08:00;08:00"));
	}
	
	
	@Test
	public void calculoHorasIncompletasTesteFuncional() {
		assertEquals(102f, estacionamento1.calculaHorasCheias("06:00;07:50"));
		assertEquals(216f, estacionamento2.calculaHorasCheias("06:00;09:45"));
		assertEquals(160f, estacionamento3.calculaHorasCheias("06:00;10:30"));
	}

}
