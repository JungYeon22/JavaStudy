package book;

import java.io.Serializable;
import java.util.Scanner;

public class BookDTO implements Serializable {      // 파일에 넣을 객체로서 직렬화 implements 해야함
    private String code, title, author;
    private int price, qty, total;

    public BookDTO(String code, String title, String author, int price, int qty) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public void calc() {
        this.total = price * qty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return code + "\t\t" + title + "\t\t" + author + "\t\t" + price + "\t\t" + qty + "\t\t" + total;
    }

    public boolean isSameBook(BookDTO bookDTO) {
        if(this.code.equals(bookDTO.getCode())
                && this.title.equals(bookDTO.getTitle())
                && this.author.equals(bookDTO.getAuthor())
                && this.price == bookDTO.getPrice()){
            return true;
        }
        else return false;
    }

    public void integrate(int qty) {
        this.qty += qty;
        calc();
    }
}
/*
필드
code, title, author, price, qty,  total
코드, 제목, 작가, 가격, 개수, 전체가격

 */
