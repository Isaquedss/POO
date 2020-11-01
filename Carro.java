
public class Carro{
    private String marca;
    private String modelo;
    public  String nomeCarro;

    public Carro(String x){
        nomeCarro = x;
    }

    public void setMarca(String nomeMarca){
        this.marca = nomeMarca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String nomeModelo){
        this.modelo = nomeModelo;
    }

    public String getModelo(){
        return modelo;
    }


    
    
}