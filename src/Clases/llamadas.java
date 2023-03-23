package Clases;

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
}
