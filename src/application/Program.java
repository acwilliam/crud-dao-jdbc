package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
	}

}
