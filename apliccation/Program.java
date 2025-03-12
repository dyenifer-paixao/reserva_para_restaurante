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
		
		System.out.println("Bem-vindo ao sistema de reservas do Restaurante!");
		System.out.print("\nDigite seu nome: ");
		String nomeDoCliente = sc.nextLine();
		
		System.out.print("Digite  quantidade de pessoas: ");
		int quantidadeDePessoas = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o horário desejado: ");
		String horarioDaReserva = sc.nextLine();
		
		reserva = new Reservas(nomeDoCliente, quantidadeDePessoas, horarioDaReserva);
		lista.add(reserva);
		
		System.out.println("\nReserva ativas: ");
		for (Reservas r : lista) {
			System.out.println(r);
		}
		
		
		
		sc.close();
	}

}
