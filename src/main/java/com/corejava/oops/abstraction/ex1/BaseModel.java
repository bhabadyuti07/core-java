package com.corejava.oops.abstraction.ex1;

public class BaseModel {
	
	private static BaseModel instance = null;
	private static String baseModel = "D-Model";
	
	
	public String getBaseModel() {
		return baseModel;
	}

	public void setBaseModel(String baseModel) {
		BaseModel.baseModel = baseModel;
	}


	public static BaseModel getInstance() {
		if(instance == null) {
			BaseModel baseModel2 = new BaseModel();
			baseModel2.setBaseModel(baseModel);
			return baseModel2;
		}
		return null;
	}

}
