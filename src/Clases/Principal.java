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


        do {
            llamadas llam = new llamadas();
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. Linea 1" + "\n"
                    + "2. Linea 2" + "\n"
                    + "3. Linea 3" + "\n"
                    + "4. informacion Linea 1"+"\n"
                    + "5. informacion Linea 2"+"\n"
                    + "6. informacion Linea 3"+"\n"
                    + "7. Total Llamadas"+"\n"
                    + "8. Reiniciar el uso las líneas telefónicas"+"\n"
                    + "9. Salir"+"\n"

                    + "\n" + "Seleccione la opcion que desea"));

            switch (opc) {

                case 1:
                    llam.addLlamadas();
                    listllamadas.add(llam);
                    listLinea1.add(llam);
                    break;
                case 2:
                    llam.addLlamadas();
                    listllamadas.add(llam);
                    listLinea2.add(llam);
                    break;
                case 3:
                    llam.addLlamadas();
                    listllamadas.add(llam);
                    listLinea3.add(llam);
                    break;
                case 4:
                    String lin1 = "";
                    int v=0;
                    int m=0;
                    for (int i = 0; i < listLinea1.size(); i++) {
                        lin1 += "-Llamada: " + (i+1)+"\n";
                        lin1 += "Duracion: " + listLinea1.get(i).getDuracion() + " - ";
                        lin1 += "Costo por Minuto: $" + listLinea1.get(i).getCosto() + " - ";
                        lin1 +="Costo total: $" + listLinea1.get(i).getCostoTotal()+"\n";
                        v=v+listLinea1.get(i).getCostoTotal();
                        m=m+listLinea1.get(i).getDuracion();
                    }
                    JOptionPane.showMessageDialog(null,"-LLAMADAS: "+listLinea1.size()
                            +" -Valor Total:  $"+ v + " -Minutos Consumidos:  " + m +"min"+"\n"+
                            "\n"+lin1,"Linea 1",JOptionPane.PLAIN_MESSAGE);

                    break;
                case 5:
                    String lin2 = "";
                    int v2=0;
                    int m2=0;
                    for (int i = 0; i < listLinea2.size(); i++) {
                        lin2 += "-Llamada " + (i+1)+"\n";
                        lin2 += "Duracion: " + listLinea2.get(i).getDuracion() + " - ";
                        lin2 += "Costo por Minuto: $" + listLinea2.get(i).getCosto() + " - ";
                        lin2 +="Costo total: $" + listLinea2.get(i).getCostoTotal()+"\n";
                        v2=v2+listLinea2.get(i).getCostoTotal();
                        m2=m2+listLinea2.get(i).getDuracion();
                    }
                    JOptionPane.showMessageDialog(null,"-LLAMADAS: "+listLinea2.size()
                            +" -Valor Total:  $"+ v2 + " -Minutos Consumidos:  " + m2 +"min"+"\n"+
                            "\n"+lin2,"Linea 2",JOptionPane.PLAIN_MESSAGE);

                    break;
                case 6:
                    String lin3 = "";
                    int v3=0;
                    int m3=0;
                    for (int i = 0; i < listLinea3.size(); i++) {
                        lin3 += "-Llamada " + (i+1)+"\n";
                        lin3 += "Duracion: " + listLinea3.get(i).getDuracion() + " - ";
                        lin3 += "Costo por Minuto: $" + listLinea3.get(i).getCosto() + " - ";
                        lin3 +="Costo total: $" + listLinea3.get(i).getCostoTotal()+"\n";
                        v3=v3+listLinea3.get(i).getCostoTotal();
                        m3=m3+listLinea3.get(i).getDuracion();
                    }
                    JOptionPane.showMessageDialog(null,"-LLAMADAS: "+listLinea3.size()
                            +" -Valor Total:  $"+ v3 + " -Minutos Consumidos:  " + m3 +"min"+"\n"+
                            "\n"+lin3,"Linea 3",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 7:
                    String total = "";
                    int vt=0;
                    int mt=0;
                    for (int i = 0; i < listllamadas.size(); i++) {
                        total += "-Llamada " + (i+1)+"\n";
                        total+= "Duracion: " + listllamadas.get(i).getDuracion() + " - ";
                        total+= "Costo por Minuto: $" + listllamadas.get(i).getCosto() + " - ";
                        total+="Costo total: $" + listllamadas.get(i).getCostoTotal()+"\n";
                        vt=vt+listllamadas.get(i).getCostoTotal();
                        mt=mt+listllamadas.get(i).getDuracion();
                    }
                    JOptionPane.showMessageDialog(null,"-LLAMADAS: "+listllamadas.size()
                            +" -Valor Total:  $"+ vt + " -Minutos Consumidos:  " + mt +"min"+"\n"+
                            "\n"+total,"Informacion Total",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 8:
                    listLinea1.clear();
                    listLinea2.clear();
                    listLinea3.clear();
                    listllamadas.clear();
                    JOptionPane.showMessageDialog(null,"Se Reiniciaron las Lineas Telefonicas","AVISO",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Hasta Pronto");
                break;
                default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
            }
        } while (opc != 9);
    }
}
