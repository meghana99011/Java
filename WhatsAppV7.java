package oops;

public  class WhatsAppV7 extends WhatsAppV6 {
	
	@Override
	public void sharePostInsta() {
		System.out.println("Update post in Insta from WhatsApp");
	}


	public static void main(String[] args) {
		WhatsAppV5 w = new WhatsAppV7();
		w.aiImage();
		w.reShare();
		w.instantLive();
		w.sharePostInsta();
	}

}
