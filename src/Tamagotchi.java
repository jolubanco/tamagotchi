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

    public void setSaude(int valor) {
        this.saude += valor;
        if (this.saude > 100){
            this.saude = 100;
        }
    }

    public int getFome() {
        return fome;
    }

    public void alimenta(int valor) {
        this.fome -= valor;
        this.setSaude(2);
        if (this.fome < 0) {
            this.fome = 0;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void dormir(){
        this.energia += 20;
        this.alimenta(-5);
        this.setSaude(2);
        if (this.energia > 100){
           this.energia = 100;
        }
    }

    public void brincar(){
        this.energia -= 15;
        this.alimenta(-10);
        this.setSaude(2);
        if (this.energia < 0){
            this.energia = 0;
        } else if (this.energia <= 5){
            System.out.println("Preciso Dormir!!!");
        }
    }
    //preciso fazer algo para quando a energia estiver muito baixo, forçar a dormir

    public int getHumor(){
        return (this.getSaude() + this.getEnergia() - this.getFome());
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
        this.setSaude(-1);
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

        System.out.print("Informe o número: ");
        return ler.nextInt();
    }

    public void realizaAcao( int numero){
        if(numero == 1){
            this.alimenta(10);
            System.out.println("\nNhami, que gostoso!");
        } else if (numero == 2){
            this.brincar();
            System.out.println("\nEstou muito feliz por brincar com você!");
        } else if (numero == 3) {
            this.dormir();
            System.out.println("\nQue soninho...");
        } else if (numero == 4) {
            this.setSaude(10);
            System.out.println("\nEcaaa, tem gosto ruim esse remédio!");
        } else if (numero == 5) {
            System.out.println("\nMeu Humor está em " + this.getHumor() + "!");
        } else if (numero == 6) {
            System.out.println("\nMinha idade está em " + this.getIdade() + "!");
        } else if (numero == 7) {
            System.out.println("\nMinha fome está em " + this.getFome() + "!");
        } else if (numero == 8) {
            System.out.println("\nMinha saúde está em " + this.getSaude() + "!");
        } else if (numero == 9) {
            System.out.println("\nMinha energia está em " + this.getEnergia() + "!");
        }

    }

}
