package convert;

public class Binary {
	public long toDecimal(long binary) {
		long decimal = 0;
		int k = 0;
		while(binary > 0) {
			if((binary % 10) == 1) 
				decimal += Math.pow(2, k);
			k++;
			binary = binary/10;
		}
		
		return decimal;
	}
	public long toOctal(long binary) {
		long decimal = toDecimal(binary);
		long octal = 0;
		while(decimal > 0) {
			octal = (octal * 10) + (decimal % 8);
			decimal = decimal/8;
		}
		long temp_oct = octal;
		octal = 0;
		while(temp_oct > 0) {
			octal = octal * 10 + temp_oct % 10;
			temp_oct = temp_oct/10;
		}
		return octal;
		
	}
	public String toHexaDecimal(long binary) {
		String hexadecimal = "";
		long decimal = toDecimal(binary);
		while(decimal > 0) {
			int rem = (int) (decimal % 16);
			if(( rem >= 0) && (rem <= 9)) {
				hexadecimal += rem;
			} else {
				if(rem == 10) {
					hexadecimal += 'A';
				}else if(rem == 11) {
					hexadecimal += 'B';
				} else if(rem == 12) {
					hexadecimal += 'C';
				} else if(rem == 13) {
					hexadecimal += 'D';
				} else if(rem == 14) {
					hexadecimal += 'E';
				} else {
					hexadecimal += 'F';
				}
			}
			decimal = decimal / 16;
		}
		String temp_hexadecimal = hexadecimal;
		hexadecimal = "";
		for(int i = temp_hexadecimal.length() -1;i >= 0;i--) {
			hexadecimal += temp_hexadecimal.charAt(i);
		}
		return hexadecimal;
	}
}
