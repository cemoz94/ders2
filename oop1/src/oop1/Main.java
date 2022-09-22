package oop1;

public class Main {

	public static void main(String[] args) {
		// oop = nesne güdümlü programlama
		String mesaj = "Vade oranı";
		// class'a ürün atma:
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setImagUrl("bilmemne.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setDiscount(7); //mesela bu okunmasın dersek product kısmından gider sileriz bu kısmı
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setImagUrl("bilmemne2.jpg");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setDiscount(7);

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setImagUrl("bilmemne3.jpg");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setDiscount(7);
		
		//gerçek hayatta database'den gelir bu bilgiler. Yukarıyı array şeklinde yazmak daha kolay
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("1514");
		individualCustomer.setPhone("05659258762");
		individualCustomer.setId(1);
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
	
		CooporateCustomer cooporateCustomer = new CooporateCustomer();
		cooporateCustomer.setId(2);
		cooporateCustomer.setCompanyName("kodalama.io");
		cooporateCustomer.setPhone("545256");
		cooporateCustomer.setTaxNumber("54321");
		cooporateCustomer.setCustomerNumber("78945");
		
		Customer[] customers = {individualCustomer, cooporateCustomer};
		
		
		
		
	}

}
