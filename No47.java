
public class No47 {

	/**
	 * дһ������������������֮�ͣ�
	 * Ҫ�������ڲ�����ʹ��+��-��*��\������ˮů����
	 */
	public static void main(String[] args) {
		System.out.println(add(5, 8)); 	
	}

	private static int add(int num1, int num2) {
		
		 int sum,carry;  
	        do{  
	            sum = num1 ^ num2;  
	            carry = (num1&num2) <<1;  
	            num1 = sum;  
	            num2 = carry;  
	        }while(num2!=0);  
	        return num1;  
	}

}