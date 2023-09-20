public class FilaDeImpressao {
    // Variável estática que conterá a única instância da classe
    private static FilaDeImpressao instancia;

    // Construtor privado para evitar a criação de instâncias diretas
    private FilaDeImpressao() {
        // Inicialize a fila de impressão aqui
    }

    // Método para obter a instância única da classe
    public static FilaDeImpressao getInstancia() {
        if (instancia == null) {
            instancia = new FilaDeImpressao();
        }
        return instancia;
    }

    public void ImprimeDocumento() {
        // Implementação para imprimir um documento
    }

    public void RemoveDocumento() {
        // Implementação para remover um documento da fila
    }

    public void RemoveTodosDocumentos() {
        // Implementação para remover todos os documentos da fila
    }
}
