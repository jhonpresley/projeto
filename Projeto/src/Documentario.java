/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hudson
 */
public class Documentario extends ProgramaEntretenimento {
        private String narrador;

    public Documentario(String nome, String categoria, String personagensPrincipais, String faixaEtaria, String duracao, double notaClassificacao, String narrador) {
        super(nome, categoria, personagensPrincipais, faixaEtaria, duracao, notaClassificacao);
        
        System.out.println("Digite o nome do Narrador: ");
        this.narrador =  scan.nextLine();
    }

    @Override
    public String toString() {
        return "\nDocumentario: " + 
                "\n\nNome = " + nome + 
                "\nCategoria = " + categoria + 
                "\nPersonagens principais = " + personagensPrincipais + 
                "\nFaixaEtaria = " + faixaEtaria + 
                "\nDuracao = " + duracao + 
                "\nNota de classificacao = " + notaClassificacao +
                "\nNarrador=" + narrador ;
    }
        
}
