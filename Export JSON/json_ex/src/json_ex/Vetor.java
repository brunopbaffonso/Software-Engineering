package json_ex;

/**
 *
 * @author Bruno P. B. Affonso
 * @RA 13019626
 */


/*
Classe Vetor, que recebe os dados da classe Principal, armazena tais dados em um Objeto e os guarda no Vetor!
 */
public class Vetor {

    protected final int TAM = 10;
    protected final Usuario vetor[] = new Usuario[TAM];
    protected int posicao = 0;

    public void Cadastrar(int id, String nome, String cpf, String email, String telefone) {
        if (TAM > posicao) {
            vetor[posicao] = new Usuario(id, nome, cpf, email, telefone);
            posicao++;
        }
    }

    public void ImprimeTodas() {
        int cont;
        for (cont = 0; cont < posicao; cont++) {
            System.out.println(vetor[cont] + ",");
        }
    }

}
