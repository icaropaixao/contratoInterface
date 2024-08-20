public class Gato  extends Mamifero implements Estimacao{

    private String raca;

    // construtor
    public Gato(String raca) {this.raca = raca;}

    @Override
    public void amamentar() {}

    @Override
    public void locomover() {}

    @Override
    public void respirar() {}

    @Override
    public void alimentar() {}

    @Override
    public void brincar() {}

    @Override
    public void passear() {}

    //geet setter
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
