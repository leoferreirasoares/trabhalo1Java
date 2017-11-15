
public class Palestra {
	private int sala;
	private String horario;
	private String titulo;
	private String resumo;
	private String palestrante;
	private String evento;
	public Palestra(String texto) {
		String listaPalestra[] = texto.split(",");
		this.sala = Integer.parseInt(listaPalestra[0]);
		this.horario =listaPalestra[1];
		this.titulo =listaPalestra[2];
		this.resumo = listaPalestra[3];
		this.palestrante =listaPalestra[4];
		this.evento = listaPalestra[5];
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public String getEvento() {
		return evento;
	}
	

}
