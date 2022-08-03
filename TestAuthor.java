package com.book.demo;
public class TestAuthor 
{

	public static void main(String[] args)
	{
		
	     Author a1= new Author("Lokesh", "lokeshklg23@gmail.com" , 'm' ) ;
	     System.out.println(a1);
	     
	     a1.setEmail("loki0406@gamil.com");
	     System.out.println(a1);
	     
	     System.out.println("Name: " + a1.getName());
	     System.out.println("Email: " + a1.getEmail());
	     System.out.println("Gender: " + a1.getGender());

	}

	}



