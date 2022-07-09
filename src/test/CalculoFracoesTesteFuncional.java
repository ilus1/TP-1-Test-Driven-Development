package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoFracoesTesteFuncional extends BaseTest {
	
	@Test
	public void fracoesTesteFuncional() {
		assertEquals(60f, this.estacionamento1.calculafracoes("06:00;06:30"));
		assertEquals(40f, this.estacionamento2.calculafracoes("06:00;06:30"));
		assertEquals(20f, this.estacionamento3.calculafracoes("06:00;06:30"));
	}

	@Test
	public void fracoesIncompletasTesteFuncional() {
		assertEquals(90f, this.estacionamento1.calculafracoes("06:00;06:55"));
		assertEquals(60f, this.estacionamento2.calculafracoes("06:00;06:55"));
		assertEquals(30f, this.estacionamento3.calculafracoes("06:00;06:55"));
	}

	@Test
	public void fracoesHorasDiferentesTesteFuncional() {
		assertEquals(60f, this.estacionamento1.calculafracoes("06:40;07:15"));
		assertEquals(60f, this.estacionamento2.calculafracoes("06:30;07:20"));
		assertEquals(30f, this.estacionamento3.calculafracoes("07:20;08:15"));
	}
}
