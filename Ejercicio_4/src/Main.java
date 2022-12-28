public class Main {
    public static void main(String[] args) {
        int I = 0;
        if (I > 0)
            System.out.println("el nuero es positivo");
        if (I < 0)
            System.out.println("Elnumero es negativo");
        else {
            System.out.println("El numero es 0");
        }
        int contador = 0;
        while (contador <=3){
            System.out.println(contador);
            contador++;
        }

            int Interacion = 0;
        do {
            System.out.println(Interacion);
            Interacion++;
        }
        while (Interacion <= 3);


        for (int numeroFor = 1; numeroFor <=3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);

        }
        String estacion = "Luis";
        switch(estacion){
            case "Primavera":
            System.out.println("Es primavera");
            break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
            default:
                System.out.println("No has Seleccionado ninguna");
        }
    }
}