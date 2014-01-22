package TemplateMethodPattern;

/**
 * 模版方法模式
 * 
 * @author V
 * 
 */
class Client
{
    public static void main(String[] args)
    {
        HummerModel h1 = new HummerH1Model();
        HummerModel h2 = new HummerH2Model();
        h1.run();
        h2.run();
    }
}
