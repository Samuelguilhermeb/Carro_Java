public class CarroTestar {

    public static void main(String[] args){

        Carro c1 = new Carro();

        c1.nome = "Fox";
        c1.marca = "Volkswagen";
        c1.ano = 2022;
        c1.vel = 55;

        c1.acelerar(40);

        System.out.println("Velocidade: " + c1.vel + "km/h");

        c1.freiar(35);

        System.out.println("Velocidade: " + c1.vel + "km/h");

        System.out.println("bibibi");

    }
 }