package dd;

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num){
		number = num;
	}
	public void answer(){
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;

	public SmartPhone(String num, String ver){
		super(num);
		androidVer = ver;
	}
	public void playApp(){
		System.out.println("App is running in " + androidVer);
	}
}

class MobileSmartPhon{
	public static void main(String[] args){
		SmartPhone phone = new SmartPhone("010-555-777","Nougat");
		phone.answer();	//전화를 받는다.
		phone.playApp();	//앱을 선택하고 실행한다.
	}
}