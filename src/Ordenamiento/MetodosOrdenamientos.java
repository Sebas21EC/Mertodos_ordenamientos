/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

/**
 *
 * @author Sebas Carlosama
 */
public class MetodosOrdenamientos {

    private int[] matriz_numeros;

    public long getIntercambios() {
        return intercambios;
    }

    public void setIntercambios(int intercambios) {
        this.intercambios = intercambios;
    }
    private long intercambios=0;

    public MetodosOrdenamientos(int[] matriz_numeros) {
        this.matriz_numeros = matriz_numeros;

    }

    public int[] getMatriz_numeros() {
        return matriz_numeros;
    }

    public void setMatriz_numeros(int[] matriz_numeros) {
        this.matriz_numeros = matriz_numeros;
    }

    public void OrdenamientoBurbuja() {

        int aux;
        for (int i = 0; i < matriz_numeros.length; i++) {
            for (int j = 0; j < matriz_numeros.length -i- 1; j++) {
                if (matriz_numeros[j] > matriz_numeros[j + 1]) {
                    aux = matriz_numeros[j];
                    matriz_numeros[j] = matriz_numeros[j + 1];
                    matriz_numeros[j + 1] = aux;
                    intercambios++;
                }
            }
        }

    }

    public void QuickSort(int i, int j) {
        int inicio = i;
        int fin = j;
        int pivote = matriz_numeros[i];

        do {

            while (matriz_numeros[i] < pivote) {
                i++;
            }

            while (matriz_numeros[j] > pivote) {
                j--;
            }

            if (i <= j) {
                int aux = matriz_numeros[i];
                matriz_numeros[i] = matriz_numeros[j];
                matriz_numeros[j] = aux;
                i++;
                j--;
                
                intercambios++;
            }

        } while (i <= j);
        if (inicio < j) {
            QuickSort(inicio, j);
        }
        if (i < fin) {
            QuickSort(i, fin);
        }

    }

}
