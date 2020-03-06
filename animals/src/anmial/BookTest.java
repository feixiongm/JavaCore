package anmial;

public class BookTest {
    public static void main(String[] args) {
        Book one = new Book("红楼梦", "曹雪芹", "人民文学出版社", 1);
       Book two = new Book("小李飞刀","古龙","中国长安出版社",55.5);
        if(one.getPrice() < 10){
           one.setPrice(10);
           System.out.println("图书价格最低十元");
       }
        System.out.println(one.getBookName());
        System.out.println(one.getAuthorName());
        System.out.println(one.getCompany());
        System.out.println(one.getPrice());

        System.out.println("==============================");

        System.out.println(two.getBookName());
        System.out.println(two.getAuthorName());
        System.out.println(two.getCompany());
        System.out.println(two.getPrice());
    }
}
