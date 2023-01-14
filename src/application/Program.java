package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter the contract data: ");
		System.out.print("Contract number:");
		int number = sc.nextInt();
		System.out.print("Contract date dd/MM/yyyy: ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.println("How many installment do you want?: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(obj, n);
		
		System.out.println("Installments: ");
		for (Installment installment : obj.getInstallment())
			System.out.println(installment);
		
		sc.close();
		
		
	}

}
