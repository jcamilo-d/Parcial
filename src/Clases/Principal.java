package Clases;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        int valor_total;

        List<llamadas> listLinea1 = new ArrayList<>();
        List<llamadas> listLinea2 = new ArrayList<>();
        List<llamadas> listLinea3 = new ArrayList<>();
        List<llamadas> listllamadas = new ArrayList<>();
        llamadas llam1 = new llamadas();
        int opc = 0;
        int op = 0;
        int CostoT=0;

        do {
            llamadas llam = new llamadas();
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. Linea 1" + "\n"
                    + "2. Linea 2" + "\n"
                    + "3. Linea 3" + "\n"
                    + "4. informacion Linea 1"+"\n"
                    + "5. informacion Linea 2"+"\n"
                    + "6. informacion Linea 3"+"\n"
                    + "7. Salir"+"\n"

                    + "\n" + "Seleccione la opcion que desea"));

            switch (opc) {

                case 1:
                    op=Integer.parseInt(JOptionPane.showInputDialog("--------Linea 1--------"+"\n"+"\n"
                    +"1.Llamada Local"+"\n"
                    +"2.Llamada Larga Distancia"+"\n"
                    +"3.Llamada Celular"+"\n"
                    +"\n"+"Seleccione la opcion del tipo de llamada"));

                    if (op == 1) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(60);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea1.add(llam);
                    } else if (op == 2) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(1200);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea1.add(llam);
                    } else if (op == 3) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(850);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea1.add(llam);
                    }

                    break;
                case 2:
                    op=Integer.parseInt(JOptionPane.showInputDialog("--------Linea 2--------"+"\n"+"\n"
                            +"1.Llamada Local"+"\n"
                            +"2.Llamada Larga Distancia"+"\n"
                            +"3.Llamada Celular"+"\n"
                            +"\n"+"Seleccione la opcion del tipo de llamada"));

                    if (op == 1) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(60);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea2.add(llam);
                    } else if (op == 2) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(1200);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea2.add(llam);
                    } else if (op == 3) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(850);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea2.add(llam);
                    }
                    break;
                case 3:
                    op=Integer.parseInt(JOptionPane.showInputDialog("--------Linea 3--------"+"\n"+"\n"
                            +"1.Llamada Local"+"\n"
                            +"2.Llamada Larga Distancia"+"\n"
                            +"3.Llamada Celular"+"\n"
                            +"\n"+"Seleccione la opcion del tipo de llamada"));

                    if (op == 1) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(60);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea3.add(llam);
                    } else if (op == 2) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(1200);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea3.add(llam);
                    } else if (op == 3) {
                        llam.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la llamada (minutos)")));
                        llam.setCosto(850);
                        llam.setCostoTotal(llam.getCosto()*llam.getDuracion());
                        listllamadas.add(llam);
                        listLinea3.add(llam);
                    }
                    break;
                case 4:
                    String lin1 = "";
                    for (int i = 0; i < listLinea1.size(); i++) {
                        lin1 += "-Llamada: " + (i+1)+"\n";
                        lin1 += "Duracion: " + listLinea1.get(i).getDuracion() + " - ";
                        lin1 += "Costo por Minuto: $" + listLinea1.get(i).getCosto() + " - ";
                        lin1 +="Costo total: $" + listLinea1.get(i).getCostoTotal()+"\n";
                    }
                    JOptionPane.showMessageDialog(null,"LLAMADAS: "+listLinea1.size()+"\n"+lin1);

                    break;
                case 5:
                    String lin2 = "";
                    for (int i = 0; i < listLinea2.size(); i++) {
                        lin2 += "-Llamada " + (i+1)+"\n";
                        lin2 += "Duracion: " + listLinea2.get(i).getDuracion() + " - ";
                        lin2 += "Costo por Minuto: $" + listLinea2.get(i).getCosto() + " - ";
                        lin2 +="Costo total: $" + listLinea2.get(i).getCostoTotal();
                    }
                    JOptionPane.showMessageDialog(null,"LLAMADAS: "+listLinea2.size()+"\n"+lin2);

                    break;
                case 6:
                    String lin3 = "";
                    for (int i = 0; i < listLinea3.size(); i++) {
                        lin3 += "-Llamada " + (i+1)+"\n";
                        lin3 += "Duracion: " + listLinea3.get(i).getDuracion() + " - ";
                        lin3 += "Costo por Minuto: $" + listLinea3.get(i).getCosto() + " - ";
                        lin3 +="Costo total: $" + listLinea3.get(i).getCostoTotal();
                    }
                    JOptionPane.showMessageDialog(null,"LLAMADAS: "+listLinea3.size()+"\n"+lin3);

                    break;
                case 7: JOptionPane.showMessageDialog(null, "Hasta Pronto");
                break;
                default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
            }
        } while (opc != 7);
    }
}
