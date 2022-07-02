
package paquete03;
import paquete02.Menu;

public class MenuDia extends Menu{
    private double vPostre;
    private double vBebida;

    public MenuDia(String np, double vim, double vp, double vb) {
        super(np, vim);
        vPostre = vp;
        vBebida = vb;
    }

   public void establecerValorPostre(double n) {
        vPostre = n;
    }

    public void establecerValorBebida(double n) {
        vBebida = n;
    }

    public double obtenerValorPostre() {
        return vPostre;
    }

    public double obtenerValorBebida() {
        return vBebida;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + vPostre + obtenerValorBebida();
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor Bebida: %.2f\n"
                +"Valor Postre: %.2f\n"
                + "Valor del Menu: %.2f\n", cadena,
                obtenerValorBebida(),
                obtenerValorPostre(),
                obtenerValorMenu());
        return cadena;
    }
}
