import java.util.*;
public class Prezzocalculator{
    Scanner in = new Scanner(System.in);
    private static final double COSTO_PER_KG=5.00;
    private static final double SOVRAPPREZZO=10.00;
    private Bagaglio bag;
    public Prezzocalculator(){
        bag=new Bagaglio();
    }
    public void start(){
        this.descriviAttività();
        this.prendiInput();
        this.calcolaPrezzo();
        this.visualizzaRisultati();
    }
    public double calcolaPrezzo(){
        double p = COSTO_PER_KG*bag.getWeight(); 
        return p;
    }
    public void descriviAttività(){
        System.out.println("");
    }
    public void prendiInput(){
        double input = in.nextDouble();
        bag.setWeight(input);
    }
    public void visualizzaRisultati(){
        System.out.println(bag.toString()+this.calcolaPrezzo());
    }
}
