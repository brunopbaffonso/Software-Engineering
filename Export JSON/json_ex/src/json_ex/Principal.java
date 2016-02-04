package json_ex;

/**
 *
 * @author Bruno P. B. Affonso
 * @RA 13019626
 */

/*
Classe Principal, que recebe os dados do usuario e os guarda na Entidade
Esta classe exibe também o resultado da operação da interpretação para o JSON e exporta para o Disco D:\ um arquivo com extensão .JSON também!
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String args[]) throws IOException {

        Scanner leitura = new Scanner(System.in);
        Scanner leituraString = new Scanner(System.in).useDelimiter("\n");

        Vetor usuario = new Vetor();

        int id, opc, cont;
        String nome;
        String cpf;
        String email;
        String telefone;

        id = 0;
        opc = 1;

        while (opc != 0) {

            System.out.println("Se deseja SAIR digite 0,\n ");
            System.out.println("Se deseja CONTINUAR aperte qualquer Numero: ");
            opc = leitura.nextInt();
            if (opc == 0) {
                break;
            }

            System.out.println("\nNome: ");
            nome = leituraString.next();
            System.out.println("CPF: ");
            cpf = leituraString.next();
            System.out.println("E-mail: ");
            email = leituraString.next();
            System.out.println("Telefone: ");
            telefone = leituraString.next();

            usuario.Cadastrar(id, nome, cpf, email, telefone);
            id++;

            System.out.println("\n\n");
            System.out.println("Vetor");
            System.out.println("[");
            usuario.ImprimeTodas();
            System.out.println("]");

            FileWriter arq = null;
            try {
                arq = new FileWriter("d:\\Dados.json");
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("Vetor");
            gravarArq.printf("["
                    + "");

            for (cont = 0; cont < usuario.posicao; cont++) {
                gravarArq.print(usuario.vetor[cont]);
                gravarArq.printf(",");
            }
            gravarArq.printf(""
                    + "]");

            arq.close();

        }
    }
}
