package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: seller inset ====");
		Department newDepartment = new Department(5,"Tecnologia de informacao");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new Id= "+ newDepartment);

	}

}
