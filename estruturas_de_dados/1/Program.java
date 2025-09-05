    import java.util.Locale;

    public class Program {
        public static void main(String[] args) {
            Locale.setDefault(new Locale("pt", "BR"));

            GestaoAlunos gestao = new GestaoAlunos();

            // Adicionará três alunos.
            gestao.adicionarAluno(new Aluno("Alice", 20));
            gestao.adicionarAluno(new Aluno("Bob", 22));
            gestao.adicionarAluno(new Aluno("Charlie", 21));

            // Exibirá a lista de alunos.
            gestao.listarAlunos();

            // Buscará por um aluno.
            gestao.buscarAluno("Alice");

            // Excluirá um aluno.
            gestao.excluirAluno("Bob");

            // Tentará excluir um aluno inexistente e buscará outro aluno.
            gestao.excluirAluno("David");
        }
    }