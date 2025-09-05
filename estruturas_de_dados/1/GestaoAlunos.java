import java.util.ArrayList;import java.util.List;
public class GestaoAlunos {
   private List<Aluno> alunos;

   public GestaoAlunos() {
       alunos = new ArrayList<>();
   }

   public boolean adicionarAluno(Aluno aluno) {
       return alunos.add(aluno);
   }

   public boolean excluirAluno(String nome) {
       for (Aluno aluno : alunos) {
           if (aluno.getNome().equals(nome)) {
               alunos.remove(aluno);
               System.out.println("Aluno excluído: " + aluno);
               return true;
           }
       }
       System.out.println("Aluno não encontrado.");
       return false;
   }
    
   public void buscarAluno(String nome) {
       for (Aluno aluno : alunos) {
           if (aluno.getNome().equals(nome)) {
               System.out.println("Aluno encontrado: " + aluno);
               return;
           }
       }
       System.out.println("Aluno não encontrado.");
   }

   public void listarAlunos() {
       System.out.println("Alunos cadastrados:");
       for (Aluno aluno : alunos) {
           System.out.println("- " + aluno.toString());
       }
   }
}