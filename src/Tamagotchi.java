import java.util.ArrayList;
import java.util.Scanner;

public class Tamagotchi {

    private String nome;
    private int saude = 70;
    private int fome = 20;
    private int energia = 50;
    private int idade = 0;

    public Tamagotchi(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(){
        this.idade +=1;
    }

    public String getNome() {
        return nome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude() {
        this.saude += 10;
    }

    public int getFome() {
        return fome;
    }

    public void setFome() {
        this.fome -= 10;
    }

    public int getEnergia() {
        return energia;
    }

    public void dormir(){
        this.energia += 20;
        this.fome += 5;
    }
    public void brincar(){
        this.energia -= 10;
        this.fome += 10;
    }

    public int getHumor(){
        return (this.saude - this.fome);
//        return Math.abs(this.saude - this.fome);
    }

    public int defineOpcao(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n"+
                "1. Me alimenta \n" +
                "2. Brinca comigo \n" +
                "3. Me põe pra dormir \n" +
                "4. Me da Remédio \n" +
                "5. Visualizar Humor \n" +
                "6. Visualizar Idade \n" +
                "7. Visualizar Fome \n" +
                "8. Visualizar Saúde \n"+
                "9. Visualizar Energia");
        return leitor.nextInt();
    }

    //escolher qual método ira ser mantido

    public int escolheOpcao(){
        this.setIdade();
        Scanner ler = new Scanner(System.in);

        // [ A ] declarando e instanciando uma agenda de contatos
        ArrayList<String> agenda = new ArrayList();

        // [ B ] usando o método add() para gravar contatos na agenda
        agenda.add("Me alimenta");
        agenda.add("Brinca comigo");
        agenda.add("Me põe pra dormir");
        agenda.add("Me da Remédio");
        agenda.add("Veja meu Humor");
        agenda.add("Veja minha Idade");
        agenda.add("Veja minha Fome");
        agenda.add("Veja minha Saúde");
        agenda.add("Veja minha Energia");

        // [ C ] mostrando os "n" contatos da agenda (usando o índice)
        // número de elementos da agenda: método size()
        System.out.printf("Escolha uma opção: \n");
        int n = agenda.size();
        for (int i=0; i<n; i++) {
            System.out.printf("%d. %s\n", i+1, agenda.get(i));
        }

        System.out.printf("\nInforme o número: \n");
        return ler.nextInt();
    }

    public void realizaAcao( int numero){
        if(numero == 1){
            this.setFome();
        } else if (numero == 2){
            this.brincar();
        } else if (numero == 3) {
            this.dormir();
        } else if (numero == 4) {
            this.setSaude();
        } else if (numero == 5) {
            System.out.println("Meu Humor está em " + this.getHumor() + "!");
        } else if (numero == 6) {
            System.out.println("Minha idade está em " + this.getIdade() + "!");
        } else if (numero == 7) {
            System.out.println("Minha fome está em " + this.getFome() + "!");
        } else if (numero == 8) {
            System.out.println("Minha saúde está em " + this.getSaude() + "!");
        } else if (numero == 9) {
            System.out.println("Minha energia está em " + this.getEnergia() + "!");
        }

    }

}
