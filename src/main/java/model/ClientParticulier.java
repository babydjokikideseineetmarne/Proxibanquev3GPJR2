package model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("PARTICULIER")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement
/**
 * La classe Particulier herite de la classe Client. Elle sera utilisé pour la
 * méthode audit en différenciant les clients particuliers des entreprises.
 * 
 * @author Gwen et Joachims
 */
public class ClientParticulier extends Client {

	public ClientParticulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientParticulier(String name, String nickname, String address, String postalcode, String city,
			String number) {
		super(name, nickname, address, postalcode, city, number);
		// TODO Auto-generated constructor stub
	}

	public ClientParticulier(String name, String nickname) {
		super(name, nickname);
		// TODO Auto-generated constructor stub
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
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getNickname() {
		// TODO Auto-generated method stub
		return super.getNickname();
	}

	@Override
	public void setNickname(String nickname) {
		// TODO Auto-generated method stub
		super.setNickname(nickname);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public String getPostalCode() {
		// TODO Auto-generated method stub
		return super.getPostalCode();
	}

	@Override
	public void setPostalCode(String postalCode) {
		// TODO Auto-generated method stub
		super.setPostalCode(postalCode);
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return super.getCity();
	}

	@Override
	public void setCity(String city) {
		// TODO Auto-generated method stub
		super.setCity(city);
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return super.getNumber();
	}

	@Override
	public void setNumber(String number) {
		// TODO Auto-generated method stub
		super.setNumber(number);
	}

	@Override
	public List<CompteBancaire> getCompteBancaire() {
		// TODO Auto-generated method stub
		return super.getCompteBancaire();
	}

	@Override
	public void setCompteBancaire(List<CompteBancaire> compteBancaire) {
		// TODO Auto-generated method stub
		super.setCompteBancaire(compteBancaire);
	}

	@Override
	public Conseiller getConseiller() {
		// TODO Auto-generated method stub
		return super.getConseiller();
	}

	@Override
	public void setConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		super.setConseiller(conseiller);
	}

	@Override
	public String toString() {
		return "ClientParticulier []";
	}

}
