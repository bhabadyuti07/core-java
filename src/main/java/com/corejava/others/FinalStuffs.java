package com.corejava.others;

public class FinalStuffs {
	
	
	public static void display(){
		System.out.println("Inside display");
		throw new RuntimeException("Exp...");
	}
	
	@Override
	public void finalize()
    {
        System.out.println("finalize method overriden");
    }
	

	public static void main(String[] args) {
		String ob = new String("RR");
		System.out.println(ob);
		System.gc();
		int j = 1;
		for(int i=1;i<=10;i++) {
			
			FinalStuffs finalStuffs = new FinalStuffs();
			finalStuffs.finalize();
			j++;
		}
		System.out.println(j);
		//finalStuffs.finalize();
		try {
			display();
			ob = null;
			
		} catch (Exception e) {
			
		}
		finally {
			System.out.println("Inside finally");
		}
		
	}
}
