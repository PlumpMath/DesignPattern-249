package ChainOfResponsibilityPattern;

import java.util.Random;

public class Client
{
    public static void main(String[] args)
    {
        Random r = new Random();
        IWomen w = new Woman(r.nextInt(4), "hehe");

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        father.handlerMessage(w);
    }

}
