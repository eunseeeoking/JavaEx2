package Day12;

public class SamsungPhone implements MobilePhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 전화걸기");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 전화받기");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 문자보내기");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 문자받기");
	}
	
	
}
