package org.company;

public class CompanyInfo {
private void companyName(String name) {
 
	System.out.println("company name: "+name);
}
private void companyName(long number) {
	System.out.println("company number: "+number);
}

private void companyName(int acNo) {
	System.out.println("company acNo: "+acNo);
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("tata");
	c.companyName(65465465465l);
	c.companyName(265465465);
	
}
}
