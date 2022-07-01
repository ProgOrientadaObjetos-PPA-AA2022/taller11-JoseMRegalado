package paquete04;
import paquete02.Menu;
import java.util.ArrayList;
public class Cuenta {

    protected String nombreCliente;
    protected double subtotal;
    protected double iva;
    protected ArrayList<Menu> listaCartas;
    protected double valorCancelar;

    public Cuenta(String n, ArrayList<Menu> listam, double m) {
        nombreCliente = n;
        listaCartas = listam;
        iva = m;
    }

    public void establecerListaCartas(ArrayList<Menu> n) {
        listaCartas = n;
    }

    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public void establecerValorCancelar() {
        valorCancelar = subtotal + (subtotal * (iva / 100));
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < listaCartas.size(); i++) {
            suma = suma + listaCartas.get(i).obtenerValorMenu();
        }
        subtotal = suma;
    }

    public ArrayList<Menu> obtenerListaCartas() {
        return listaCartas;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
}
