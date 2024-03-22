package DesafioFinal;

import java.util.Scanner;
public class desafioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        String[] racas = {"Cachorro","Gato","Papagaio"};
        String[][] nomeAnimal = new String[3][3];
        String [][] comportamentoAnimal = new String[3][3];
        String escolhas;

        boolean[][] adocao = new boolean[3][3];
        boolean loop = true;

        // NOVOS DADOS
        int [][] idade = new int[3][3];
        String [][] cor = new String[3][3];
        boolean [][] apartamento  = new boolean[3][3];
        String[][] doenca = new String[3][3];


        int escolhaLista;

        // PROGRAMA MAIN

        for(int x=0;x<3;x++)
        {
            System.out.println("Raça: " + racas[x] + "\n");

            for(int y=0;y<3;y++)
            {
                nomeAnimal[x][y] = entradaNome();
                System.out.println();

                comportamentoAnimal[x][y] = entradaComportamento();
                System.out.println();

                adocao[x][y] = entradaAdocao();
                System.out.println();

                idade[x][y] = entradaIdade();
                System.out.println();

                cor[x][y] = entradaCor();
                System.out.println();

                apartamento[x][y] = entradaApartamento();
                System.out.println();

                doenca[x][y] = entradaDoenca();
                System.out.println();
            }
        }
        do
        {
            do
            {
                System.out.println("Qual lista você deseja visualizar?\n");
                System.out.println("[1] - Todos os animais");
                System.out.println("[2] - Animais por raça");
                System.out.println("[3] - Animais disponiveis para adoção");
                System.out.println("[4] - Animais que podem morar em apartamentos");
                System.out.println("[5] - Animais com idade especifica");
                System.out.println("[6] - Animais que possuem ou não doenças");

                escolhaLista = sc.nextInt();

                if(escolhaLista < 1 || escolhaLista > 6)
                {
                    System.out.println("\nDigite um valor valido!!");
                    System.out.println();
                }
            }while(escolhaLista < 1 || escolhaLista > 6);

            switch (escolhaLista)
            {
                case 1:
                    listaTodos(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;
                case 2:
                    listaRaca(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;

                case 3:
                    animaisAdocao(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;

                case 4:
                    listaApartamento(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;

                case 5:
                    listaIdade(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;

                case 6:
                    listaDoenca(nomeAnimal, comportamentoAnimal, adocao, racas, idade, cor, apartamento, doenca);
                    break;
            }

            do
            {
                System.out.print("Você deseja fazer uma nova pesquisa?(S/N): ");
                escolhas = sc.next();

                if(escolhas.equalsIgnoreCase("s"))
                {
                    loop = true;
                }
                else if (escolhas.equalsIgnoreCase("n"))
                {
                    loop = false;
                }
                else
                {
                    System.out.println("Digite S ou N!");
                    System.out.println();
                }
            }while (!escolhas.equalsIgnoreCase("s") && !escolhas.equalsIgnoreCase("n"));
        }while (loop);
    }

    // FUNCÃO PARA ENTRADA DO NOME
    public static String entradaNome(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        return sc.nextLine();
    }

    // FUNCÃO PARA ENTRADA DO COMPORTAMENTO
    public static String entradaComportamento(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as informações sobre o comportamento do animal(Ex: calmo/brincalhão, etc.): ");
        return sc.nextLine();
    }

    // FUNCAO PARA ENTRADA LOGICA ADOCAO
    public static boolean entradaAdocao(){
        Scanner sc = new Scanner(System.in);

        String validacao;

        do
        {
            System.out.print("O animal foi adotado?(s/n): ");
            validacao = sc.nextLine();

            if(!validacao.equalsIgnoreCase("s") && !validacao.equalsIgnoreCase("n"))
            {
                System.out.println("Digite S ou N.");
            }
            else if(validacao.equalsIgnoreCase("s"))
            {
                return true;
            }
        }while(!validacao.equalsIgnoreCase("s") && !validacao.equalsIgnoreCase("n"));

        return false;
    }

    // ENTRADA IDADE
    public static int entradaIdade(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qual a idade do animal?: ");
        return sc.nextInt();
    }

    // ENTRADA COR
    public static String entradaCor(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qual a cor do animal?: ");
        return sc.nextLine();
    }

    //ENTRADA APARTAMENTO
    public static boolean entradaApartamento(){
        Scanner sc = new Scanner(System.in);

        String verificacao;

        do
        {
            System.out.print("O animal pode morar em apartamento?(S/N): ");
            verificacao = sc.nextLine();

            if(!verificacao.equalsIgnoreCase("s") && !verificacao.equalsIgnoreCase("n"))
            {
                System.out.println("Digite um valor correto!(S ou N)");
            }
            else if(verificacao.equalsIgnoreCase("s"))
            {
                return true;
            }
        }while(!verificacao.equalsIgnoreCase("s") && !verificacao.equalsIgnoreCase("n"));
        return false;
    }

    // ENTRADA DOENÇA
    public static String entradaDoenca(){
        Scanner sc = new Scanner(System.in);

        String doenca;

        do
        {
            System.out.print("O animal possui alguma doença?(S/N): ");
            doenca = sc.nextLine();

            if(doenca.equalsIgnoreCase("n"))
            {
                return "não possui doença";
            }
            else if(!doenca.equalsIgnoreCase("n") && !doenca.equalsIgnoreCase("s"))
            {
                System.out.println("Digite um valor correto!(S/N)");
            }
        }while (!doenca.equalsIgnoreCase("n") && !doenca.equalsIgnoreCase("s"));

        System.out.print("Digite qual o tipo de doença do animal: ");
        return "tem " + sc.nextLine();
    }

    // LISTA COM TODOS OS ANIMAIS
    public static void listaTodos(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                  String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                  String[][] doenca){

        for(int x=0;x<3;x++)
        {
            System.out.println(racas[x]);

            for(int y=0;y<3;y++)
            {
                System.out.println();
                System.out.println("O animal: " + nomeAnimal[x][y] + " tem o comportamento " +
                                    comportamentoAnimal[x][x] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                                    " e " + doenca[x][y]);

                if(apartamento[x][y])
                {
                    System.out.println("O animal pode ser adotado para apartamento.");
                }
                else
                {
                    System.out.println("O animal não pode ser adotado para apartamento.");
                }

                if(adocao[x][y])
                {
                    System.out.println("Já foi adotado!");
                    System.out.println();
                }
                else
                {
                    System.out.println("Não foi adotado!");
                    System.out.println();
                }


            }
        }
    }

    // LISTA COM RACA ESPECIFICA
    public static void listaRaca(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                 String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                 String[][] doenca){
        Scanner sc = new Scanner(System.in);

        int raca;

        System.out.println("Qual raça você deseja visualizar?: ");
        System.out.println("[1] - " + racas[0]);
        System.out.println("[2] - " + racas[1]);
        System.out.println("[3] - " + racas[2]);
        raca = sc.nextInt();

        switch(raca)
        {
            case 1:
                for(int x=0;x<3;x++) {
                    System.out.println("O animal: " + nomeAnimal[0][x] + ", tem o comportamento " +
                            comportamentoAnimal[0][x] + ", tem " + idade[0][x] + " anos, é " + cor[0][x] +
                            " e " + doenca[0][x]);

                    if (apartamento[0][x]) {
                        System.out.println("O animal pode ser adotado para apartamento.");
                    } else {
                        System.out.println("O animal não pode ser adotado para apartamento.");
                    }

                    if (adocao[0][x]) {
                        System.out.println("Já foi adotado!");
                        System.out.println();
                    } else {
                        System.out.println("Não foi adotado!");
                        System.out.println();
                    }
                }
                break;

            case 2:
                for(int x=0;x<3;x++) {
                    System.out.println("O animal: " + nomeAnimal[1][x] + ", tem o comportamento " +
                            comportamentoAnimal[1][x] + ", tem " + idade[1][x] + " anos, é " + cor[1][x] +
                            " e " + doenca[1][x]);

                    if (apartamento[1][x]) {
                        System.out.println("O animal pode ser adotado para apartamento.");
                    } else {
                        System.out.println("O animal não pode ser adotado para apartamento.");
                    }

                    if (adocao[1][x]) {
                        System.out.println("Já foi adotado!");
                        System.out.println();
                    } else {
                        System.out.println("Não foi adotado!");
                        System.out.println();
                    }
                }
                break;

            case 3:
                for(int x=0;x<3;x++) {
                    System.out.println("O animal: " + nomeAnimal[2][x] + ", tem o comportamento " +
                            comportamentoAnimal[2][x] + ", tem " + idade[2][x] + " anos, é " + cor[2][x] +
                            " e " + doenca[2][x]);

                    if (apartamento[2][x]) {
                        System.out.println("O animal pode ser adotado para apartamento.");
                    } else {
                        System.out.println("O animal não pode ser adotado para apartamento.");
                    }

                    if (adocao[2][x]) {
                        System.out.println("Já foi adotado!");
                        System.out.println();
                    } else {
                        System.out.println("Não foi adotado!");
                        System.out.println();
                    }
                }
                break;
        }
    }

    // LISTA APENAS PARA ADOCAO
    public static void animaisAdocao(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                     String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                     String[][] doenca){
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                if(!adocao[x][y])
                {
                    System.out.println("O animal: " + nomeAnimal[x][y] + ", tem o comportamento " +
                            comportamentoAnimal[x][y] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                            " e " + doenca[x][y]);

                    if (apartamento[x][y])
                    {
                        System.out.println("O animal pode ser adotado para apartamento.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("O animal não pode ser adotado para apartamento.");
                        System.out.println();
                    }
                }
            }
        }
    }

    //LISTA DE ANIMAIS QUE PODEM MORAR EM APARTAMENTO
    public static void listaApartamento(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                        String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                        String[][] doenca){

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                if(apartamento[x][y])
                {
                    System.out.println("O animal: " + nomeAnimal[x][y] + ", tem o comportamento " +
                            comportamentoAnimal[x][y] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                            " e " + doenca[x][y]);

                    if (adocao[x][y]) {
                        System.out.println("Já foi adotado!");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Não foi adotado!");
                        System.out.println();
                    }
                }
            }
        }
    }

    // LISTA IDADE
    public static void listaIdade(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                  String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                  String[][] doenca){
        Scanner sc = new Scanner(System.in);

        int idadePesquisa = 0;
        System.out.print("Até qual idade você deseja pesquisar?: ");
        idadePesquisa = sc.nextInt();

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                if(idade[x][y] <= idadePesquisa)
                {
                    System.out.println("O animal: " + nomeAnimal[x][y] + ", tem o comportamento " +
                            comportamentoAnimal[x][y] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                            " e " + doenca[x][y]);

                    if (apartamento[x][y])
                    {
                        System.out.println("O animal pode ser adotado para apartamento.");
                    }
                    else
                    {
                        System.out.println("O animal não pode ser adotado para apartamento.");
                    }

                    if (adocao[x][y]) {
                        System.out.println("Já foi adotado!");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Não foi adotado!");
                        System.out.println();
                    }
                }
            }
        }
    }

    // LISTA DOENÇA
    public static void listaDoenca(String[][] nomeAnimal, String[][] comportamentoAnimal, boolean[][] adocao,
                                   String[] racas, int[][] idade, String[][] cor, boolean[][] apartamento,
                                   String[][] doenca){
        Scanner sc = new Scanner(System.in);
        String pesquisa;

        do {
            System.out.print("Você deseja pesquisar por animais com alguma doença?(S/N): ");
            pesquisa = sc.nextLine();

            if(!pesquisa.equalsIgnoreCase("s") && !pesquisa.equalsIgnoreCase("n"))
            {
                System.out.println("Digite S ou N!\n");
            }
        }while(!pesquisa.equalsIgnoreCase("s") && !pesquisa.equalsIgnoreCase("n"));

        pesquisa = pesquisa.toUpperCase();

        switch(pesquisa)
        {
            case "S":
                for(int x=0;x<3;x++)
                {
                    for(int y=0;y<3;y++)
                    {
                        if(doenca[x][y].contains("tem"))
                        {
                            System.out.println("O animal: " + nomeAnimal[x][y] + ", tem o comportamento " +
                                    comportamentoAnimal[x][y] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                                    " e " + doenca[x][y]);

                            if (apartamento[x][y])
                            {
                                System.out.println("O animal pode ser adotado para apartamento.");
                            }
                            else
                            {
                                System.out.println("O animal não pode ser adotado para apartamento.");
                            }

                            if (adocao[x][y]) {
                                System.out.println("Já foi adotado!");
                                System.out.println();
                            }
                            else
                            {
                                System.out.println("Não foi adotado!");
                                System.out.println();
                            }
                        }
                    }
                }
                break;

            case "N":
                for(int x=0;x<3;x++)
                {
                    for(int y=0;y<3;y++)
                    {
                        if(!doenca[x][y].contains("tem"))
                        {
                            System.out.println("O animal: " + nomeAnimal[x][y] + ", tem o comportamento " +
                                    comportamentoAnimal[x][y] + ", tem " + idade[x][y] + " anos, é " + cor[x][y] +
                                    " e " + doenca[x][y]);

                            if (apartamento[x][y])
                            {
                                System.out.println("O animal pode ser adotado para apartamento.");
                            }
                            else
                            {
                                System.out.println("O animal não pode ser adotado para apartamento.");
                            }

                            if (adocao[x][y]) {
                                System.out.println("Já foi adotado!");
                                System.out.println();
                            }
                            else
                            {
                                System.out.println("Não foi adotado!");
                                System.out.println();
                            }
                        }
                    }
                }
                break;

        }
    }
}
