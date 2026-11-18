package oops;

public abstract class WhatsAppV6 extends WhatsAppV5{

	@Override
	public void instantLive() {
		// TODO Auto-generated method stub
		System.out.println("locate");
	}
	
	public abstract void sharePostInsta();
	public static void main(String[] args) {
		WhatsAppV5 w = new WhatsAppV6();
		
		w.aiImage();
		w.reShare();
		w.instantLive();
	}
	

}
