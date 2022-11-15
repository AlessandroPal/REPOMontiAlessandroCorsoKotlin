import java.util.Scanner;
 
class MenuOperazioni {
 
   public static void main( String[] args ) {
      double x=11;
      double y=22;
      double z=12.5; 
      double Somma=0;
      
      
    
      Scanner s = new Scanner( System.in );
      do{
        System.out.println( "scegli un opzione: " );
        System.out.println( "Aggiungi: "  );
        System.out.println( "sottrai: "  );
        System.out.println( "stampa: "  );
        System.out.println( "esci: "  );
string Scelta1=s.nextLine();
System.out.println(Scelta1);
    }
    while(s.equals("esci")){




    }
        
    
 
}
}










import java.util.Scanner;
 
class MenuOperazioni {
 
   public static void main( String[] args ) {
      double x=11;
      double y=22;
      double z=12.5; 
      boolean Contr=true;

      Scanner s=new Scanner(System.in);
      Scanner opzione = new Scanner( System.in );

      
    
     do{ 
      
      System.out.println( "scegli una variabile tra x,y,z: " );
      String Scelta=s.nextLine();
      int Scelta=opzione.nextInt();
      if(Scelta==1){

     
        System.out.println( "x vale: "  );
        System.out.println(x);
        System.out.println( "y vale: "  );
        System.out.println( y );
        System.out.println( "z vale: "  );
        System.out.println( z );
      }
      else if(Scelta==2)
      {
        System.out.println( "prendi un elemento tra x,y,z?: "  );
      int Scelta1=Scelta.nextInt();
      double Var=0;
      System.out.println(Scelta1);
      while(Scelta1!=1) && (Scelta1!=2) && (Scelta!=3);
      {
        System.out.println( "prendi un elemento tra x,y,z?: "  );
        Scelta1=
        
      }
        


    }
        
    
 
}
}








