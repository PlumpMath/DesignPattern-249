package SingletonPattern;

class Emperor {

    private static Emperor emperor = null;

    private Emperor() {

    }

    public static Emperor getInstance() {
        if (null == emperor) {
            synchronized (Emperor.class) {
                if (null == emperor)
                    emperor = new Emperor();
            }
        }

        return emperor;
    }

    public void say() {
        System.out.println(emperor + ":hello");
    }

}
