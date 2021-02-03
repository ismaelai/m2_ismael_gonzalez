package clases;

import java.util.ArrayList;
import java.util.Arrays;

import entities.Sensor;

/**
 * clase hija hereda de AppSoftware
 * representa a una app para mobile
 * @author ismam
 *
 */
public class AppMobile extends AppSoftware{
	
	// 1 atributes
	private String[] permissions;
	private boolean hybrid;
	private ArrayList<String> locations;
	private ArrayList<Location> location2 = new ArrayList<Location>();
	
	// constructor
	public AppMobile() {
		
	}
	
	
	public AppMobile(String programminglang, boolean persistent, double complexity, int codelines, int numcases, boolean hybrid) {
		super(programminglang, persistent, complexity, codelines, numcases);
		this.hybrid = hybrid;
	}


	public AppMobile(String[] permissions, boolean hybrid) {
		this.permissions = permissions;
		
	}
	
	
	
	// methods

	public String[] getPermissions() {
		return permissions;
	}


	public void setPermissions(String[] permissions) {
		this.permissions = permissions;
	}


	public boolean isHybrid() {
		return hybrid;
	}


	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}


	@Override
	public String toString() {
		return "AppMobile [permissions=" + Arrays.toString(permissions) + "]";
	}
	
	String tecnostack() {
		return null;
	}

}
