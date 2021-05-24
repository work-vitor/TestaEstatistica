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
	
	public static float[] lerArquivo1F() throws FileNotFoundException, IOException {
		float vet[];
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

		vet = new float[N];

		if (N > 0) {
			int i = 0;
			buffRead = new BufferedReader(new FileReader(arqLeitura));
			System.out.println("Lendo o arquivo " + arqLeitura);
			System.out.println("Numero de Linhas: " + N);
			linha = buffRead.readLine();

			while (linha != null) {
				vet[i++] = Float.parseFloat(linha);
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
	public static void ordena(int vet[]) {
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

	// CRIE AQUI O MÉTODO exibe(float vet[])
	public static void exibe(float vet[]) {
		DecimalFormat df = new DecimalFormat("#.00");

		for (int i = 0; i < vet.length; i++) {
			System.out.println(df.format(vet[i]));
		}
	}

	// CRIE AQUI O MÉTODO ordena(float vet[])
	public static void ordena(float vet[]) {
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					float aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
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
	public static void ordena(double vet[]) {
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

}
