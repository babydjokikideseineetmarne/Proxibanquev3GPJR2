package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement
/**
 * La classe Conseiller regroupe l'ensemble de ses attributs, getters, setters
 * et constructeurs elle est candidate a etre peristée grace a entity.
 * 
 * @author Joachim Gwennhaelle
 *
 */
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String nickname;

	@ManyToOne
	@JoinColumn(name = "gerant_id", unique = true)
	private Gerant gerant;

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private List<Client> listec = new ArrayList<Client>();

	public Conseiller() {
		super();
	}

	public Conseiller(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Client> getListec() {
		return listec;
	}

	public void setListec(List<Client> listec) {
		this.listec = listec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@Override
	public String toString() {
		return "Conseiller [name=" + name + ", nickname=" + nickname + "]";
	}
}
