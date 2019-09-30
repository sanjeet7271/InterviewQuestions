package com.stringProgram;

public class extractEachSymbolsNChars {
	public void splitsAll(String str) {
		StringBuffer alpha=new StringBuffer(),
		num=new StringBuffer(), symbols=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			}else {
				symbols.append(str.charAt(i));
			}
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(symbols);
		
	}
	public static void main(String[] args) {
		String str="String123213Hello$@@#@W$#or%#ld";
		extractEachSymbolsNChars obj=new extractEachSymbolsNChars();
		obj.splitsAll(str);
		
	}

}
