
public class Armstrongnumber {
	 public static boolean isArmstrong(int num) {
	        int temp = num;
	        int sum = 0;
	        int r;
	        int n = String.valueOf(num).length();
	        
	        while (temp > 0) {
	            r = temp % 10;
	            temp /= 10;
	            sum = sum + r*r*r;
	        }
	        return sum == num;
	    }
	
	}
