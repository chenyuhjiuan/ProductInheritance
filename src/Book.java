import javax.sound.midi.Soundbank;

public class Book extends Product{
    private String author;
    private int pages;

    public static void main(String args[]){

        //will call the public or protected fields and methods in parent Product
        Book bobj= new Book();
        System.out.println("toString method from Product: "+bobj.toString());
        System.out.println("getFormattedPrice method from Product: "+bobj.getFormattedPrice(10.0));
        System.out.printf("getCount method from Product"+bobj.getCount());
    }

}
