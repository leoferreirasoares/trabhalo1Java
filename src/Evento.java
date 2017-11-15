
public class Evento {
	private String nome;
	private String data;
	public Evento(String texto) {
		String listaEventos[] = texto.split(",");
		this.nome = listaEventos[0];
		this.data = listaEventos[1];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	

}
