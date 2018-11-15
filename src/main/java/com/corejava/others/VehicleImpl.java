package com.corejava.others;

public class VehicleImpl implements Vehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new VehicleImpl();
		String overview = vehicle.getOverview();
		String specification = vehicle.getSpecification();
		System.out.println(overview);
		//String st = VehicleImpl::specification;
	}

}
