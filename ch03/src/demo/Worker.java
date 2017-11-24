package demo;

/**
 * 工人
 */
public class Worker extends People{

    private IdCard card;

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Worker(String name){
        super(name);
    }

    public void work(Tools tools){
        tools.fix();
    }
}
