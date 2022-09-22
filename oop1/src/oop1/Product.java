package oop1;

//class'lar PascalCase olarak yani kelimelerin ilk harfi büyük olarak isimlendirilirler
public class Product {
	//Burada ürünü tanımlamıyoruz. Ürünü tanımlayabileceğimiz ortamı hazırlıyoruz.
	private String name;
	//field'lar camelCase yazılırlar yani name, unitPrice vb
	private double unitPrice;
	private double discount;
	private String imagUrl; //fotoğraf imagUrls yazarsak fotoğraflar
	private int unitsInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImagUrl() {
		return imagUrl;
	}
	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	//get-setleri açacağız. sağa tıkla. source generate getters and setters de
	
	//herkes kullanamasın diye başlarına private yazarız. Sadece o class içinde kullanılabilir demek başka class içerisinde kullanamazsın. Main kızdı şu an. 

}
