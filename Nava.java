package basic;

public class Nava extends Ajay{
	public void speed() {
		System.out.println("60kmph");
	}
	public static void main(String[] args) {
		Nava n = new Nava();
		n.speed();
		
		Ajay a = new Ajay();
		a.speed(); 
	}

}
