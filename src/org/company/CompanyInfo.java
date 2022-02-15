package org.company;

public class CompanyInfo {
	public void companyName(String name) {
 
	System.out.println("company name: "+name);
}
public void companyName(long number) {
	System.out.println("company number: "+number);
}

public void companyName(int acNo) {
	System.out.println("company acNo: "+acNo);
}
public void companyName(short num){
	System.out.println("company owner starting name letter: "+num);
	
	
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("tata");
	c.companyName(65465465465l);
	c.companyName(265465465);
	c.companyName(123);
	
}
}
