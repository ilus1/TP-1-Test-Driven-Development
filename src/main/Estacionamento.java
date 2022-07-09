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


	public Float getValorfracao() {
		return valorfracao;
	}


	public void setValorfracao(Float valorfracao) {
		this.valorfracao = valorfracao;
	}


	public Float getDescontoHoraCheia() {
		return descontoHoraCheia;
	}


	public void setDescontoHoraCheia(Float descontoHoraCheia) {
		this.descontoHoraCheia = descontoHoraCheia;
	}


	public Float getValorDiariaDiurna() {
		return valorDiariaDiurna;
	}


	public void setValorDiariaDiurna(Float valorDiariaDiurna) {
		this.valorDiariaDiurna = valorDiariaDiurna;
	}


	public Float getValorDiariaNoturna() {
		return valorDiariaNoturna;
	}


	public void setValorDiariaNoturna(Float valorDiariaNoturna) {
		this.valorDiariaNoturna = valorDiariaNoturna;
	}


	public Float getValorMensalista() {
		return valorMensalista;
	}


	public void setValorMensalista(Float valorMensalista) {
		this.valorMensalista = valorMensalista;
	}


	public Float getValorEvento() {
		return valorEvento;
	}


	public void setValorEvento(Float valorEvento) {
		this.valorEvento = valorEvento;
	}


	public Float getRetornoContratante() {
		return retornoContratante;
	}


	public void setRetornoContratante(Float retornoContratante) {
		this.retornoContratante = retornoContratante;
	}


	public Integer getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}


	public String getHorarioAbertura() {
		return horarioAbertura;
	}


	public void setHorarioAbertura(String horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}


	public String getHorarioFechamento() {
		return horarioFechamento;
	}


	public void setHorarioFechamento(String horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}

}
