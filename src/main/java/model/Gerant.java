package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
/**
 * @author JOachim Gwennhaelle
 *
 */
public class Gerant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//@OneToMany(mappedBy = "name")
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
	
	
	

}
