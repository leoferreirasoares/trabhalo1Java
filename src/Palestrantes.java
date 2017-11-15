
public class Palestrantes {
	private char organizador;
	private String curriculo;
	private String email;
	private String telefone;
	private String nome;
	public Palestrantes(String texto) {
		String Palestrante[] = texto.split(",");
		this.organizador = Palestrante[0].charAt(0);
		this.curriculo =Palestrante[1];
		this.email = Palestrante[2];
		this.telefone = Palestrante[3];
		this.nome = Palestrante[4];
	}
	public char getOrganizador() {
		return organizador;
	}
	public void setOrganizador(char organizador) {
		this.organizador = organizador;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
