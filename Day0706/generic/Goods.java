package generic;

/**
 * 商品类
 * 2020-07-06 15：14
 * 学习泛型的用法
 */
public class Goods<T> {

    String name;//商品名称


    T price;//(byte short int long float double)

    public T getPrice(){

        return price;
    }



    public void setPrice(T price){

        this.price = price;
    }
}
