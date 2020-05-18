package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next()); 
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(clientName, email, birthDate));
		
		System.out.print("How many items to this order? ");
		Integer itemNumber = sc.nextInt();
		for(int i=1; i<= itemNumber; i++) {
			System.out.println("Enter #" + i + " item data: ");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(productName, price);
			order.addItem(new OrderItem(quantity, product));
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
