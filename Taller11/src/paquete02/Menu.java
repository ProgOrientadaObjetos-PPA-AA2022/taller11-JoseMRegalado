
package paquete02;


public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String np, double vm, double vim) {
        nombrePlato = np;
        valorMenu = vm;
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
   
    
}
