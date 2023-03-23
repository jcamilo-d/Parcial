package Clases;

import javax.swing.*;

public class llamadas {

    private int duracion;
    private int costo;
    private int costoTotal;

    public llamadas() {
    }

    public llamadas(int duracion, int costo, int costoTotal) {
        this.duracion = duracion;
        this.costo = costo;
        this.costoTotal = costoTotal;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "llamadas{" +
                "duracion=" + duracion +
                ", costo=" + "$" + costo +
                ", costo Total=" + "$" + costoTotal +
                '}';
    }

    public void addLlamadas(){
        int op=0;
        op=Integer.parseInt(JOptionPane.showInputDialog(
                "1.Llamada Local"+"\n"
                +"2.Llamada Larga Distancia"+"\n"
                +"3.Llamada Celular"+"\n"
                +"\n"+"Seleccione la opcion del tipo de llamada"));

        if (op == 1) {
            setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
            setCosto(60);
            setCostoTotal(getCosto()*getDuracion());
        } else if (op == 2) {
            setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
            setCosto(1200);
            setCostoTotal(getCosto()*getDuracion());
        } else if (op == 3) {
            setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
            setCosto(850);
            setCostoTotal(getCosto()*getDuracion());
        }
    }

}
