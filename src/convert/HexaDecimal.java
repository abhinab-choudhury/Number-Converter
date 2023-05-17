package convert;

public class HexaDecimal {
	public long toBinary(String hexadecimal) {
		long binary = 0;
		long decimal = toDecimal(hexadecimal);
		while(decimal > 0) {
			binary = binary * 10 + (decimal % 2);
			decimal /= 2;
		}
		long temp_binary = binary;
		binary = 0;
		while(temp_binary > 0) {
			binary = binary * 10 + (temp_binary % 10);
			temp_binary = temp_binary/10;
		}
		return binary;
		
	}
	public long toDecimal(String hexadecimal) {
		long decimal = 0;
		int k = 0;
		for(int i = hexadecimal.length()-1;i >= 0; i--,k++) {
			if(hexadecimal.charAt(i) == 'A') {
				decimal += 10 * Math.pow(16, k);
			} else if(hexadecimal.charAt(i) == 'B') {
				decimal += 11 * Math.pow(16, k);
			} else if(hexadecimal.charAt(i) == 'C') {
				decimal += 12 * Math.pow(16, k);
			} else if(hexadecimal.charAt(i) == 'D') {
				decimal += 13 * Math.pow(16, k);
			} else if(hexadecimal.charAt(i) == 'E') {
				decimal += 14 * Math.pow(16, k);
			} else if(hexadecimal.charAt(i) == 'F') {
				decimal += 15 * Math.pow(16, k);
			} else {
				decimal += ((int)(hexadecimal.charAt(i)) - 48) * Math.pow(16, k);
			}
		}
		
		return decimal;
	}
	public long toOctal(String hexadecimal) {
		long octal = 0;
		long decimal = toDecimal(hexadecimal);
		while(decimal > 0) {
			octal = octal * 10 + (decimal % 8);
			decimal = decimal / 8;
		}
		long temp_octal = octal;
		octal = 0;
		while(temp_octal > 0) {
			octal = octal * 10 + (temp_octal % 10);
			temp_octal = temp_octal / 10;
		}
		return octal;
	}
}
