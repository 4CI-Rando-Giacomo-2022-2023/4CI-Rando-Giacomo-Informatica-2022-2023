import java.util.*;
public class FrigoriferoTest{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Frigorifero frigo = new Frigorifero("mixer", "aros", 850.0);
        System.out.print("\n"+frigo.toString());
        frigo.accendi();
        System.out.print("\n" + frigo.toString());
        frigo.spegni();
        System.out.print("\n" + frigo.toString());
        frigo.setMarca("mixer");
        System.out.print("\n" + frigo.getMarca());
        frigo.setModello("aros");
        System.out.print("\n" + frigo.getModello());
        frigo.setlitriFrigo(60);
        System.out.print("\n" + frigo.getlitriFrigo());
        frigo.setlitriFrigo(13);
        System.out.print("\n" + frigo.getlitriFrigo());
        frigo.setPrezzo(850.0);
        System.out.print("\n" + frigo.getPrezzo());
        frigo.setconsumokwat(2);
        System.out.print("\n" + frigo.getconsumokwat());
        frigo.settemperaturaFrigo(2);
        System.out.print("\n" + frigo.gettemperaturaFrigo());
    }
}
