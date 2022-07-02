
package paquete02;


public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String np, double vim) {
        nombrePlato = np;
        valorInicialMenu = vim;
    }
    
    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public abstract void establecerValorMenu();

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public void establecerValorInicialMenu(double n) {
        valorInicialMenu = n;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plato: %s\n"
                + "Valor Inicial del menu: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicialMenu());
        return cadena;
    }
   
    
}
