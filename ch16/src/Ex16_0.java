
public class Ex16_0 {
	 public int test()
	    {
	        try
	        {
	            System.out.println("TRY");
	            return 1;
	        }
	        finally
	        {
	            System.out.println("FINALLY");
//	            return 2;                       // ---- (1)
	        }
	    }
	     
	    public static void main(String args[])
	    {
	    	Ex16_0 tester = new Ex16_0();
	        System.out.println(tester.test());
	    }
	
}





