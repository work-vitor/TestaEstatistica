package testaestatistica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class Estatistica {

	public static int[] lerArquivo() throws FileNotFoundException, IOException {
		int vet[];
		String arqLeitura = "";
		String linha;
		JFileChooser chooser = new JFileChooser();
		// filtro de tipo de arquivo
		FileFilter filter = new FileNameExtensionFilter("Só TXT !", "txt");
		chooser.addChoosableFileFilter(filter);
		// diálogo de escolha do arquivo
		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			arqLeitura = chooser.getSelectedFile().getAbsolutePath();
		}

		// esse bloco de código serve somente para descobrir quantas linhas tem no
		// arquivo
		int N = 0;
		BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura));
		linha = buffRead.readLine();
		while (linha != null) {
			N++;
			linha = buffRead.readLine();
		}
		buffRead.close();

		vet = new int[N];

		if (N > 0) {
			int i = 0;
			buffRead = new BufferedReader(new FileReader(arqLeitura));
			System.out.println("Lendo o arquivo " + arqLeitura);
			System.out.println("Numero de Linhas: " + N);
			linha = buffRead.readLine();

			while (linha != null) {
				vet[i++] = Integer.parseInt(linha);
				linha = buffRead.readLine();
			}
			buffRead.close();
		} else {
			System.out.println("Arquivo vazio !");
		}
		return vet;
	}

	public static double[] lerArquivo1D() throws FileNotFoundException, IOException {
		double vet[];
		String arqLeitura = "";
		String linha;
		JFileChooser chooser = new JFileChooser();
		// filtro de tipo de arquivo
		FileFilter filter = new FileNameExtensionFilter("Só TXT !", "txt");
		chooser.addChoosableFileFilter(filter);
		// diálogo de escolha do arquivo
		float returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			arqLeitura = chooser.getSelectedFile().getAbsolutePath();
		}

		// esse bloco de código serve somente para descobrir quantas linhas tem no
		// arquivo
		int N = 0;
		BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura));
		linha = buffRead.readLine();
		while (linha != null) {
			N++;
			linha = buffRead.readLine();
		}
		buffRead.close();

		vet = new double[N];

		if (N > 0) {
			int i = 0;
			buffRead = new BufferedReader(new FileReader(arqLeitura));
			System.out.println("Lendo o arquivo " + arqLeitura);
			System.out.println("Numero de Linhas: " + N);
			linha = buffRead.readLine();

			while (linha != null) {
				vet[i++] = Double.parseDouble(linha);
				linha = buffRead.readLine();
			}
			buffRead.close();
		} else {
			System.out.println("Arquivo vazio !");
		}
		return vet;
	}

	// exibe um vetor de inteiros
	public static void exibe(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	// ordena um vetor de inteiros
	public static void rol(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}

	// Media int
	public static void Media(int vet[]) {

		int so = 0;
		float media = 0;
		for (int i = 0; i < vet.length; i++) {
			so += vet[i];
		}
		media = so / vet.length;
		System.out.printf("\nMedia do vetor int: %.2f\n\n", +media);

	}

	// Mediana int
	public static void Mediana(int vet[]) {

		float mediana = 0;
		int n = vet.length;

		if (n % 2 != 0) {
			System.out.println("Mediana impar: " + vet[(((vet.length+1)/2)-1)]);
		} else {
			float media = n / 2;
			mediana = (vet[(int) (media - 1)] + vet[(int) media]) / 2;
			System.out.printf("Mediana par %.2f: ", +mediana);

		}

	}

	// CRIE AQUI O MÉTODO exibe(double vet[])
	public static void exibe(double vet[]) {
		DecimalFormat df = new DecimalFormat("#.00");

		for (int i = 0; i < vet.length; i++) {
			System.out.println(df.format(vet[i]));
		}
	}

	// CRIE AQUI O MÉTODO ordena(double vet[])
	public static void rol(double vet[]) {
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					double aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}

	// Media Double
	public static void Media(double vet[]) {

		float so = 0;
		// float media = 0;
		for (int i = 0; i < vet.length; i++) {
			so += vet[i];
		}
		// media = so/vet.length;
		System.out.printf("\nMedia do vetor int: %.2f\n\n", +so / vet.length);

	}

	// Mediana Double
	public static void Mediana(double vet[]) {

		double mediana = 0;
		int n = vet.length;

		if (n % 2 != 0) {
			int posicao = ((vet.length + 1) / 2) - 1;
			mediana = vet[posicao];
			System.out.println("Mediana: " + mediana);
		} else {
			double media = n / 2;
			mediana = (vet[(int) (media - 1)] + vet[(int) media]) / 2;
			System.out.printf("Mediana: %.2f ", +mediana);

		}

	}

}
