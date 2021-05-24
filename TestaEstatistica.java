
package testaestatistica;

import java.io.IOException;

public class TestaEstatistica {


    public static void main(String[] args) throws IOException, IOException {
        // tamanho do espaço amostral
        //int N = 10;
        int[] vetorInt;
        vetorInt = Estatistica.lerArquivo();
        Estatistica.exibe(vetorInt);
        
        float[] vetorFloat;
        vetorFloat = Estatistica.lerArquivo1F();
        Estatistica.exibe(vetorFloat);
        
        double[] vetorDouble;
        vetorDouble = Estatistica.lerArquivo1D();
        Estatistica.exibe(vetorDouble);
        
        
        
    }
    
    
    
}


//iremos trabalhar com vetores int, float e double
/*int[] vetorInt = new int[N];
float[] vetorFloat = new float[N];
double[] vetorDouble = new double[N];

// inicializando os valores dos vetores
for (int i = 0; i < N; i++) {
    vetorInt[i] = (int)(Math.random()*N*N);
    vetorFloat[i] = (float)(Math.random()*N*N);
    vetorDouble[i] = (double)(Math.random()*N*N);
}

// testando o vetor de inteiros
System.out.println("Vetor de Inteiros Original");
Estatistica.exibe(vetorInt);
Estatistica.ordena(vetorInt);
System.out.println("Vetor de Inteiros Ordenado");
Estatistica.exibe(vetorInt);

//// testando o vetor de float
System.out.println("Vetor de Float Original");
Estatistica.exibe(vetorFloat);
Estatistica.ordena(vetorFloat);
System.out.println("Vetor de Float Ordenado");
Estatistica.exibe(vetorFloat); 

//// testando o vetor de double
System.out.println("Vetor de Double Original");
Estatistica.exibe(vetorDouble);
Estatistica.ordena(vetorDouble);
System.out.println("Vetor de Double Ordenado");
Estatistica.exibe(vetorDouble);*/