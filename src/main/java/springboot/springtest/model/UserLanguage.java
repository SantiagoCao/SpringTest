package springboot.springtest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_LANGUAGE")
public class UserLanguage implements Serializable {
	
	private static final long serialVersionUID = 4894729030347835498L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "USL_USER", nullable = false, unique = true)
	private String usl_user;

	@Column(name = "USL_LANGUAGE", nullable = false)
	private String usl_language;
	
	public UserLanguage(Long id, String usl_user, String usl_language) {
		this.id = id;
		this.usl_user = usl_user;
		this.usl_language = usl_language;
	}
	
	public UserLanguage() {
	}		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsl_user() {
		return usl_user;
	}

	public void setUsl_user(String usl_user) {
		this.usl_user = usl_user;
	}

	public String getUsl_language() {
		return usl_language;
	}

	public void setUsl_language(String usl_language) {
		this.usl_language = usl_language;
	}


}