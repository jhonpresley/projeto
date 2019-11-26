/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hudson
 */
public class Serie extends ProgramaEntretenimento {
    
    
    
    private int numtemporadas, qntTemporada, qntEpisodioPorTemporada;

       
    public Serie(int numtemporadas, int qntTemporada, String nome, String categoria, String personagensPrincipais, String faixaEtaria, String duracao, double notaClassificacao) {
        super(nome, categoria, personagensPrincipais, faixaEtaria, duracao, notaClassificacao);
        
    
        System.out.println("Digite a quantidade de temporadas:");
        this.numtemporadas = scan.nextInt();
        
        System.out.println("Digite a quantidade de episodios:");
        this.qntTemporada = scan.nextInt();;
        
        this.qntEpisodioPorTemporada = qntEpisodioPorTemporada;
    }
    



        public void calculaTotalEpisodios(){
        qntEpisodioPorTemporada = (numtemporadas * qntTemporada) ;
        
            System.out.println("\nQuatidade de total de episodios é: " + qntEpisodioPorTemporada);
      
       
          
        
        }

    @Override
    public String toString() {
        return "\nSerie: " + 
                "\n\nNome = " + nome + 
                "\nCategoria = " + categoria + 
                "\nPersonagens principais = " + personagensPrincipais + 
                "\nFaixaEtaria = " + faixaEtaria + 
                "\nNota de classificacao = " + notaClassificacao +
                "\nNumero de temporadas = " + numtemporadas + 
                "\nQuatidade de episodios por temporadas = " + qntTemporada ;
  //              "\nQuatidade de total de episodios = " + qntEpisodioPorTemporada;
    }


        
        
    
    
    
    
}
    
 