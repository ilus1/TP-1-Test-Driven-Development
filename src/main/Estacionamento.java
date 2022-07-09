package main;

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


	public float calculafracoes(String entrada, String saida) {
		return 2*this.valorfracao;
	}


}
