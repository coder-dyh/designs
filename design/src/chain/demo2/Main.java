package chain.demo2;

public class Main {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.doFilter(1000);
    }
}
