package chain.demo2;

public interface Handler {

    void execute(int money, HandlerChain chain);
}
