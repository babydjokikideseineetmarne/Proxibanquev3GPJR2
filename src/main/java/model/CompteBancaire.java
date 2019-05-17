package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typedecompte", discriminatorType = DiscriminatorType.STRING)
@Entity
/**
 * La classe CompteBancaire est caracterisée est canditate a etre persitée grace
 * a entity. Grace a inheritence et discriminatorcolumn elle va recuperer ses
 * classes filles afin de les regrouper dans sa table. Il en existe deux type ce
 * compte courant et epargne
 * 
 * @author Gwen et Joachim
 */
public class CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numberAccompte;
	private String datecrea;
	private double sold;

	@ManyToOne
	@JoinColumn(name = "Client_id", unique = true)
	private Client client;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String numberAccompte) {
		super();
		this.numberAccompte = numberAccompte;
	}

	public CompteBancaire(String numberAccompte, String datecrea, double sold) {
		super();
		this.numberAccompte = numberAccompte;
		this.datecrea = datecrea;
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numberAccompte=" + numberAccompte + "]";
	}

	public String getNumberAccompte() {
		return numberAccompte;
	}

	public void setNumberAccompte(String numberAccompte) {
		this.numberAccompte = numberAccompte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDatecrea() {
		return datecrea;
	}

	public void setDatecrea(String datecrea) {
		this.datecrea = datecrea;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

}
