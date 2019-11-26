/**
 *
 * @author Hudson
 */
public class Filme extends ProgramaEntretenimento {
    
    private String produtora, patrocinadores;

    public Filme(String nome, String categoria, String personagensPrincipais, String faixaEtaria, String duracao, double notaClassificacao, String produtora, String patrocinadores) {
        super(nome, categoria, personagensPrincipais, faixaEtaria, duracao, notaClassificacao);
        
        System.out.println("Digite o nome da produtora:");
        this.produtora = scan.nextLine();
        
        System.out.println("Digite o nome do patrocinador:");
        this.patrocinadores = scan.nextLine();
    }

    

     @Override
    public String toString() {
        return "\nFilme: " + 
                "\n\nNome = " + nome + 
                "\nCategoria = " + categoria + 
                "\nPersonagens principais = " + personagensPrincipais + 
                "\nFaixaEtaria = " + faixaEtaria + 
                "\nDuracao = " + duracao + 
                "\nNota de classificacao = " + notaClassificacao +
                "\nProdutora = " + produtora + 
                "\nPatrocinadores = " + patrocinadores;
    }
    
    
}
