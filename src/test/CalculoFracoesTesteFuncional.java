package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class CalculoFracoesTesteFuncional extends BaseTest {

	@ParameterizedTest
	@MethodSource("mandaParametrosEstacionamento1")
	public void fracoesParametrizadasTesteFuncional(String horario, float total) {
		assertEquals(total, this.estacionamento1.calculafracoes(horario));
	}

	private static Stream<Arguments> mandaParametrosEstacionamento1() {
		return Stream.of(
				Arguments.of("06:00;06:30", 60f),
				Arguments.of("06:00;06:55", 90f),
				Arguments.of("06:40;07:15", 60f),
				Arguments.of("06:30;07:20", 90f),
				Arguments.of("07:20;08:15", 90f)
		);
	}

	@ParameterizedTest
	@MethodSource("mandaParametrosEstacionamento2")
	public void fracoesParametrizadas2TesteFuncional(String horario, float total) {
		assertEquals(total, this.estacionamento2.calculafracoes(horario));
	}

	private static Stream<Arguments> mandaParametrosEstacionamento2() {
		return Stream.of(
				Arguments.of("06:00;06:30", 40f),
				Arguments.of("06:00;06:55", 60f),
				Arguments.of("06:40;07:15", 40f),
				Arguments.of("06:30;07:20", 60f),
				Arguments.of("07:20;08:15", 60f)
		);
	}

	@ParameterizedTest
	@MethodSource("mandaParametrosEstacionamento3")
	public void fracoesParametrizadas3TesteFuncional(String horario, float total) {
		assertEquals(total, this.estacionamento3.calculafracoes(horario));
	}

	private static Stream<Arguments> mandaParametrosEstacionamento3() {
		return Stream.of(
				Arguments.of("06:00;06:30", 20f),
				Arguments.of("06:00;06:55", 30f),
				Arguments.of("06:40;07:15", 20f),
				Arguments.of("06:30;07:20", 30f),
				Arguments.of("07:20;08:15", 30f)
		);
	}

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
