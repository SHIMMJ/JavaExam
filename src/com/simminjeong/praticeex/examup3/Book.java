package com.simminjeong.praticeex.examup3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//제목과 출간일이 같으면 같은 책으로 판단한다. 또한 HashSet 등의 컬렉션에 넣어도 동일 객체로 판단한다.
//Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 오래된 순서대로 정렬된다.
//clone() 메서드를 호출하면 복제된다.


public class Book implements Comparable<Book>{
    
    private String title;
    private Date publishDate;
    private String comment;

    
    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }
    
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDate, title);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
    }


    SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
    
    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }


    @Override
    public String toString() {
        return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment
                + "]";
    }


    
    
    
    

}
