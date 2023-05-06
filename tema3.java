public class tema3 {
    public static void main(String args[]) {

      //suma de 3 numeros

        int num1 = 25;
        int num2 = 15;
        int num3 = 10;

        int resultado = suma(num1, num2, num3);
        System.out.println("La suma es: " + resultado);

        //Objeto coche

        coche micoche = new coche("Toyata", "Yaris", 3);
        micoche.sumarPuertas();
        micoche.sumarPuertas();
        System.out.println("Mi coche tiene " + micoche.puertas);

    }

    public static int suma(int n1, int n2, int n3)
    {
    int sumatoria = n1 + n2 + n3;
    return sumatoria;
    }

    public static class coche
    {
        private String marca;
        private String modelo;
        private int puertas;

        public coche(String p_marca, String p_modelo, int p_puertas)
        {
            marca = p_marca;
            modelo = p_modelo;
            puertas = p_puertas;
        }

        public void sumarPuertas() {
            this.puertas ++;
        }
    }
}
