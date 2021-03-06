package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("EPARGNE")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement
/**
 * La classe CompteEpargne h�rite de la classe CompteBancaire.
 * 
 * 
 * @author Gwen et Joachim
 */
public class CompteEpargne extends CompteBancaire {
	private static final double tauxRemuneration = 0.03;

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(String numberAccompte, String datecrea, double sold) {
		super(numberAccompte, datecrea, sold);
		// TODO Auto-generated constructor stub
	}

	public static double getTauxremuneration() {
		return tauxRemuneration;
	}

	@Override
	public String getNumberAccompte() {
		// TODO Auto-generated method stub
		return super.getNumberAccompte();
	}

	@Override
	public void setNumberAccompte(String numberAccompte) {
		// TODO Auto-generated method stub
		super.setNumberAccompte(numberAccompte);
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public Client getClient() {
		// TODO Auto-generated method stub
		return super.getClient();
	}

	@Override
	public void setClient(Client client) {
		// TODO Auto-generated method stub
		super.setClient(client);
	}

	@Override
	public String getDatecrea() {
		// TODO Auto-generated method stub
		return super.getDatecrea();
	}

	@Override
	public void setDatecrea(String datecrea) {
		// TODO Auto-generated method stub
		super.setDatecrea(datecrea);
	}

	@Override
	public double getSold() {
		// TODO Auto-generated method stub
		return super.getSold();
	}

	@Override
	public void setSold(double sold) {
		// TODO Auto-generated method stub
		super.setSold(sold);
	}

	@Override
	public String toString() {
		return "CompteEpargne []";
	}

}
