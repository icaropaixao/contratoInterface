public class Cachorro extends Mamifero implements Estimacao, Domestico{

    // atributos privados
    private String raca;
    private String porte;

    // construtor
    public Cachorro(String raca, String porte){
        this.raca = raca;
        this.porte = porte;
    }

    // métodos abstratos
    @Override
    public void amamentar() {}

    @Override
    public void locomover() {}

    @Override
    public void respirar() {}

    @Override
    public void alimentar() {}

    @Override
    public void brincar(){}

    @Override
    public void passear(){}

    @Override
    public void cuidar(){}

    // geet setters
    public String getRaca() {return raca;}
    public void setRaca(String raca) {this.raca = raca;}

    public String getPorte() {return porte;}
    public void setPorte(String porte) {this.porte= porte;}


}
