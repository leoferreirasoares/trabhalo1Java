
public class Participante {
	private String nome;
	private String email;
	private String palestra;
	public Participante(String texto) {
		String Pessoa[] = texto.split(",");
		this.nome = Pessoa[0];
		this.email = Pessoa[1];
		this.palestra = Pessoa[2];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPalestra() {
		return palestra;
	}
	public void setPalestra(String palestra) {
		this.palestra = palestra;
	}
	
}
