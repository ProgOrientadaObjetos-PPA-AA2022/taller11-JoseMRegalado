
package paquete03;
import paquete02.Menu;
public class MenuNiños extends Menu{
    private double pHelado;
    private double pPastel;

    public MenuNiños(String np, double vm, double vim, double ph, double pp) {
        super(np, vm, vim);
        pHelado = ph;
        pPastel = pp;
    }
    
    public void establecerPorcionHelado(double n) {
        pHelado = n;
    }

    public double obtenerPorcionHelado() {
        return pHelado;
    }

    public void establecerPorcionPastel(double n) {
        pPastel = n;
    }

    public double obtenerPorcionPastel() {
        return pPastel;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + pHelado + pPastel;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de Ninos\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor del Menu:%.2f\n", cadena,
                obtenerPorcionHelado(),
                obtenerPorcionPastel(),
                obtenerValorMenu());
        return cadena;
    }
    
    
    
}
