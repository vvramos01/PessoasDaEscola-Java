public class Main {
   public static void main(String[] args) {
       Aluno aluno = new Aluno("João", "joao@email.com", "20251234");
       Professor professor = new Professor("Maria", "maria@email.com", 4500.00);


       System.out.println("Aluno:");
       System.out.println("Nome: " + aluno.nome);
       System.out.println("Email: " + aluno.email);
       System.out.println("Matrícula: " + aluno.matricula);


       System.out.println();


       System.out.println("Professor:");
       System.out.println("Nome: " + professor.nome);
       System.out.println("Email: " + professor.email);
       System.out.println("Salário: " + professor.salario);
   }
}

