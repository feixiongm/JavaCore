package anmial;

public class Book {
    private String BookName;
    private String AuthorName;
    private String Company;
    private double price;

    public Book(){

    }

    public Book(String BookName, String AuthorName, String Company, double price){
        this.BookName = BookName;
        this.setCompany(Company);
        this.setPrice(price);
        this.AuthorName = AuthorName;
    }
    public String getBookName(){
        return BookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }
}
