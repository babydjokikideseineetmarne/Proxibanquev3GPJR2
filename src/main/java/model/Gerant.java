package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement
/**
 * La classe Gerant regroupe l'ensemble des méthodes et des attributs liés au
 * différentes gerant des agences.
 * 
 * @author Joachim Gwennhaelle
 *
 */
public class Gerant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "gerant", cascade = { CascadeType.PERSIST })
	List<Conseiller> listecons = new ArrayList<Conseiller>();

	private String name;
	private String nickname;

	public Gerant(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public Gerant() {
		super();
	}

	@Override
	public String toString() {
		return "Gerant [name=" + name + ", nickname=" + nickname + "]";
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

	public List<Conseiller> getListecons() {
		return listecons;
	}

	public void setListecons(List<Conseiller> listecons) {
		this.listecons = listecons;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
