import java.util.*;
import java.io.*;

class LeitorCsv{
    public static Veiculo[] ler(String caminhoArquivo)throws Exception{
        File csv = new File(caminhoArquivo);//caminho do arquivo na maquina
        Scanner sc = new Scanner(csv);
        Veiculo[] array = new Veiculo[500];//array de veiculos
 
        int tamanho = 0;
        sc.nextLine();//le o cabeçalho
        while(sc.hasNextLine() && tamanho < array.length){//enquanto tiver linha e o tamanho for menor que o tamanho do array
            String s = sc.nextLine();
            if(s.length() > 0){
                array[tamanho] = Veiculo.parseVeiculo(s);//guarda o veiculo transformado
                tamanho++;
            }
        }
        sc.close();
        return array;
    }
}
