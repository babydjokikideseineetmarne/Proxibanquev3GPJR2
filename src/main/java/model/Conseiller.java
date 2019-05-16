package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String nickname;

	// @ManyToOne
	// @JoinColumn(name = "client_id", unique = true)
	// sera un compte ou client


	@OneToMany(mappedBy = "conseiller")
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

	@Override
	public String toString() {
		return "Conseiller [name=" + name + ", nickname=" + nickname + "]";
	}
}
