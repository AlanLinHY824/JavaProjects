package generic;

/**
 * @AlanLin 2020/7/6
 */
public class Goods < T extends Number>{
    String name;
    T price ;

    public static <E extends Object> String getCount(E store){
        return store.toString();//此处未指定S的具体类型，所以不能引用S的任何方法和属性，只能用
    }

    public T getPrice() {
        return price;
    }

    public Goods<T> setPrice(T price) {
        this.price = price;
        return this;
    }

}
