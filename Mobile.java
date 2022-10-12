package week1.day2;

public class Mobile {
	public void sendMessage() {
	    System.out.println("send message");

	}   
		public void shareDocument() {
		System.out.println("shareDocument");

	}

		public void call() {
	    System.out.println("call");

	}

	public static void main(String[] args) {
	    Mobile actions =new Mobile();
	    actions.sendMessage();
	    actions.shareDocument();
	    actions.call();
	    
	 }	
		
}
