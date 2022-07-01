
package paquete03;
import paquete02.Menu;

public class MenuCarta extends Menu{
    private double vGuarnicion;
    private double vBebida;
    private double pAdicional;

    public MenuCarta(String np, double vm, double vim, double g, 
            double b, double pa) {
        super(np, vm, vim);
        vGuarnicion = g;
        vBebida = b;
        pAdicional = pa;
    }
    
    public void establecerValorGuarnicion(double n) {
        vGuarnicion = n;
    }

    public double obtenerValorGuarnicion() {
        return vGuarnicion;
    }

    public void establecerValorBebida(double n) {
        vBebida = n;
    }

    public double obtenerValorBebida() {
        return vBebida;
    }

    public void establecerPorcentajeAdicional(double n) {
        pAdicional = n/100;
    }

    public double obtenerPorcentajeAdicional() {
        return pAdicional;
    }
    @Override
    public void establecerValorMenu() {
        valorMenu = (obtenerValorInicialMenu() + obtenerValorGuarnicion() + 
                obtenerValorBebida()) + pAdicional * valorInicialMenu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor guarnición: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Porcentaje Adicional: %.2f\n"
                + "Valor del Menú: %.2f\n",
                cadena,
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }
    
}
