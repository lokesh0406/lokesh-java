package com.book.demo;


public class TestBook {
	
	public static void main(String[] args) {	
		
		
		
		Author authors[]= new Author[2] ;
		
		authors[0] = new Author("akash", "absjdkh12@gmail.com",'m');
		authors[1] = new Author("Lokesh", "lokesh233@gmail.com",'m');
	
		
		Book b1 = new Book("Story", authors, 300 , 1);
		System.out.println(b1);
		
		b1.setPrice(120);
		b1.setQty(3);
		System.out.println(b1);
		 
		
		 System.out.println(" Book Name: " + b1.getName());	
		 System.out.println("Authors: " + b1.getAuthorNames());
	     System.out.println(" Book Price: " + b1.getPrice());	     
	     System.out.println(" Book Qty: " + b1.getQty());
	     

	     String msg = "";
	     Author authorsD[] = b1.getAuthors();
	     
	     for(int i=0; i<authorsD.length; i++ ) {
	    	 msg = msg+authorsD[i].getName()+"," + authorsD[i].getEmail()+"," + authorsD[i].getGender()+"\n";
	     }
	     
	     System.out.println(msg);
	
	
	}

}
