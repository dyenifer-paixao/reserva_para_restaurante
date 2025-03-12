package entities;

public class Reservas {
	private String nomeDoCliente;
	private int quantidadeDePessoas;
	private String horarioDaReserva;

	public Reservas() {
	}

	public Reservas(String nomeDoCliente, int quantidadeDePessoas, String horarioDaReserva) {
		this.nomeDoCliente = nomeDoCliente;
		setQuantidadeDePessoas(quantidadeDePessoas);
		this.horarioDaReserva = horarioDaReserva;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		if (quantidadeDePessoas > 0) {
			this.quantidadeDePessoas = quantidadeDePessoas;
		} else {
			System.out.println("Número de pessoas inválido! Definindo como 1.");
			this.quantidadeDePessoas = 1;
		}
	}

	public String getHorarioDaReserva() {
		return horarioDaReserva;
	}

	public void setHorarioDaReserva(String horarioDaReserva) {
		this.horarioDaReserva = horarioDaReserva;
	}

	public String toString() {
		return "Reserva confirmada para " + nomeDoCliente + " - " + quantidadeDePessoas + " pessoas às "
				+ horarioDaReserva;

	}
}
