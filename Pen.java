package basic;

public class Pen {
	String col;
	String com;
	float price;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ublic Pen() {
	
	public Pen(String color, String company, float priceData) {
		this("red", "class");
		this.col = color;
		this.com = company;
		this.price = priceData;
		System.out.println("cons with  3 val");
	}
	public pen(String color, String company) {
		this("red");
		this.col = color;
		this.com = company;
		System.out.println("cons with 1 val");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Pen p1 = new Pen("red", "cello", 10.0f);
		System.out.println(p1.col);
		System.out.println(p1.com);
		System.out.println(p1.price);
	}
	}