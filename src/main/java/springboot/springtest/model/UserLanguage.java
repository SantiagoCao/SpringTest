package springboot.springtest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_language")
public class UserLanguage implements Serializable {
	
	private static final long serialVersionUID = 4894729030347835498L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "USL_USER", nullable = false, unique = true)
	private String username;

	@Column(name = "USL_LANGUAGE", nullable = false)
	private String userlanguage;
	
	public UserLanguage(Long id, String username, String userlanguage) {
		this.id = id;
		this.username = username;
		this.userlanguage = userlanguage;
	}
	
	public UserLanguage() {
	}		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserlanguage() {
		return userlanguage;
	}

	public void setUserlanguage(String userlanguage) {
		this.userlanguage = userlanguage;
	}

}