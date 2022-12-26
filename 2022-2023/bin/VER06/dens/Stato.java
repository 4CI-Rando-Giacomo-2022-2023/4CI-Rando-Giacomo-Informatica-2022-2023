
/**
 * Aggiungi qui una descrizione della classe dens
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Stato
{
    private String nome;
    private double superficie;
    private double popolazione;
    public Stato(){
        nome = "anonimo";
        superficie=0.0;
        popolazione=0.0;
    }
    public Stato(String nome,double superficie,double popolazione){
        if(nome!=null){
            this.nome=nome;
        }else{
            this.nome="anonimo";
        }
        if(superficie>0){
            this.superficie=superficie;
        }else{
            this.superficie=0.0;
        }
        if(popolazione>0){
            this.popolazione=popolazione;
        }else{
            this.popolazione=0.0;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public double getSuperficie(){
        return this.superficie;
    }
    public double getPopolazione(){
        return this.popolazione;
    }
    public void setNome(){
        if(nome!=null){
            this.nome=nome;
        }
    }
    public void setSuperficie(){
        if(superficie>0){
            this.superficie=superficie;
        }
    }
    public void setPopolazione(){
        if(popolazione>0){
            this.popolazione=popolazione;
        }
    }
    public String toString(){
        return "caratteristiche dello Stato{nome+ superficie+popolazione}";
    }
    public double densita(){
        return((this.getPopolazione()*1000000)/this.getSuperficie());
    }
    public int confronta(Stato s){
        if (densita()<s.densita()){
            return -1;
        }else if(densita()==s.densita()){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean confronta(double a,double b){
        if (this.densita()>a && this.densita()<b){
            return true;
        }else{
            return false;
        }
    }
    public Stato piuEsteso(Stato s){
        if (this.superficie>s.getSuperficie()){
            return this;
        }else{
            return s;
        }
    }
}
