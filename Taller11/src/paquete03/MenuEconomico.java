
package paquete03;
import paquete02.Menu;
public class MenuEconomico extends Menu{
    double pDescuento;

    public MenuEconomico(String np, double vm, double vim, double pd) {
        super(np, vim);
        pDescuento = pd;
    }
    
    
    public void establecerPorcentajeDescuento(double n) {
        pDescuento = n/100;
    }

    public double obtenerPorcentajeDescuento() {
        return pDescuento;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (pDescuento * valorInicialMenu);
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "Porcentaje Descuento: %.2f\n"
                + "Valor del Menu:%.2f\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}
