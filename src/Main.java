public class Main {
    public static void main(String[] args) {
        CuentaFidelidad cuenta = new CuentaFidelidad(1234,"oro");

        cuenta.acumularPuntos(5200);
        cuenta.acumularPuntos(2200);

        cuenta.canjearPremio(50);
        cuenta.canjearPremio(180);

        System.out.println("--- Información ---");
        cuenta.mostrarEstado();
    }
}