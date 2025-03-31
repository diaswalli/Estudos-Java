import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Cadastro de Usuário ===");
        
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Altura (metros): ");
        double altura = sc.nextDouble();
        
        System.out.print("É estudante? (true/false): ");
        boolean estudante = sc.nextBoolean();
        
        // Consumir a quebra de linha pendente
        sc.nextLine(); 
        
        System.out.print("Curso (se aplicável): ");
        String curso = sc.nextLine();
        
        System.out.println("\nDados cadastrados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Estudante: " + (estudante ? "Sim" : "Não"));
        if(estudante) {
            System.out.println("Curso: " + curso);
        }
        
        sc.close();
    }
}