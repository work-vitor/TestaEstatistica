
package testaestatistica;

import java.io.IOException;

public class TestaEstatistica {


    public static void main(String[] args) throws IOException, IOException {
        // tamanho do espaço amostral
        //int N = 10;
        int[] vetorInt;
        vetorInt = Estatistica.lerArquivo();
        Estatistica.rol(vetorInt);
        Estatistica.exibe(vetorInt);
        Estatistica.Media(vetorInt);
        Estatistica.Mediana(vetorInt);
        
        
        double[] vetorDouble;
        vetorDouble = Estatistica.lerArquivo1D();
        Estatistica.rol(vetorDouble);
        Estatistica.exibe(vetorDouble);
        Estatistica.Media(vetorDouble);
        Estatistica.Mediana(vetorDouble);
        
        
        
    }
    
    
    
}

