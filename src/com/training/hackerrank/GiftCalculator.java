package com.training.hackerrank;

public class GiftCalculator {

	public static void main(String[] args) {
		int totalBlackGifts = 10;
		int totalWhiteGifts = 10;
		int blackGiftCost = 1;
		int whiteGiftCost = 1;
		int conversionCost = 1;
		
		long totalCost = taumBday(totalBlackGifts,totalWhiteGifts,blackGiftCost,whiteGiftCost,conversionCost);
		System.out.println(totalCost);
	}

	public static long taumBday(int b, int w, int bc, int wc, int z) {
//		long totalCost = 0L;
//		
//		if(bc < wc) {
//			long totalBlackGiftCost = bc * b;
//			
//			long whiteGiftsOriginalCost = wc * w;
//			long currConversionCost = (w * bc) + (w * z);
//			long totalWhiteGiftsCost = (whiteGiftsOriginalCost < currConversionCost) ? whiteGiftsOriginalCost : currConversionCost;
//			
//			totalCost = totalBlackGiftCost + totalWhiteGiftsCost;
//			
//		} else if(wc <  bc) {
//			long totalWhiteGiftCost = wc * w;
//			
//			long blackGiftsOriginalCost = bc * b;
//			long currConversionCost = (b * wc) + (b * z);
//			long totalBlackGiftsCost = (blackGiftsOriginalCost < currConversionCost) ? blackGiftsOriginalCost : currConversionCost;
//			
//			totalCost = totalWhiteGiftCost + totalBlackGiftsCost;
//		} else {
//			totalCost = (b * bc) + (w * wc);
//		}
//		return totalCost;
		
		return b * (long)Math.min(bc, wc+z) + w * (long)Math.min(wc,bc+z);
	}
	
    
    

}
