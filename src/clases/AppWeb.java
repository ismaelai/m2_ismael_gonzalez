package clases;

/**
 * clase hija hereda de AppSoftware
 * representa a una app web
 * @author ismam
 *
 */
public class AppWeb extends AppSoftware{

	// 1 atributos
	private String backend;
	private String frontend;
	
	// 2 constructrs
	public AppWeb() {
		
	}
	public AppWeb(String programminglang, boolean persistent, double complexity, int codelines, int numcases, String backend, String frontend) {
		super(programminglang, persistent, complexity, codelines, numcases);
		
		this.backend = backend;
		this.frontend = frontend;
	}
	
	
	public String getBackend() {
		return backend;
	}
	public void setBackend(String backend) {
		this.backend = backend;
	}
	public String getFrontend() {
		return frontend;
	}
	public void setFrontend(String frontend) {
		this.frontend = frontend;
	}
	
	// 3 methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AppWeb[backend=" + this.backend + ",frontend=" + this.frontend + ", getProgramminglang()= "+ getProgramminglang() +"  ]";
	}

	String tecnostack() {
		return null;
	}
	
	//
	
}
