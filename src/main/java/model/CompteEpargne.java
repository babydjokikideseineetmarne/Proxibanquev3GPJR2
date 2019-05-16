package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class CompteEpargne extends CompteBancaire {

	public CompteEpargne(String numberaccompte) {
		super(numberaccompte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompteEpargne []";
	}

}
