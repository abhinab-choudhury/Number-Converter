package convert;

import java.util.Scanner;

public class Main {
	public void load() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choise;
		do {
			System.out.println("\n\n\t\t\t\t############## WELCOME TO BASE CONVERTER ##############\t\t");
			System.out.println("\t\t\t\t\t1.Binary Number(BASE 2).");
			System.out.println("\t\t\t\t\t2.Octal Number(BASE 8).");
			System.out.println("\t\t\t\t\t3.Decimal Number(BASE 10).");
			System.out.println("\t\t\t\t\t4.Hexadecimal Number(BASE 16).");
			System.out.println("\t\t\t\t\t5.Exit.");
			System.out.print("\t\t\t\t\tEnter your Choise(1,2,3,4,5) : ");
			choise = scan.nextInt();
			
			if(choise == 1) {
				int ch;
				do {
					System.out.println("\n\n\t\t\t\t############## WELCOME TO BASE CONVERTER ##############\t\t");
					System.out.println("\t\t\t\t\t1.Binary Number(BASE 2) ===> Decimal Number(BASE 10).");
					System.out.println("\t\t\t\t\t2.Binary Number(BASE 2) ===> Octal Number(BASE 8).");
					System.out.println("\t\t\t\t\t3.Binary Number(BASE 2) ===> Hexadecimal Number(BASE 16).");
					System.out.println("\t\t\t\t\t4.Exit");
					System.out.print("\t\t\t\t\tEnter your Choise(1,2,3,4) : ");
					ch = scan.nextInt();
					Binary bina = new Binary();
					switch(ch) {
						case 1:{
							System.out.print("\t\t\t\t\tEnter the Binary Number : ");
							long binary = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long decimal = bina.toDecimal(binary);
							System.out.println("\t\t(" + binary + ")2 : ("  + decimal + ")10");
							break;
						}
						case 2:
						{
							System.out.print("\t\t\t\t\tEnter the Binary Number : ");
							long binary = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long octal = bina.toOctal(binary);
							System.out.println("\t\t(" +  binary + ")2 : (" + octal + ")8");
							break;
						}
						case 3:
						{
							System.out.print("\t\t\t\t\tEnter the Binary Number : ");
							long binary = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							String hexadecimal = bina.toHexaDecimal(binary);
							System.out.println("\t\t(" +  binary + ")2 : (" + hexadecimal + ")16");
							break;
						}
						case 4:
						{
							System.out.println("\t\t\t\t#$#$#$#$#$#$#$# YOU ARE ENTERING INTO PREVIOUS MENU #$#$#$#$#$#$#$# ");
							break;
						}
						default:
							System.out.println("\n\n\t\t\t\t\tWrong Choise");
					}
				}while(ch != 4);
				
			}else if(choise == 2) {
				int ch;
				do {
					System.out.println("\n\n\t\t\t\t############## WELCOME TO BASE CONVERTER ##############\t\t");
					System.out.println("\t\t\t\t\t1.Octal Number(BASE 8) ===> Decimal Number(BASE 10).");
					System.out.println("\t\t\t\t\t2.Octal Number(BASE 8) ===> Binary Number(BASE 2).");
					System.out.println("\t\t\t\t\t3.Octal Number(BASE 8) ===> Hexadecimal Number(BASE 16).");
					System.out.println("\t\t\t\t\t4.Exit");
					System.out.print("\t\t\t\t\tEnter your Choise(1,2,3,4) : ");
					ch = scan.nextInt();
					Octal oct = new Octal();
					switch(ch) {
						case 1:{
							System.out.print("\t\t\t\t\tEnter the Octal Number : ");
							long octal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long decimal = oct.toDecimal(octal);
							System.out.println("\t\t(" + octal + ")8 : ("  + decimal + ")10");
							break;
						}
						case 2:
						{
							System.out.print("\t\t\t\t\tEnter the Octal Number : ");
							long octal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long binary = oct.toBinary(octal);
							System.out.println("\t\t(" + octal + ")8 : (" + binary + ")2");
							break;
						}
						case 3:
						{
							System.out.print("\t\t\t\t\tEnter the Octal Number : ");
							long octal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							String hexadecimal = oct.toHexaDecimal(octal);
							System.out.println("\t\t(" +  octal + ")8 : (" + hexadecimal + ")16");
							break;
						}
						case 4:
						{
							System.out.println("\t\t\t\t#$#$#$#$#$#$#$# YOU ARE ENTERING INTO PREVIOUS MENU #$#$#$#$#$#$#$# ");
							break;
						}
						default:
							System.out.println("\n\n\t\t\t\t\tWrong Choise");
					}
				}while(ch != 4);
				
			}else if(choise == 3) {
				int ch;
				do {
					System.out.println("\n\n\t\t\t\t############## WELCOME TO BASE CONVERTER ##############\t\t");
					System.out.println("\t\t\t\t\t1.Decimal Number(BASE 10) ===> Binary Number(BASE 2) .");
					System.out.println("\t\t\t\t\t2.Decimal Number(BASE 10) ===> Octal Number(BASE 8).");
					System.out.println("\t\t\t\t\t3.Decimal Number(BASE 10) ===> Hexadecimal Number(BASE 16).");
					System.out.println("\t\t\t\t\t4.Exit");
					System.out.print("\t\t\t\t\tEnter your Choise(1,2,3,4) : ");
					ch = scan.nextInt();
					Decimal deci = new Decimal();
					switch(ch) {
						case 1:{
							System.out.print("\t\t\t\t\tEnter the Decimal Number : ");
							long decimal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long binary = deci.toBinary(decimal);
							System.out.println("\t\t(" + decimal + ")10 : ("  + binary + ")2");
							break;
						}
						case 2:
						{
							System.out.print("\t\t\t\t\tEnter the Decimal Number : ");
							long decimal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							long oct = deci.toOctal(decimal);
							System.out.println("\t\t(" + decimal + ")10 : (" + oct + ")8");
							break;
						}
						case 3:
						{
							System.out.print("\t\t\t\t\tEnter the Decimal Number : ");
							long decimal = scan.nextLong();
							System.out.print("\n\n\t\t\t\t\tResult : ");
							String hexadecimal = deci.toHexaDecimal(decimal);
							System.out.println("\t\t(" + decimal + ")10 : (" + hexadecimal + ")16");
							break;
						}
						case 4:
						{
							System.out.println("\t\t\t\t#$#$#$#$#$#$#$# YOU ARE ENTERING INTO PREVIOUS MENU #$#$#$#$#$#$#$# ");
							break;
						}
						default:
							System.out.println("\n\n\t\t\t\t\tWrong Choise");
					}
				}while(ch != 4);
				
			}else if(choise == 4) {
				
			}else if(choise == 5) {
				System.out.println("\n\n\t\t\t\t#$#$#$#$#$#$#$# Bye Bye #$#$#$#$#$#$#$# ");
			}else{
				System.out.println("\t\t\t1\t\t&&&&&&&& WRONG CHOISE &&&&&&&&");
			}
		}while(choise != 5);
		
		scan.close();
	}

}
