package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoHorasCompletasTesteFuncional extends BaseTest {
	
	@ParameterizedTest
	@MethodSource("calculoHorasParametrizadas1")
	public void calculoHorasParametrizadas1TesteFuncional(String tempoPermanencia, float preco) {
		assertEquals(preco, estacionamento1.calculaHorasCheias(tempoPermanencia));
	}
	
	private static Stream<Arguments> calculoHorasParametrizadas1() {
		return Stream.of(
				Arguments.of("06:00;08:00", 204f),
				Arguments.of("06:00;06:59", 0f),
				Arguments.of("06:00;07:50", 102f),
				Arguments.of("08:30;08:56", 0f)
		);
	}
	
	@ParameterizedTest
	@MethodSource("calculoHorasParametrizadas2")
	public void calculoHorasParametrizadas2TesteFuncional(String tempoPermanencia, float preco) {
		assertEquals(preco, estacionamento2.calculaHorasCheias(tempoPermanencia));
	}
	
	private static Stream<Arguments> calculoHorasParametrizadas2() {
		return Stream.of(
				Arguments.of("06:00;08:00", 144f),
				Arguments.of("06:00;06:59", 0f),
				Arguments.of("19:00;13:00", 1296f),
				Arguments.of("06:00;07:50", 72f),
				Arguments.of("08:30;08:56", 0f),
				Arguments.of("06:00;09:45", 216f)
		);
	}
	
	
	@ParameterizedTest
	@MethodSource("calculoHorasParametrizadas3")
	public void calculoHorasParametrizadas3TesteFuncional(String tempoPermanencia, float preco) {
		assertEquals(preco, estacionamento3.calculaHorasCheias(tempoPermanencia));
	}
	
	private static Stream<Arguments> calculoHorasParametrizadas3() {
		return Stream.of(
				Arguments.of("06:00;08:00", 80f),
				Arguments.of("06:00;06:59", 0f),
				Arguments.of("19:00;13:00", 720f),
				Arguments.of("06:00;07:50", 40f),
				Arguments.of("08:30;08:56", 0f),
				Arguments.of("06:00;09:45", 120f)
		);
	}
	
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
