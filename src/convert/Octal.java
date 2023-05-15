package convert;

public class Octal {
	public long toDecimal(long octal) {
		long decimal = 0;
		int k = 0;
		while(octal > 0) {
			decimal += octal % 10 * Math.pow(8, k);
			k++;
			octal = octal / 10;
		}
		return decimal;
	}
	public long toBinary(long octal) {
		long decimal = toDecimal(octal);
		// Generating binary of a number in a String data-type.
			String binary = "";
			while(decimal > 0) {
				if((decimal & 1) == 1) {
					binary += 1;
					} else {			
						binary += 0;
					}
					decimal = decimal >> 1;
			}
			String temp_binary = binary;
			binary = "";
			for(int i = temp_binary.length() - 1;i >= 0;i--) {
				binary += temp_binary.charAt(i);
			}			
			// Converting the string binary to integer-binary
			long int_binary = 0;
			for(int i = 0;i < binary.length();i++) {
				if(binary.charAt(i) == '1') {
					int_binary = int_binary * 10 + 1;
				}
				else {
					int_binary = int_binary * 10;
				}
			}
			return int_binary;
	}
	public String toHexaDecimal(long octal) {
		long decimal = toDecimal(octal);
		String hexadecimal = "";
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
