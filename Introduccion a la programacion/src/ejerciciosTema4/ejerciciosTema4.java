package ejerciciosTema4;

public class ejerciciosTema4 {
    public static void main(String[] args) {
        //Primera parte(if)
        int numeroIf = 11;

        if(numeroIf < 0){
            System.out.println("Es un número negativo");
        } if (numeroIf > 0){
            System.out.println("Es un número positivo");
        } else{
            System.out.println("Es el número 0");
        }

        //Segunda parte(while)
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Tercera parte(doWhile)
        numeroWhile = 3;

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Cuarta parte(for)
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Quinta parte(switch)
        String estacion = "Verano";

        switch(estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
