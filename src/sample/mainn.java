package sample;

public class mainn {
    public static void main(String[] args) throws Exception {
        pilas p = new pilas();
        p.push(2);
        p.push(8);
        p.push(1);


        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();
    }
}
