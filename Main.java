
public class Main {
    public static void main(String[] args) throws Exception{
        Carro car = new Carro("Gol");
        System.out.println("O carro é um " + car.nomeCarro);

        car.setMarca("A marca é da Volkswagen");
        System.out.println(car.getMarca());

        car.setModelo("E o seu modelo é um Gol 1.0 Trendline");
        System.out.println(car.getModelo());
        
    }
}