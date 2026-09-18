import java.util.*;
import java.io.*;

class Principal{
    public static void pesquisa(int id, Veiculo[]array){
        for(int i = 0; i < array.length; i++){
            if(id == array[i].getId()){ //procura o carro pelo id
                System.out.println(array[i].format());//se for igual printa as informacoes pelo format da classe veiculo
            }
        }
    }
 
    public static void main(String []args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String caminho = "/tmp/veiculos.csv";
        Veiculo []veiculos = LeitorCsv.ler(caminho);
         
        int id = sc.nextInt();
        while(id > 0){
            pesquisa(id, veiculos);
            id = sc.nextInt();
        }
         
        sc.close();
    }
}
