package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voc� vai digitar:");
		int N= sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println();
			System.out.print("Digite os dados do " + (i +1) + "� contribuinte:");
			System.out.println();
			System.out.print("Renda anual com sal�rio:");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com presta��o de servi�o:");
			double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital:");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos m�dicos:");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais:");
			double educationSpending = sc.nextDouble();
			
			list.add(new TaxPayer(salaryIncome,serviceIncome,capitalIncome,healthSpending,educationSpending));
			
		}
		
		int i = 1;
		
		for (TaxPayer payer : list) {
			System.out.println();
			System.out.println("Resumo do " + i + " � contribuinte:");
			System.out.println(payer);
			i++;
		}
		
		sc.close();
	}
}


