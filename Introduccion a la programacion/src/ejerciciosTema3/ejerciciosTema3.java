package ejerciciosTema3;

public class ejerciciosTema3 {
    public static void main(String[] args) {
        //Primera parte
        int resultado = 0;
        resultado = suma(4, 22, 10);
        System.out.println(resultado);

        //Segunda parte
        Coche coche = new Coche();
        coche.cantidadPuertas = 4;
        System.out.println(coche.cantidadPuertas);

    }

    //Primera parte
    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}

//Segunda parte
class Coche{
    public int cantidadPuertas = 0;

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}


