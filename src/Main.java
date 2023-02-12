import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Crie uma classe Agenda que pode armazenar 10 pessoas e consiga realizar as seguintes
        operações:
        a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
        b. void removerPessoa(String nome); //remove a pessoa do array
        c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
        d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
        e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
         */
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Sua agenda está aberta, o que deseja fazer?");
            System.out.println("""
                    1 - novo contato;
                    2 - remover contato;
                    3 - buscar contato;
                    4 - imprimir agenda;
                    5 - imprimir pessoa;
                    0 - fechar agenda.
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1 -> agenda.armazenarPessoa();
                case 2 -> agenda.removerPessoa();
                case 3 -> agenda.buscarPessoa();
                case 4 -> agenda.imprimirAgenda();
                case 5 -> agenda.imprimirPessoa();
                case 0 -> System.out.println("A agenda foi fechada.");
            }

        } while(opcao != 0);
    }
}