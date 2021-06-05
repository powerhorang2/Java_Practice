package ch10;

public class TypeConversionTest {
	public static void main(String[] args) {
		
//		byte bNum = 125;
//		int iNum = bNum;
//		
//		iNum = 255;
//		bNum = (byte)iNum;
//		
//		System.out.println(iNum);
//		System.out.println(bNum);
//		
//		double dNum = 3.14;
//		int uNum = (int)dNum;
//		System.out.println(uNum);
		
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
