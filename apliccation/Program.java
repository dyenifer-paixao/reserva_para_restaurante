package apliccation;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Reservas reserva;
		ArrayList<Reservas> lista = new ArrayList<>();
		char resposta;

		System.out.println("\n==================================");
		System.out.println(" Bem-vindo ao sistema de reservas do Restaurante!");
		System.out.println("\n==================================");

		while (true) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("\n[1] Deseja fazer um nova reserva? ");
			System.out.println("[2] Deseja ver suas reservas ativas? ");
			System.out.println("[0] Terminadas as reservas?");
			System.out.println();
			System.out.print("Digite sua escolha aqui: ");

			resposta = sc.nextLine().charAt(0);

			if (resposta == '1') {
				System.out.println("\n==================================");
				System.out.println("Criando uma nova reserva...");
				System.out.println("\n==================================");
				
				System.out.print("\nDigite seu nome: ");
				String nomeDoCliente = sc.nextLine();

				System.out.print("Digite a quantidade de cadeiras que devem ser reservadas: ");
				int quantidadeDePessoas = sc.nextInt();
				sc.nextLine();

				System.out.print("Digite o horário desejado: ");
				String horarioDaReserva = sc.nextLine();

				reserva = new Reservas(nomeDoCliente, quantidadeDePessoas, horarioDaReserva);
				lista.add(reserva);

				System.out.println("\nReserva feita com sucesso!");

			} else if (resposta == '2') {
				System.out.println("\n==================================");
				System.out.println("Reservas ativas");
				System.out.println("\n==================================");
				
				if (lista.isEmpty()) {
					System.out.println("Nenhuma reserva ativa.");
				} else {
					for (Reservas r : lista) {
						System.out.println(r);
					}
				}
			} else if (resposta == '0') {
				System.out.println("\nSaindo do sistema... Obrigado!");
				break;
			} else {
				System.out.println("\nDigite opção válida por favor");
				resposta = sc.next().charAt(0);
			}

		}
		sc.close();
	}

}
