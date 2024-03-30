import br.com.alura.models.BuscarEndereco;
import br.com.alura.models.CriandoArquivo;
import br.com.alura.models.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BuscarEndereco consultaCep = new BuscarEndereco();
        Scanner input = new Scanner(System.in);

            try {
                System.out.println("Digite um cep");
                String cepDigitado = input.nextLine();
                Endereco novoEndereco = consultaCep.consultarCep(cepDigitado);
                System.out.println(novoEndereco);
                CriandoArquivo arquivo01 = new CriandoArquivo();
                arquivo01.gerandoJson(novoEndereco);
            } catch (RuntimeException | IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Encerrando aplicação...");
            }
    }
}