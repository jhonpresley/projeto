
import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.print;
import static sun.misc.Version.print;
import static sun.misc.Version.print;


/**
 *
 * @author Hudson
 */
public class ProgramaEntretenimento {
    
    Scanner scan = new Scanner(System.in);

  
    
   //Atributos
    String nome, categoria, personagensPrincipais, faixaEtaria, duracao;
    double notaClassificacao;
    
       public ProgramaEntretenimento(String nome, String categoria, String personagensPrincipais, String faixaEtaria, String duracao, double notaClassificacao) {
       
        System.out.println("Digite o nome:");
        this.nome = scan.nextLine();
        
        System.out.println("Digite o categoria:");
        this.categoria =  scan.nextLine();
        
        System.out.println("Digite o nome dos personagensPrincipais:");
        this.personagensPrincipais = scan.nextLine();
        
        System.out.println("Digite o faixaEtaria:");
        this.faixaEtaria = scan.nextLine();
        
        System.out.println("Digite o duracao:");
        this.duracao = scan.nextLine();
        
        System.out.println("Digite o notaClassificacao:");
        this.notaClassificacao = scan.nextDouble();
    }
    
/*
   public ProgramaEntretenimento(String nome, String categoria, String personagensPrincipais, String faixaEtaria, String duracao, double notaClassificacao) {
       
       
        this.nome = nome;
        this.categoria = categoria;
        this.personagensPrincipais = personagensPrincipais;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        this.notaClassificacao = notaClassificacao;
    }
*/
   
       /*
    public void Perguntas() {
        
        System.out.println("Digite o nome:");
        String nome = scan.nextLine();
        
           System.out.println("Digite o nome:");
        String categoria = scan.nextLine();
        
           System.out.println("Digite o nome:");
        String personagensPrincipais = scan.nextLine();
        
           System.out.println("Digite o nome:");
        String faixaEtaria = scan.nextLine();
        
           System.out.println("Digite o nome:");
        String duracao = scan.nextLine();
        
           System.out.println("Digite o nome:");
        double notaClassificacao = scan.nextDouble();
        
       System.out.println(toString());
    
     
    }
 
     */
    @Override
    public String toString() {
        
        return "\nPrograma Entretenimento: " + 
                "\n\nNome = " + nome + 
                "\nCategoria = " + categoria + 
                "\nPersonagens principais = " + personagensPrincipais + 
                "\nFaixaEtaria = " + faixaEtaria + 
                "\nDuracao = " + duracao + 
                "\nNota de classificacao = " + notaClassificacao ;
    }

    public void classificarPrograma(){
    
    if(notaClassificacao<=4){
        
        System.out.println("\nEste conteudo foi categorizado como: RUIM");
    
    }else if(notaClassificacao>4 && notaClassificacao<8){
            
        System.out.println("\nEste conteudo foi categorizado como: BOM");
   
   }else{
        System.out.println("\nEste conteudo foi categorizado como: OTIMO");
    }

}
    
   
    

    
    



}