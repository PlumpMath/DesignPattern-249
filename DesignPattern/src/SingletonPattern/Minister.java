package SingletonPattern;

/**
 * 单例模式
 *
 * @author V 优点:内存中只有一个实例减少内存开支,避免对资源的多重占用 缺点:没有接口,很难扩展,与单一职责原则有冲突
 */
class Minister {
    public static void main(String[] args) {
        Emperor emperor = null;
        for (int i = 0; i < 3; i++) {
            emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
