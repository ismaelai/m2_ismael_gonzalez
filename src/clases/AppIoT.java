package clases;

/**
 * clase hija hereda de AppSoftware
 * representa a una app para dispositivos Internet of Things
 * @author ismam
 *
 */
public class AppIoT extends AppSoftware{
	
	// 1 ATRIBUTES
	private EProtocols protocol; 
	private boolean graphic;
	private boolean wifi;
	
	// constructor
	public AppIoT() {
	}
	
	public AppIoT(String programminglang, boolean persistent, double complexity, int codelines, int numcases, boolean Eprotocols, boolean graphic, boolean wifi, EProtocols protocol) {
		super(programminglang, persistent, complexity, codelines, numcases);
		this.protocol = protocol;
		this.graphic = graphic;
		this.wifi = wifi;
	}

	public EProtocols getProtocol() {
		return protocol;
	}

	public void setProtocol(EProtocols protocol) {
		this.protocol = protocol;
	}

	public boolean isGraphic() {
		return graphic;
	}

	public void setGraphic(boolean graphic) {
		this.graphic = graphic;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	
	// methods
	@Override
	public String toString() {
		return "AppIoT [protocol=" + protocol + ", graphic=" + graphic + ", wifi=" + wifi + "]";
	}
	

	

}
