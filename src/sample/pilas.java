package sample;

public class pilas {
    private  nodo top;

    public pilas(){
        top=null;

    }
    public boolean vacia(){
        return (top==null);
    }

    public  void  push (int valor){
        nodo nuevoNdo;
        if (vacia())
            top = new nodo(valor);
        else {
            nuevoNdo= new nodo(valor);
            nuevoNdo.setProx(top);
            top=nuevoNdo;

        }

    }

    public void peek (){//mostrar
        nodo temp=top;
        if (temp!=null){
            System.out.println("La pila es:");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("PILA VACIA");
    }
    public void cima(){//buscar
        if (!vacia())
            System.out.println("cima:"+top.getValor());
        else
            System.out.println("La pila esta vacia");
    }

    public  void pop(){//extraer
        if (!vacia()){
            System.out.println("dato extraido:"+top.getValor());
            top=top.getProx();
        }
        else
            System.out.println("La pila esta vacia");

    }
}
