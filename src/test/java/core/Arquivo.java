package core;

import java.io.*;

import map.RegisterMap;
import page.RegisterPage;

public class Arquivo {
	RegisterPage registerPage = new RegisterPage();
	RegisterMap registerMap = new RegisterMap();

    public void iooO() {
        try {
            // Conteudo
            String content = "Tesdasdasasdasdste";
            
            // Cria arquivo
            File file = new File("teste.csv");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Escreve e fecha arquivo
            bw.write(content);
            bw.close();
            
//            // Le o arquivo
//            FileReader ler = new FileReader("teste.txt");
//            BufferedReader reader = new BufferedReader(ler);  
//            String linha; 
//            while( (linha = reader.readLine()) != null ){
//                System.out.println(linha);
//            }

            // Imprime confirmacao
            System.out.println("Feito =D");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
