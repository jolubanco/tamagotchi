import java.util.Scanner;
public class TestaTamagotchi {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do seu Tamagotchi: ");
        String nome = leitor.nextLine(); //nextLine consegue ser um nome composto, enquanto next le apenas a primeira palavra

        Tamagotchi bichinho = new Tamagotchi(nome);

        //DUVIDA AQUI: se criar uma variavel 'boolean valida = bichinho.getSaude() > 0 & bichinho.getFome() < 100'
        //o bichinho nunca morre!

        while(bichinho.getSaude() > 0 & bichinho.getFome() < 100) {

            System.out.println("\n------------------------------------------\n __         __\n" +
                    "/  \\.-' '-./  \\ \n" +
                    "\\    -   -    /\n" +
                    " |   o   o   |\n" +
                    " \\  .-'''-.  /\n" +
                    "  '-\\__Y__/-'\n" +
                    "     `---`\n" +
                    "  \n");

            System.out.println("Olá, meu nome é " + bichinho.getNome());

//--------------------------------
//            int recebeOpcao = bichinho.defineOpcao();
//            System.out.println(recebeOpcao);
//--------------------------------

            int opcao = bichinho.escolheOpcao();
            //System.out.println(opcao);
            bichinho.realizaAcao(opcao);

            //
//            bichinho.setFome(20);
//            bichinho.setSaude(0);
//            //
//            System.out.println("O Humor do " + bichinho.getNome() + " é " + bichinho.getHumor());
//            System.out.println("A idade do " + bichinho.getNome() + " é " + bichinho.getIdade() + " anos.");
//            System.out.println("Fome "+ bichinho.getFome());
//            System.out.println("Saude "+ bichinho.getSaude());
        }

        System.out.println("\n------------------------------------------\n __         __\n" +
                    "/  \\.-' '-./  \\ \n" +
                    "\\    -   -    /\n" +
                    " |   X   X   |\n" +
                    " \\  .-'''-.  /\n" +
                    "  '-\\__Y__/-'\n" +
                    "     `---`\n" +
                    "  \n");
            System.out.println("Você me deixou morrer infeliz :x");
       }



    }

