package java_hello;

	class RspPlayer{
	   public static final String[] arrRSP =  {"가위", "바위", "보"}; // 0:가위
	   private String name;
	   private String rsp;
	   
	   //컴퓨터 
	   public RspPlayer(String name) {
	      this.name = name;
	      int num = (int) (Math.random() * 3);
	      rsp = arrRSP[num];
	   }
	   //사용자
	   public RspPlayer(String name,String rsp) {
	      this.name = name;
	      this.rsp = rsp;
	   }
	   
	   public void getResult(RspPlayer you) {
	      
	      if(this.rsp.equals(you.rsp)) {
	         System.out.println("비겼습니다.");
	         return;
	      }
	      
	      if(this.rsp.equals("가위")) {
	         if(you.rsp.equals("보")) {
	            System.out.println(this.name + "이겼습니다.");
	         }else if(you.rsp.equals("바위")) {
	            System.out.println(this.name + " 졌습니다.");
	         }
	      }else if(this.rsp.equals("바위")) {
	         
	         switch (you.rsp) {
	            case "보": 
	               System.out.println(this.name + "졌숩니다.");
	               break;
	            case "가위": 
	               System.out.println(this.name + "이겼습니다.");
	               break;
	            default:
	               System.out.println("잘못된 입력입니다.");
	               break;
	         }
	      }else if(this.rsp.equals("보")) {
	         if(you.rsp.equals("바위")) {
	            System.out.println(this.name + "이겼습니다.");
	         }else if(you.rsp.equals("가위")) {
	            System.out.println(this.name + " 졌습니다.");
	         }else {
	            System.out.println("잘못된 입력입니다.");
	         }
	      }else {
	         System.out.println("잘못된 입력입니다.");
	      }      
	      
	   }
	   
	}

       