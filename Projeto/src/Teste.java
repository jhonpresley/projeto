import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hudson
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
	String nome;
	int i = 0;
        
        Scanner op = new Scanner(System.in);
	
	
	do{
	System.out.println("Digite uma opcao:");
	System.out.println("\n1 - Serie");
	System.out.println("2 - Filme");
	System.out.println("3 - Documnetario");
	System.out.println("\nOu digite 0 para abortar...");
	opcao = op.nextInt();
	
        
	switch(opcao){
	
           
	case 0:			
		System.out.println("Ok, ate mais idiota ...");
		break;
		
	case 1:
            int resultado;
		
	System.out.println("Digite uma opcao:");
	System.out.println("\n1 - Cadastrar");
	System.out.println("2 - BUSCAR");
	System.out.println("3 - eXIBIR");
	System.out.println("\nOu digite 0 para abortar...");
	resultado = op.nextInt();
        
        if(resultado == 1){
        
            
         Filme f = new Filme("","","","","",0,"","");
 
        
        }else if(resultado == 2){
        
         System.out.println(f);
            
        }else{
                
       
                }
	
        

        
     	
        break;
                
         
	
	}}while(opcao != 0);
	
	System.out.println("Programa encerrado.");
        
    

   
}
}
        
        /*
          Filme f = new Filme("","","","","",0,"","");
          Filme f1 = new Filme("","","","","",0,"","");
	  Serie s = new Serie(0,0 , "", "", "", "", "", 0);
          Serie s2 = new Serie(0,0 , "", "", "", "", "", 0);
          Documentario d = new Documentario("","","","","",0,"");
          Documentario d2 = new Documentario("","","","","",0,"");
          
          System.out.println(f);
          System.out.println(f1);
          System.out.println(s);
          System.out.println(s2);
          System.out.println(d);
          System.out.println(d2);
        
  */    
       
        
 
      
        
     
    
        
        
  