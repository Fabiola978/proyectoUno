public class Main {
    public static void main(String[] args) {

        suma(50, 80, 20);
       Coche miCoche = new Coche();
       miCoche.sumarPuertas();
       miCoche.sumarPuertas();
       System.out.println("El numero de puerta es: " + miCoche.numeroDePuertas);

    }


    public static  void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche{
    public int numeroDePuertas = 4;
    public void sumarPuertas(){
        this.numeroDePuertas++;
    }
}