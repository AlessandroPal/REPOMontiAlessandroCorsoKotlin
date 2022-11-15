class EsercizioArray {
    public static void main(String[] args) {

        String[] persone = {"Pappagallo", "Balena", "Gatto", "Cane"};   //costruzione array e definizione valori interni
        System.out.println(persone[0]);    //stampa il riferimento nella posizione 0 dell array quindi in questo caso Pappagallo

        persone[0] = "Lucertola";  //modifico il contenuto del riferimento 0 dell'array quindi sostituisco Pappagallo con Lucertola
        System.out.println(persone[0]); //stampa riferimento 0 dell'array

        System.out.println(persone.length); //viene stampata la lunghezza dell array

    }
}
