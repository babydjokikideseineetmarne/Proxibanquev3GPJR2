package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class CompteCourant extends CompteBancaire {

	public CompteCourant(String numberaccompte) {
		super(numberaccompte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompteCourant []";
	}

}
