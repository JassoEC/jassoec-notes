package files.objects;

import java.io.Serializable;

public class Programer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String laguage;

	public Programer(String name, String laguage) {
		super();
		this.name = name;
		this.laguage = laguage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLaguage() {
		return laguage;
	}

	public void setLaguage(String laguage) {
		this.laguage = laguage;
	}

}
