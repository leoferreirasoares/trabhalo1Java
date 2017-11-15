import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Controle {
	static private  Evento[] vEvento = new Evento[1];
	static private int indEvento = 0;
	static private  Palestra[] vPalestra = new Palestra[4];
	static private int indPalestra = 0;
	static private  Palestrantes[] vPalestrante = new Palestrantes[3];
	static private int indPalestrantes = 0;
	static private  Participante[] vParticipante = new Participante[10];
	static private int indParticipante = 0;
	public static void main(String[] args)throws FileNotFoundException{
		File fileEvento = new File("/home/leonardo/workspace/Trabalho1/src/eventos.csv");
		File filePalestra = new File("/home/leonardo/workspace/Trabalho1/src/palestra.csv");
		File filePalestrante = new File("/home/leonardo/workspace/Trabalho1/src/palestrante.csv");
		File fileParticipante = new File("/home/leonardo/workspace/Trabalho1/src/participantes.csv");
 		Scanner scEvento = new Scanner(fileEvento);
 		Scanner scPalestra = new Scanner(filePalestra);
 		Scanner scPalestrante = new Scanner(filePalestrante);
 		Scanner scParticipante = new Scanner(fileParticipante);
 		while (scEvento.hasNextLine()){
 			cadastroEventos(scEvento.nextLine());
 		}
 		while (scPalestra.hasNextLine()){
 			cadastroPalestra(scPalestra.nextLine());
 		}
 		while (scPalestrante.hasNextLine()){
 			cadastroPalestrante(scPalestrante.nextLine());
 		}
 		while (scParticipante.hasNextLine()){
 			cadastroParticipante(scParticipante.nextLine());
 		}
 		EmitirCertificados();
	}
	private static void cadastroEventos(String texto) {
		if(indEvento < vEvento.length){
			vEvento[indEvento] = new Evento(texto);
			indEvento++;
		}
	}
	private static void cadastroPalestra(String texto) {
		if(indPalestra < vPalestra.length){
			vPalestra[indPalestra] = new Palestra(texto);
			indPalestra++;
		}
	}
	private static void cadastroPalestrante(String texto) {
		if(indPalestrantes < vPalestrante.length){
			vPalestrante[indPalestrantes] = new Palestrantes(texto);
			indPalestrantes++;
		}
	}
	private static void cadastroParticipante(String texto) {
		if(indParticipante < vParticipante .length){
			vParticipante [indParticipante] = new Participante(texto);
			indParticipante++;
		}
	}
	
	private static void EmitirCertificados() {
		System.out.println("Confira a baixo os certificados do evento "+vEvento[0].getNome()+" que foir realizado na data "+ vEvento[0].getData());
		System.out.println("========================= Nossos participantes ============================== ");
		for(int k=0 ; k < indParticipante ; k++)
			System.out.println(" Certificamos que o sr(a) "+vParticipante[k].getNome()+" foi palestrante no evento "+vEvento[0].getNome());
		System.out.println("=============== Nossos os palestrantes ======================================");
		for(int k=0 ; k < indPalestrantes ; k++)
			System.out.println(" Certificamos que o sr(a) "+vPalestrante[k].getNome()+" foi palestrante no evento "+vEvento[0].getNome());
		System.out.println("=============== Nossos os organizadores ======================================");
		for(int k=0 ; k < indPalestrantes ; k++){
			if(vPalestrante[k].getOrganizador() == 'S')
			System.out.println(" Certificamos que o sr(a) "+vPalestrante[k].getNome()+" foi organizador no evento "+vEvento[0].getNome());
	
		}
	}
	

}
