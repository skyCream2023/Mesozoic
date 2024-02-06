package pkg1;

public class SWCla3 {

	public static void main(String[] args) {
		
		  byte b = 36;
		  switch(b){
		      case 127: case -128:
		          System.out.println("ok");
		          break;
		     //case 128:
		      case 12:
		      case 22:
		    	  System.out.println("ok");
		    	  break;
		    default:
		    	 System.out.println("not listed correct byte type number");
		    	 break;
		}
	}

}
