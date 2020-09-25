package exam;

import java.util.HashSet;
import java.util.Objects;

/**
 * 3.采购部小张在编辑excle时不小心拷贝重复了很多数据，请编写一个程序帮小张把多余的重复数据删掉：
 *   1).当ID相等时认为是同一条数据
 *   2).要求使用集合类当中最恰当的集合实现
 *   3).只要能输出不带重复的数据即可
 *   4).excle数据内容如下：
 *       ———————————————————————————————————————————
 *       |  ID  |           商品名称          |  进货价  |  零售价  |           厂家          |
 *       |——————————————————————————————————————————|
 *       |  001 |       旺仔牛奶铁罐330ml     |    3.5   |  5.5     |       旺旺食品有限公司  |
 *       |——————————————————————————————————————————|
 *       |  002 |       旺仔牛奶铁罐330mlx24  |    72.3  |  99.0    |       旺旺食品有限公司  |
 *       |——————————————————————————————————————————|
 *       |  003 |       旺旺仙贝30g           |    1.2   |  1.5     |       旺旺食品有限公司  |
 *       |——————————————————————————————————————————|
 *       |  004 |       脉动青柠味500ml       |    3.2   |  4.5     |     可口可乐中国有限公司|
 *       |——————————————————————————————————————————|
 *       |  001 |       旺仔牛奶铁罐330ml     |    3.5   |  5.5     |       旺旺食品有限公司  |
 *       |——————————————————————————————————————————|
 *       |  001 |       旺仔牛奶铁罐330ml     |    3.5   |  5.5     |       旺旺食品有限公司  |
 *       |——————————————————————————————————————————|
 *       |  002 |       旺仔牛奶铁罐330mlx24  |    72.3  |  99.0    |       旺旺食品有限公司  |
 *       ———————————————————————————————————————————
 * @AlanLin 2020/7/6
 */
public class Test03 {
    public static void main(String[] args) {

        HashSet<SupplierList> supplierListHashSet=new HashSet<>();

        //获取根据源数据创建对象
        SupplierList data1=new SupplierList("001","旺仔牛奶铁罐330ml",3.5,5.5,"旺旺食品有限公司");
        SupplierList data2=new SupplierList("002","旺仔牛奶铁罐330mlx24",72.3,99.0,"旺旺食品有限公司");
        SupplierList data3=new SupplierList("003","旺旺仙贝30g",1.2,1.5,"旺旺食品有限公司");
        SupplierList data4=new SupplierList("004","脉动青柠味500ml",3.2,4.5,"可口可乐中国有限公司");
        SupplierList data5=new SupplierList("001","旺仔牛奶铁罐330ml",3.5,5.5,"旺旺食品有限公司");
        SupplierList data6=new SupplierList("001","旺仔牛奶铁罐330ml",3.5,5.5,"旺旺食品有限公司");
        SupplierList data7=new SupplierList("002","旺仔牛奶铁罐330mlx24",72.3,99.0,"旺旺食品有限公司");

        //向集合添加数据
        supplierListHashSet.add(data1);
        supplierListHashSet.add(data2);
        supplierListHashSet.add(data3);
        supplierListHashSet.add(data4);
        supplierListHashSet.add(data5);
        supplierListHashSet.add(data6);
        supplierListHashSet.add(data7);

        //遍历输出
        for (SupplierList supplierList : supplierListHashSet) {
            System.out.println(supplierList);
        }

    }
}

class SupplierList{
    String id;
    String productName;
    double cost;
    double price;
    String supplierName;

    public SupplierList() {
    }

    public SupplierList(String id, String productName, double cost, double price, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;
        this.price = price;
        this.supplierName = supplierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierList that = (SupplierList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SupplierList{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
