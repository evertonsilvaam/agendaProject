package model;

public class JavaBeans {
	private String idcontato;
	private String nome;
	private String fone;
	private String email;
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavaBeans(String idcontato, String nome, String fone, String email) {
		super();
		this.idcontato = idcontato;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}



	public String getIdcontato() {
		return idcontato;
	}

	public void setIdcontato(String idcontato) {
		this.idcontato = idcontato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
