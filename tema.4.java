 public class tema4 {
    public static void main(String args[]) {
      //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

      int numeroIf = 0;

      if ( numeroIf < 0){
          System.out.println("numeroif es menor a 0");
      } else if ( numeroIf > 0){
          System.out.println("numeroif es mayor a 0");
      } else {
          System.out.println("numeroif es igual a 0");
      }

      System.out.println("---------------------------------------------");

      //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
      //bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }

        System.out.println("---------------------------------------------");

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        do {
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
        }
        while (numeroWhile < 3);

        System.out.println("---------------------------------------------");

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
        //se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for ( int numeroFor = 0 ; numeroFor < 3 ; numeroFor++ ) {
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }

        System.out.println("---------------------------------------------");

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la
        //variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para
        //cuando el valor de la variable no sea una estación.

        String estacion = "verano";

        switch(estacion) {
            case "primavera":
                System.out.println("Ud está en la estación del año: primavera");
                break;
            case "verano":
                System.out.println("Ud está en la estación del año: verano");
                break;
            case "otoño":
                System.out.println("Ud está en la estación del año: otoño");
                break;
            case "invierno":
                System.out.println("Ud está en la estación del año: invierno");
                break;
            default:
                System.out.println("debe expecificar una estación del año");
                break;
        }

    }
}
