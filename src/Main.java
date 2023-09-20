// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Obtém a instância única da fila de impressão
        FilaDeImpressao filaDeImpressao = FilaDeImpressao.getInstancia();

        // Usa os métodos da fila de impressão
        filaDeImpressao.ImprimeDocumento();
        filaDeImpressao.ImprimeDocumento();
        filaDeImpressao.RemoveDocumento();
        filaDeImpressao.RemoveTodosDocumentos();
    }
}
