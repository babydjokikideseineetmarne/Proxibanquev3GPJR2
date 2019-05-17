package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "personne", discriminatorType = DiscriminatorType.STRING)
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
/**
 * @author Joachim Gwen La classe Personne est une classe parente de
 *         Conseiller,Gerant et Client. Elle permet de standardiser la création
 *         des personnes et de leur transmettre les attributs.
 */
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String nickname;

	public Personne() {
		super();
	}

	public Personne(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", name=" + name + ", nickname=" + nickname + "]";
	}

}
