package generic;

public class Test {


    public static void main(String[] args) {

        //Goods<Byte> goods = new Goods<Byte>(); jdk1.8之前前后泛型都必须标明Byte
        /*Goods<Byte> goods = new Goods<>();//jdk1.8之前前后泛型具有推测功能

        goods.setPrice((byte)1);

        System.out.println("商品的价格是:" + goods.getPrice() + "元");*/


        /*Goods<Integer> goods = new Goods<>();//jdk1.8之前前后泛型具有推测功能

        goods.setPrice(1);

        System.out.println("商品的价格是:" + goods.getPrice() + "元");*/

        Goods<Double> goods = new Goods<>();//jdk1.8之前前后泛型具有推测功能

        goods.setPrice(199.99);

        System.out.println("商品的价格是:" + goods.getPrice() + "元");

    }
}
