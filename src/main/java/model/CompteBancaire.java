package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	//@ManyToOne
	//@JoinColumn(name = "client_id", unique = true)
	private String numberAccompte;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String numberAccompte) {
		super();
		this.numberAccompte = numberAccompte;
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

}
