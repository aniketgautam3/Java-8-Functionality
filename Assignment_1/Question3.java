package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
		
}



public class Question3 {
    public static void main(String[] args) 
	{
		List<Product> productList1=new ArrayList<Product>();
		List<Product> productList2=new ArrayList<Product>();
		List<Product> productList3=new ArrayList<Product>();
		
		productList1.add(new Product(101,"HP Laptop",40000));
		productList1.add(new Product(102,"Acer Laptop",25000));
		productList1.add(new Product(103,"Samsung",50000));
		
		productList2.add(new Product(201,"HP Phone",40000));
		productList2.add(new Product(202,"Acer ",25000));
		productList2.add(new Product(203,"Samsung",50000));
		
		productList3.add(new Product(301,"Camera",40000));
		productList3.add(new Product(302,"Acer",25000));
		productList3.add(new Product(303,"Samsung",50000));
		
		List<List<Product>> productsList=new ArrayList<List<Product>>();
		productsList.add(productList1);
		productsList.add(productList1);
		productsList.add(productList1);
		
		List<Product> productsLists=productsList.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(productsLists);
		

	}
}
