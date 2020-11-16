package armalotumismo;

import Elementos.Elemento;

public class SortClass {
    public SortClass() {
    }
    private void swapElements(Elemento[] a, int i, int j) {
        Elemento temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void moveDown(Elemento[] array, int parent, int size) {
        boolean flag = false;
        Elemento largest = null;
        int child = 2*parent+1;
        Elemento temp = array[parent];
        while(child < size  && !flag) {
            int a;
            largest = array[child];
            float chil1 = Float.parseFloat(array[child+1].getPrecio());
            float chil2 = Float.parseFloat(array[child].getPrecio());
            if( child+1 < size && chil1 > chil2) {
                largest = array[++child];
            }
            float larg = Float.parseFloat(largest.getPrecio());
            float tem = Float.parseFloat(temp.getPrecio());
            if(larg > tem) {
                array[parent] = largest;
                parent = child;
            }
            else
                flag = true;
            child = 2*parent+1;
        }
        array[parent] = temp;
    }

    private void makeHeap(Elemento array[], int n) {
        for (int j = (n/2-1); j>=0; j--){
            moveDown(array, j, n);
        }
    }

    public void heapSort(Elemento array[], int n) {
        makeHeap(array,n);
        int y = n-1;
        for (int h = y; h > 0; h--) {
            swapElements(array,0,h);
            moveDown(array,0,h);
        }
    }


}
