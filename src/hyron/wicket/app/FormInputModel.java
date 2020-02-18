package hyron.wicket.app;

import org.apache.wicket.IClusterable;

public class FormInputModel implements IClusterable{

	/**
	 * add default seria
	 */
	private static final long serialVersionUID = 1L;

	private String inputString;
	
	private String info;

	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}
