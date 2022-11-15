import java.util.Scanner;

class MenuCicli {
    public static void main(String[] args) {

        //DICHIARAZIONI E VALORIZZAZIONI DELLE VARIABILI
        double X = 11;
        double Y = 22;
        double Z = 12.5;
        boolean Uscita = false;
        boolean SecondoLoop = false;

        //CREAZIONE DEL MENU'
        do{

            Scanner Opzione = new Scanner(System.in);    //creazione di uno scanner per la scelta  dell'utente
            System.out.println("Opzioni: aggiungi, sottrai, stampa o esci");

            String Scelta = Opzione.nextLine();

            if( !(Scelta.equals("aggiungi")) && !(Scelta.equals("sottrai")) && !(Scelta.equals("stampa")) && !(Scelta.equals("esci")) ){    
                System.out.println("opzione errata ");
            }

            if(Scelta.equals("aggiungi")){  

                Scanner Opzione2 = new Scanner(System.in);  //creo uno scanner per far scegliere all'utente la variabile su cui operare
                System.out.println("scegli una variabile a cui aggiungere tra X, Y o Z");

                while(SecondoLoop != true){    //loop con cui richiedo la seconda scelta fiche' l'utente non ne da una disponibile

                    String Scelta2 = Opzione2.nextLine();

                    if(Scelta2.equals("X")){
                        Scanner Numero = new Scanner(System.in);    //creo uno scanner per far scegliere all'utente quanto aggiungere
                        System.out.println("Aggiungi Numero a x:");
                        double NumeroAggiunto = Numero.nextInt();
                        X = X + NumeroAggiunto;
                        System.out.print("Il risultato e': ");
                        System.out.println(X);
                        SecondoLoop = true;
                    } else if(Scelta2.equals("Y")){
                        Scanner Numero = new Scanner(System.in);    //creo uno scanner per far scegliere all'utente quanto aggiungere
                        System.out.println("aggiungi numero a y:");
                        double NumeroAggiunto = Numero.nextInt();
                        Y = Y + NumeroAggiunto;
                        System.out.print("Il risultato e': ");
                        System.out.println(Y);
                        SecondoLoop = true;
                    } else if(Scelta2.equals("Z")){
                        Scanner Numero = new Scanner(System.in);    //creo uno scanner per far scegliere all'utente quanto aggiungere
                        System.out.println("aggiungi numero a z:");
                        double NumeroAggiunto = Numero.nextInt();
                        Z = Z + NumeroAggiunto;
                        System.out.print("Il risultato e': ");
                        System.out.println(Z);
                        SecondoLoop = true;
                    } 
                    else{
                        System.out.println("opzione errata ");
                        Opzione2.reset();
                    }
                }
                SecondoLoop = false;

            }   //esco dall opzione aggiungi
            else if(Scelta.equals("Sottrai")){  //entro nel caso sottrai

                Scanner Opzione2 = new Scanner(System.in);  //creo uno scanner 
                System.out.println("scegli una variabile a cui sottrarre tra X, Y o Z");

                while(SecondoLoop != true){    //secondo loop 

                    String Scelta2 = Opzione2.nextLine();

                    if(Scelta2.equals("X")){

                        Scanner Numero = new Scanner(System.in);
                        System.out.println("sottrai numero a x:");  //creo uno scanner per far scegliere all'utente quanto sottrarre
                        double NumeroSottratto = Numero.nextInt();
                        if(NumeroSottratto < X){
                            X = X - NumeroSottratto;
                            System.out.print("Il risultato e': ");
                            System.out.println(X);
                            SecondoLoop = true;
                        } else {
                            System.out.println("Errore");
                            SecondoLoop = true;
                        }
                    } 
                    else if(Scelta2.equals("Y")){

                        Scanner Numero = new Scanner(System.in);
                        System.out.println("sottrai numero a y:");  //creo uno scanner per far scegliere all'utente quanto sottrarre
                        double NumeroSottratto = Numero.nextInt();
                        if(NumeroSottratto < Y){
                            Y = Y - NumeroSottratto;
                            System.out.print("Il risultato e': ");
                            System.out.println(Y);
                            SecondoLoop = true;
                        } else {
                            System.out.println("Errore:");
                            SecondoLoop = true;
                        }
                    }
                    else if(Scelta2.equals("Z")){

                        Scanner Numero = new Scanner(System.in);
                        System.out.println("sottrai numero a z:");  //creo uno scanner per far scegliere all'utente quanto sottrarre
                        double NumeroSottratto = Numero.nextInt();
                        if(NumeroSottratto < Z){
                            Z = Z - NumeroSottratto;
                            System.out.print("Il risultato e': ");
                            System.out.println(Z);
                            SecondoLoop = true;
                        } else {
                            System.out.println("Errore:");
                            SecondoLoop = true;
                        }
                    }
                    else{
                        System.out.println("opzione errata:");
                        Opzione2.reset();
                    }
                }
                SecondoLoop = false;

            }   //esco dal caso SOTTRAI
            else if(Scelta.equals("Stampa")){   //Qui SI ENTRA NELL OPZIONE STAMPA

                Scanner Opzione2 = new Scanner(System.in); //creo uno scanner per far scegliere all'utente la variabile da usare

                System.out.println("Vuoi stampare una variabile a scelta o tutte?:");  
                while(SecondoLoop != true){    //loop con cui richiedo la seconda scelta fiche' l'utente non ne da una disponibile

                    String Scelta2 = Opzione2.nextLine();

                    if(Scelta2.equals("X")){
                        System.out.print("La variabile X e': ");
                        System.out.println(X);
                        SecondoLoop = true;
                    } 
                    else if(Scelta2.equals("Y")){
                        System.out.print("La variabile Y e': ");
                        System.out.println(Y);
                        SecondoLoop = true;
                    } 
                    else if(Scelta2.equals("Z")){
                        System.out.print("La variabile Z e': ");
                        System.out.println(Z);
                        SecondoLoop = true;
                    } 
                    else if(Scelta2.equals("TUTTE")){
                        System.out.print("La variabile X e': ");
                        System.out.println(X);
                        System.out.print("La variabile Y e': ");
                        System.out.println(Y);
                        System.out.print("La variabile Z e': ");
                        System.out.println(Z);
                        SecondoLoop = true;
                    }
                    else{
                        System.out.println("opzione errata ");
                        Opzione2.reset();
                    }
                }              
                SecondoLoop = false;

            }   //esco dal caso 'STAMPA' 
            else if(Scelta.equals("Esci")){    //opzione esci
                System.out.println("finito");
                Uscita = true;  //dato che siamo entrati nell opzione esci USCITA=true
            }   //esco dal caso 'ESCI' 

        } while(Uscita != true);    //fine loop

    }   
}  