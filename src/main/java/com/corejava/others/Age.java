/**
 * 
 */
package com.corejava.others;

/**
 * @author Bhabadyuti Bal
 *
 */
public class Age implements Cloneable {
    private int day;
    private int month;
    private int year;
    private String name;
    
    public Age() {
		this.name = "abc";
	}
    
    public static void main(String[] args) {/*
    	int c=25,i=5;
		do {
			c=c/i;
			c=c*i;
			System.out.println(c);
			
		} while (i--);
	*/}
    
    @Override
    public String toString() {
    	return "abcccc";
    }
    
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
    this.day = day;
    }
    public int getMonth() {
    return month;
    }
    public void setMonth(int month) {
    this.month = month;
    }
    public int getYear() {
    return year;
    }
    public void setYear(int year) {
    this.year = year;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    protected Object clone() throws CloneNotSupportedException {
		final Age age = (Age) super.clone();
		age.day = this.day;
		return age;
	}
}

