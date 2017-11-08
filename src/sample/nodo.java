package sample;

public class nodo {

    private int valor;
    private nodo prox;

    public  nodo(){
        this.valor=0;
        this.prox=null;
    }

    public  nodo(int valor){
        this.valor=valor;
        this.prox=null;

    }
    public void setValor(int valor){
        valor=valor;
    }
        public void  setProx(nodo prox){
        prox=prox;
        }
        public int getValor(){
            return  valor;
        }
        public  nodo getProx(){
            return  prox;
        }
}
