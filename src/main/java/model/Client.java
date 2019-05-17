package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typedeclient", discriminatorType = DiscriminatorType.STRING)
@XmlAccessorType(value = XmlAccessType.FIELD) // pour le document xml cf
												// http://blog.paumard.org/cours/jaxb-rest/chap02-jaxb-annotations.html
@XmlRootElement
/**
 * La classe Client regroupe toutes les informations d'un nouveau ou ancien
 * clients elle sera candidate � la persitance grace a l'annotation entity
 * L'ensemble des m�thodes et des attributs li�s � cette classe sera h�rit� par
 * les enfants A partir du constructeurs engendr� par les attributs; et des
 * methodes on pourra creer de nouveau clients ou modifier des anciens clients
 * sur ce nouveau logiciel Grace � @inheritance et @discriminatorcolumn cela
 * permettra de specifi� le type de client(entreprise ou particulier) dans la
 * table en base de donn�e.
 * 
 * @author Gwen et Joachim
 */
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "Conseiller_id", unique = true)
	private Conseiller conseiller;

	private String name;
	private String nickname;
	private String address;
	private String postalCode;
	private String city;
	private String number;

	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<CompteBancaire> compteBancaire = new ArrayList<CompteBancaire>();

	public Client() {
		super();
	}

	public Client(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public Client(String name, String nickname, String address, String postalCode, String city, String number) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.number = number;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<CompteBancaire> getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(List<CompteBancaire> compteBancaire) {
		this.compteBancaire = compteBancaire;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", nickname=" + nickname + ", address=" + address
				+ ", postalCode=" + postalCode + ", city=" + city + ", number=" + number + "]";
	}

}
