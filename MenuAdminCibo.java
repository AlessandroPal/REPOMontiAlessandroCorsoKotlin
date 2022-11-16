import java.util.Scanner;
import java.util.ArrayList;

class MenuAdminCibo{
    public static void main(String[] args) {
// inserimento password e username -----------------------------------------------------------------
        boolean Controllo = false;  //booleano di controllo primo WHILE
        boolean Conferma = false;   //booleano di controllo secondo WHILE
        Scanner scan = new Scanner(System.in);
        boolean Uscita=false;
        
        String Username = "";
        String Password = "";

        while(Controllo == false){

            Conferma = false;
            System.out.print("Inserisci l'username: ");
            Username = scan.nextLine(); //chiedo all'utente l'username

            System.out.print("Inserisci la password: ");
            Password = scan.nextLine(); //chiedo all'utente la password

            if((Username.equals("")) || (Password.equals(""))){
                System.out.println("Mancata compilazione"); //controllo l utente non ha messo nulla
            }
            else{

                while(Conferma == false){

                    System.out.print("Sei sicuro dei dati? Digita [ok] o [no]: ");
                    String Sicuro = scan.nextLine();    //chiedo all'utente se e' sicuro dell'username e della password

                    if(Sicuro.equals("ok")){ //se sicuro esco da tutti e due i cicli
                        Conferma = true;
                        Controllo = true;
                    }
                    else if (Sicuro.equals("no")){   //se non e' sicuro torno all'inserimento di username e password
                        Conferma = true;
                    }
                    else {  //se sbagli rimane nel ciclo dell ok o no
                        System.out.println("Devi scegliere tra ok o no");
                    }

                }   

            }

        }

        boolean Controllo1 = false;

        ArrayList <String> Budget = new ArrayList<String>();   //creo array budget
        ArrayList <Integer> Budget2 = new ArrayList<Integer>();  //creo array budget2

        while(Controllo1 == false){  

            Scanner N = new Scanner(System.in);
            System.out.print("Aggiungi il tuo budget tramite un buono pasto da [50] , [100] o [150]: ");
            String Scelta = scan.nextLine();    //faccio scegliere tra una delle opzioni

            if(Scelta.equalsIgnoreCase("50")){    
                System.out.print("Il tuo budget ora è di 50 euro tondi tondi: ");
                Budget.add(scan.nextLine());   //inserisco 50 euro
            }   
            else if(Scelta.equalsIgnoreCase("100")){    
                System.out.print("Il tuo budget ora è di 100 euro tondi tondi; ");
                Budget2.add(N.nextInt());    //inserisco 100 euro
            }  
            else if(Scelta.equalsIgnoreCase("150")){    
                System.out.print("Il tuo budget ora è di 150 euro tondi tondi; ");
                Budget2.add(N.nextInt());    //inserisco 150 euro
            }  
        }
        

     
        } 
    }

    //array Menu   ------------------------------------------------------------------------------------------
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0,"Deliziosa pasta al kiwi, 50 euro");
    list.add(1,"Gustoso minestrone fuori contesto, 50 euro");
    list.add(2,"Mela totalmente normale, 150 euro");




    //menu opzioni        ------------------------------------------------------------------------------------
    Boolean Controllo=true;
    Scanner Scelta= new Scanner(System.in);
    Scanner Scelta2= new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    while(Controllo==true){
        System.out.println("Scegli tra: ");
        System.out.println("----------------------------------------------- ");
        System.out.println("Visualizza Lista CIbo, Carrello o Paga o Esci");
        String Opz=Scelta.nextLine();
        if(Opz.equals("Visualizza Lista CIbo")){

        }else if(Opz.equals("Carrello o Paga")){
    }else if(Opz.equals("Esci")){
        String Scelta3=Scelta2.nextLine();
        if(Scelta3.equals("Esci")){
            Controllo=false;
            System.out.println("Hai chiuso");
        }
    }
    }



