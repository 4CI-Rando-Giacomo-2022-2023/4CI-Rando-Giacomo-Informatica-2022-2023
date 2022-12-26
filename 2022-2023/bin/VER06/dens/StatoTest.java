public class StatoTest {
    public static void main(String[] args) {
        int rest;
        String nome;
        Stato stato1 = new Stato("Polonia", 20000.0, 50.0);
        Stato stato2 = new Stato("Italia", 10000.0, 63.0); 
        if (stato1.confronta(10.0, 10000.0)) {
            System.out.println("stato1 ha una densita di popolazione compresa tra 10.0 abitanti/km2 e 10000.0 abitanti/km2");
        } else {
            System.out.println("stato1 NON ha una densita di popolazione compresa tra 10.0 abitanti/km2 e 10000.0 abitanti/km2");
        }
        if (stato2.confronta(1000.0, 2000.0)) {
            System.out.println("stato2 ha una densita di popolazione compresa tra 1000.0 abitanti/km2 e 2000.0 abitanti/km2");
        } else {
            System.out.println("stato2 NON ha una densita di popolazione compresa tra 1000.0 abitanti/km2 e 2000.0 abitanti/km2");
        }
            rest = stato1.confronta(stato2);
            if (rest == -1) {
                 System.out.println ("lo stato1 ha una densita di popolazione minore di stato2");
             } else if (rest == 0) {
                           System.out.println ("i due stati hanno uguale densita di popolazione");
                       } else {
                           System.out.println ("lo stato1 ha un densita di popolazione maggiore di stato2");
                       }
             }
            System.out.println(Stato1.piuEsteso(stato2));
   }


