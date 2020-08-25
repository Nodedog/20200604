



class GirlFirend{
    public String name;
    public String sex;
    public int age;

    public GirlFirend(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        GirlFirend girlFirend = new GirlFirend("xxx","女",21);
        System.out.println("恭喜你喜提女朋友一名");
    }
}
