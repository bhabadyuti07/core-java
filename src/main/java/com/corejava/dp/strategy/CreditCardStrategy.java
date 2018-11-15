/**
 * 
 */
package com.corejava.dp.strategy;

/**
 * @author Bhabadyuti Bal
 *
 */
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}



	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}



	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}



	/**
	 * @return the dateOfExpiry
	 */
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}



	/**
	 * @param dateOfExpiry the dateOfExpiry to set
	 */
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}



	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}

}
