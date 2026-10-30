public class CuentaFidelidad {
    private int numeroSocio;
    private String nivelMembresia;
    private int puntosAcumulados;

    public CuentaFidelidad(int numeroSocio, String nivelMembresia) {
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntosAcumulados = 0;
    }

    public void acumularPuntos(double montoCompra){
        if(montoCompra > 0){
            int puntos = (int)(montoCompra / 100);

            puntosAcumulados += puntos;
            System.out.println("Puntos acumulado: " + puntosAcumulados + " puntos.");
        }else{
            System.out.println("Monto de compra es invalido.");
        }
    }

    public boolean canjearPremio(int puntosRequeridos){
        if(puntosRequeridos > 0 && puntosAcumulados >= puntosRequeridos){
            puntosAcumulados -= puntosRequeridos;

            System.out.println("Premios canjeados correctamente.");
            return true;
        }else{
            System.out.println("Puntos requeridos insuficiente.");
            return false;
        }
    }

    public void mostrarEstado(){
        System.out.println("Numero de socio: " + numeroSocio);
        System.out.println("Nivel membresia: " + nivelMembresia);
        System.out.println("Puntos acumulados: " + puntosAcumulados);
    }
}
