package main;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Estacionamento {
	
	private Float valorfracao;
	private Float descontoHoraCheia;
	private Float valorDiariaDiurna;
	private Float valorDiariaNoturna;
	private Float valorMensalista;
	private Float valorEvento;
	private Float retornoContratante;
	private Integer capacidade;
	private String horarioAbertura;
	private String horarioFechamento;
	
	
	public Estacionamento(Float valorfracao, Float descontoHoraCheia, Float valorDiariaDiurna, Float valorDiariaNoturna,
			Float valorMensalista, Float valorEvento, Float retornoContratante, Integer capacidade,
			String horarioAbertura, String horarioFechamento) {
		this.valorfracao = valorfracao;
		this.descontoHoraCheia = descontoHoraCheia;
		this.valorDiariaDiurna = valorDiariaDiurna;
		this.valorDiariaNoturna = valorDiariaNoturna;
		this.valorMensalista = valorMensalista;
		this.valorEvento = valorEvento;
		this.retornoContratante = retornoContratante;
		this.capacidade = capacidade;
		this.horarioAbertura = horarioAbertura;
		this.horarioFechamento = horarioFechamento;
	}
	
	public long calculaDiferenca(String tempoPermanencia) {
		String[] entradaSaida = tempoPermanencia.split(";");
		LocalTime entrada = LocalTime.parse(entradaSaida[0]);
		LocalTime saida = LocalTime.parse(entradaSaida[1]);
		
		return ChronoUnit.MINUTES.between(entrada, saida);
	}


	public float calculafracoes(String tempoPermanencia) {
		long tempoCorrido = calculaDiferenca(tempoPermanencia);
		if (tempoCorrido > 0) return (tempoCorrido / 15) * this.valorfracao;
		else return 0f;
	}


	public Float calculaHorasCheias(String tempoPermanencia) {
		return 2 * 4 * this.valorfracao * (1 - this.descontoHoraCheia);
	}
}
