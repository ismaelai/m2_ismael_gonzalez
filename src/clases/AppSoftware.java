package clases;

/**
 * Clase base o superclass que representa una app software generica
 * @author ismam
 *
 */
public class AppSoftware {
	
	// 1 Atributes
	private String programminglang;
	private boolean persistent;
	private double complexity;
	private int codelines;
	private int numcases;
	
	
	// 2 Constructors
	public AppSoftware() {
		
	}
	public AppSoftware(String programminglang, boolean persistent, double complexity, int codelines, int numcases ) {
		this.programminglang = programminglang;
		this.persistent = persistent;
		this.complexity = complexity;
		this.codelines = codelines;
		this.numcases = numcases;
	}
	
	public String getProgramminglang() {
		return programminglang;
	}
	public void setProgramminglang(String programminglang) {
		this.programminglang = programminglang;
	}
	public boolean isPersistent() {
		return persistent;
	}
	public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}
	public double getComplexity() {
		return complexity;
	}
	public void setComplexity(double complexity) {
		this.complexity = complexity;
	}
	public int getCodelines() {
		return codelines;
	}
	public void setCodelines(int codelines) {
		this.codelines = codelines;
	}
	public int getNumcases() {
		return numcases;
	}
	public void setNumcases(int numcases) {
		this.numcases = numcases;
	}
	
	// 3 Method
	double calculeQuality(){
		double quality = 100;
		
		// if statement
		if (complexity >11 && complexity <21) {
			quality = quality -10;
			System.out.println("Quality substracting 10");
		} else if(complexity > 21 && complexity > 50) {
			quality = quality - 30;
			System.out.println("substracting 30");
		} else if(complexity >= 50) {
			quality = quality -50;
			System.out.println("subtracting 50");
		}else
			if(codelines > 50000 && numcases > 3000) {
				quality = quality - 20;
				System.out.println("se resta 20");
			}
		
		return quality;
		
	}
	
		// abstract method stack technology
	String tecnostack() {
			return null;
		}
	
	@Override
	public String toString() {
		return "AppSoftware [programminglang=" + programminglang + ", persistent=" + persistent + ", complexity="
				+ complexity + ", codelines=" + codelines + ", numcases=" + numcases + "]";
	}
	

}
