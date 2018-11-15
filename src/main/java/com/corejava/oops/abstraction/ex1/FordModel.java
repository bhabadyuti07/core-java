/**
 * 
 */
package com.corejava.oops.abstraction.ex1;

/**
 * @author Bhabadyuti Bal
 *
 */
public abstract class FordModel extends BaseModel {
	
	private static String fordModel = null;
	
	
	public static String getFordModel() {
		BaseModel instance = FordModel.getInstance();
		String baseModel = instance.getBaseModel();
		fordModel = "Ford "+baseModel;
		return fordModel;
	}
	
	public abstract void setEngine();
	
	public abstract void setColor();
	
	public abstract void setTires();

}
