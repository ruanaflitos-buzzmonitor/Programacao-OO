// Alunos:
// Ruan dos Santos Aflitos
// Hebert Cerqueira Fiuza




import java.util.Scanner;
public class Pessoa {
    public String nome;
    public int idade;
    public String profissao;

    
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    
    public void exibirDados(String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissao: " + profissao);
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados da Pessoa 1
        System.out.println("=== Cadastro da Primeira Pessoa ===");
        System.out.print("Digite o nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a profissao: ");
        String profissao1 = scanner.nextLine();

        
        System.out.println("\n=== Cadastro da Segunda Pessoa ===");
        System.out.print("Digite o nome: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a profissao: ");
        String profissao2 = scanner.nextLine();

        
        Pessoa pessoa1 = new Pessoa(nome1, idade1, profissao1);
        Pessoa pessoa2 = new Pessoa(nome2, idade2, profissao2);

        
        pessoa1.exibirDados("Primeira Pessoa");
        System.out.println();
        pessoa2.exibirDados("Segunda Pessoa");

        scanner.close();
    }
}