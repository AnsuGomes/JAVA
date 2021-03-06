package expoli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExPoli {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat x = new SimpleDateFormat();
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("How many produtcs? ");
		int n = sc.nextInt(); // Aqui vai limitar o numero de produtos
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
                        
                        //definindo que todos os produtos possuem nomes e precos e que será capaz de reconhecer a str do teclado
                        
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
                        
                        //Aqui é para add os produtos
                        
			if (type == 'c') {
                            list.add(new Product(name, price));
			}
			else if (type == 'u') {
                            System.out.print("Manufacture date (DD/MM/YYYY): ");
                            Date date = x.parse(sc.next());
                            list.add(new UsedProduct(name, price, date));
			}
			else {
                            System.out.print("Customs fee: ");
                            double customsFee = sc.nextDouble();
                            list.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
                for (Product produto : list) {
                    System.out.println(produto.priceTag());
		}
		
		sc.close();
	}   
}
