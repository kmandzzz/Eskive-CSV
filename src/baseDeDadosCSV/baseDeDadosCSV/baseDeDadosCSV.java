package baseDeDadosCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @@@@@@@@@ DESAFIO ESKIVE ARQUIVO CSV
 * AMANDA OLIVEIRA
 * 				TODOS OS DIREITOS RESERVADOS @@@@@@@@@
 */

public class baseDeDadosCSV {

	public static void main(String[] args) {

		// abre um arquivo e cria um file
		File arquivoCSV = new File("C:\\BaseEskive1.csv");

		try {

			try (// cria um scanner para ler o arquivo
					Scanner leitor = new Scanner(arquivoCSV)) {
				// variavel que armazenara as linhas do arquivo
				String linhasDoArquivo = new String();

				// percorre todo o arquivo
				while (leitor.hasNext()) {

					// recebe cada linha do arquivo
					linhasDoArquivo = leitor.nextLine();

					// separa os campos entre as virgulas de cada linha
					String[] valoresEntreVirgulas = linhasDoArquivo.split(",");

					// imprime a coluna que quiser
					System.out.println(linhasDoArquivo);
				}
			}

		} catch (FileNotFoundException e) {

		}

	}

}
