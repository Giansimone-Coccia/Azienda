package AziendaIO;
import java.util.Vector;
import java.util.Scanner;
import java.io.*;
/**
 * Main class
 * @author gians_ji5genm
 *
 */
public class AziendaMain {

	public static void main(String[] args) {
		//Vectors' creation
		Vector<Azienda> aziende = new Vector<Azienda>();
		Vector<String> nomi = new Vector<String>();
		Vector<String> tipo = new Vector<String>();
		Vector<String> v = new Vector<String>();
		Vector<String> n = new Vector<String>();

		try {
			Scanner file_input = new Scanner(new BufferedReader(new FileReader("FileAziende.txt")));

			file_input.useDelimiter(",");
			while(file_input.hasNext()) {
				nomi.add(file_input.next());
				tipo.add(file_input.next());
				v.add(file_input.next());
				n.add(file_input.nextLine());
			}
			String nome;
			String tipologia;
			String via;
			String num;
			for(int i = 0; i < nomi.size(); i++) {
				nome = nomi.get(i);
				tipologia = tipo.get(i);
				via = v.get(i);
				num = n.get(i);
				Azienda a = new Azienda(nome, tipologia, via, num);
				aziende.add(a);
			}
			System.out.println(nomi);
			System.out.println(tipo);
			System.out.println(v);
			System.out.println(n);
			System.out.println(aziende);
		}
		catch(IOException e) {
			System.out.println("C'è stato un errore con l'I/O");
			System.out.println(e);
		}
		
		catch(IllegalStateException er) {
			System.out.println("Qualcosa è andato storto");
		}

	}

}
