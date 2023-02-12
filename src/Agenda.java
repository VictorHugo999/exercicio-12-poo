import java.util.Scanner;
import java.text.DecimalFormat;
public class Agenda extends Pessoas {
    int iVetor = 0;
    Pessoas[] pessoa = new Pessoas[10];
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0,00");
    public void armazenarPessoa() {

        if(iVetor < pessoa.length) {
            pessoa[iVetor] = new Pessoas();

            System.out.println("Digite o nome da pessoa:");
            pessoa[iVetor].setNome(sc.nextLine());
            System.out.println("Digite a idade da pessoa:");
            pessoa[iVetor].setIdade(sc.nextInt());
            System.out.println("Digite a altura da pessoa:");
            pessoa[iVetor].setAltura(sc.nextFloat());
            sc.nextLine();

            iVetor++;
            System.out.println("Contato adcionado com sucesso!");
        } else {
            System.out.println("Agenda cheia! Não é possível adcionar mais pessoas.\n");
        }
    }
    public void removerPessoa() {
        int posicaoContato;

        System.out.println("Digite o número da posição de contato da pessoa que queira remover");
        posicaoContato = sc.nextInt();
        sc.nextLine();
        pessoa[posicaoContato - 1] = null;
        iVetor--;
        System.out.println("Contato removido com sucesso!");

       for(int i = 0; i < iVetor; i++) {
            if(pessoa[i] == null  && pessoa[i + 1] != null) {
                pessoa[i] = pessoa[i + 1];
            }
        }
    }
    public void buscarPessoa() {

        for(int i = 0; i < pessoa.length; i++) {
            if(pessoa[i] != null) {
                String procurarPessoa;
                System.out.println("Digite o nome da pessoa que queira encontrar:");
                procurarPessoa = sc.nextLine();

                if(pessoa[i].getNome().equals(procurarPessoa)) {
                    System.out.println("A pessoa que procura está na posição " + (i + 1));
                    break;
                } else {
                    System.out.println("Pessoa não encontrada.");
                }
            } else {
                System.out.println("Você não adcionou ninguém na sua agenda\n");
                break;
            }
        }
    }
    public void imprimirAgenda() {

        if(iVetor == 0) {
            System.out.println("Você não adcionou ninguém na sua agenda\n");
        } else {
            for(int indice = 0; indice < iVetor; indice++) {

                System.out.println((indice + 1) + " - Nome: " + pessoa[indice].getNome() +
                        "/ Idade: " + pessoa[indice].getIdade() +
                        "/ Altura: " + df.format(pessoa[indice].getAltura()));
            }
        }
    }
    public void imprimirPessoa() {
        int posicaoPessoa;

        for (Pessoas pessoas : pessoa) {
            if (pessoas != null) {
                System.out.println("Digite a posição de contato da pessoa exibir as informações");
                posicaoPessoa = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome: " + pessoa[posicaoPessoa - 1].getNome());
                System.out.println("Idade: " + pessoa[posicaoPessoa - 1].getIdade());
                System.out.println("Altura: " + df.format(pessoa[posicaoPessoa - 1].getAltura()));
                break;
            } else {
                System.out.println("Você não adcionou ninguém na sua agenda\n");
            }
            break;
        }
    }
}
