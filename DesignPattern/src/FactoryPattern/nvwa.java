package FactoryPattern;

/**
 * 工厂方法模式
 *
 * @author V
 */
class nvwa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();

        Human whiteHuman = factory.createHuman(WhiteMan.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human yellowHuman = factory.createHuman(YellowMan.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        Human blackMan = factory.createHuman(BlackMan.class);
        blackMan.getColor();
        blackMan.talk();
    }
}
