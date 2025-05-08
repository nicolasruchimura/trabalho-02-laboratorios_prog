package swing.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BibliotecaManager {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;

    private static BibliotecaManager instancia;

    private BibliotecaManager() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
        emprestimos = new ArrayList<>();

        carregarDadosTeste();
    }
    public static BibliotecaManager getInstancia() {
        if(instancia == null) {
            instancia = new BibliotecaManager();
        }
        return instancia;
    }

}
