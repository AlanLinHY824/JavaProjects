package src;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建公司
        Company company = new Company();

        //添加员工
        company.add(new Employee());
        company.add(new Employee("lisi", 25, 8000));
        company.add(new Employee("wangwu", 29, 2000));
        company.add(new Employee("zhaoliu", 26, 4000));
        company.add(new Employee("chenqi", 28, 8000));
        company.add(new Employee("yueyue", 23, 9000));
        company.add(new Employee("baofeng", 24, 6000));
        company.add(new Employee("zhouzhou", 22, 7000));
        company.add(new Employee("zhouzhou", 22, 7000));
        company.add(new Employee("zhouzhou", 22, 7000));

        //显示所有员工
        company.showAll();

        //判断是否存在指定姓名的员工
        System.out.println( company.containsName("lisi"));
        System.out.println( company.containsName("feifei"));
        //判断是否存在某个员工,还没有录入信息,即判断是否存在姓名为null的员工
        System.out.println( company.containsName( null ));

        //删除元素
        company.deleteByName("zhouzhou");
        company.showAll();
        company.deleteByName(null);
        company.showAll();

        //排序
        company.sortByAge();
        company.showAll();
        company.sortBySalaryDesc();
        company.showAll();
        company.sortByName();
        company.showAll();

    }
}
