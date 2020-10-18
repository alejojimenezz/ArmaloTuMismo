package armalotumismo;

public class LinkedList {
    Nodo head, tail;
    int size;

    public LinkedList(){
        head = tail;
        tail = null;
        size = 0;
    }

    public Object get(int index){
        int count = 0;
        Nodo tempo = head;
        while (count < index){
            tempo = tempo.getNext();
            count++;
        }
        return tempo.getValue();
    }

    public void deleteNodo(){

        if (head == null){
            System.out.println("lista vacia");
        }
        if (head == tail){
            head = tail = null;
        }else {
            int count = 0;
            Nodo tempi = head;
            while (count < size - 2) {

                tempi = tempi.getNext();
                count++;
            }
            tempi.setNext(null);
            tail = tempi;
            size--;
        }
    }

    public void deleteNodo(int index){
        if(index == 0){
            head = head.getNext();
        }else {
            int count = 0;
            Nodo tempa = head;
            while (count < index-1){

                tempa = tempa.getNext();
                count++;
            }
            tempa.setNext(
                    tempa.getNext().getNext()
            );
        }
        size--;
    }

    public void inserNodo(int index, Object obj){
        if(index == 0){
            pushFront(obj);
        }else if (index == size()){
            pushBack(obj);
        }else {
            int count = 0;
            Nodo tempa = head;
            Nodo Nuev= new Nodo(obj);
            while (count < index-1){

                tempa = tempa.getNext();
                count++;
            }
            Nuev.setNext(
                    tempa.getNext()
            );
            tempa.setNext(Nuev);
        }
        size++;
    }

    public void pushFront (Object obj){
        Nodo temp = head;
        Nodo nuevo = new Nodo (obj);
        nuevo.setNext(temp);
        head = nuevo;
        if(tail == null){
            tail= head;
        }
        size++;
    }

    public void popFront(){
        if (head == null){
            System.out.println("lista vacia");
        }else{
            head = head.getNext();
            if(head == tail){
                tail=null;
            }
        }
        size--;
    }

    public void pushBack(Object obj1){
        Nodo nuev = new Nodo (obj1);
        nuev.setNext(null);
        if (tail== null){
            head = tail = nuev;
        }else{
            tail.setNext(nuev);
            tail=nuev;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public boolean empty (){
        boolean lista = true;
        if (head != null){
            lista = false;
        }
        return lista;
    }

    /*public boolean insert(int item){
        boolean inserted;
        Nodo ptr = new Nodo(head);
        Nodo prev = null;
        inserted = false;
        int c = 0;
        if(ptr != null) {
            c = (int) ptr.getValue();
            while (ptr != null && c < item) {
                prev = ptr;
                ptr = ptr.getNext();
            }
        }
        if (ptr == null || c != item) {
            inserted = true;
            Nodo newp = new Nodo(item);
            newp.setNext(ptr);
            if(prev == null)
                head = newp;
            else
                prev.setNext(newp);
        }
        return inserted;
    }*/
}