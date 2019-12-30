package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	
	public static void main(String[] args) {
		BinaryPrinter bp= new BinaryPrinter();
		bp.printByteBinary((byte) 64);
		System.out.println("/n");
		bp.printShortBinary((short) 12);
		System.out.println("/n");
		bp.printIntBinary(4);
		System.out.println("/n");
		bp.printLongBinary(8);
		
	}
	
	public void printByteBinary(byte b) {
	System.out.print((b&0b10000000)>>7);
	System.out.print((b&0b01000000)>>6);
	System.out.print((b&0b00100000)>>5);
	System.out.print((b&0b00010000)>>4);
	System.out.print((b&0b00001000)>>3);
	System.out.print((b&0b00000100)>>2);
	System.out.print((b&0b00000010)>>1);
	System.out.print((b&0b00000001)>>0);
		
	}
	
	public void printShortBinary(short s) {
		printByteBinary((byte)s);
		
		
	}
	
	public void printIntBinary(int i) {
		printByteBinary((byte)i);
	}
	
	public void printLongBinary(long l) {
		printByteBinary((byte)l);
	}
	
	
}
