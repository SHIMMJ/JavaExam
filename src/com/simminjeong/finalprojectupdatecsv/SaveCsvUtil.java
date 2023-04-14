package com.simminjeong.finalprojectupdatecsv;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;



public class SaveCsvUtil {

    public static void csvToBook() throws Exception {

        String csvFile = "book.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // 첫 번째 라인은 필드명이므로 읽어서 처리하지 않음
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                String id = data[0];
                String title = data[1];
                String writer = data[2];
                String publisher = data[3];
                boolean rentState = Boolean.parseBoolean(data[4]);


                // SimpleDateFormat 객체 생성
                // SimpleDateFormat dateFormat =
                // new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                // Date newReleaseDate = dateFormat.parse(releaseDate);
//                public static List<BookInfo> books = new ArrayList<>();
                
                BookInfo book = new BookInfo(id, title, writer, publisher, rentState);
                BookManage.books.add(book);
                // BookInfo.autoIncreaseBookId = bookId + 1;
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void bookToCsv() throws Exception {

        FileWriter writer = new FileWriter("book.csv");

        // CSV 파일의 헤더 작성
        writer.append("bookId,title,writer,publisher,rentState\n");

        // Iterator를 사용하여 ArrayList의 객체들을 CSV 파일에 작성
        Iterator<BookInfo> iterator = BookManage.books.iterator();

        while (iterator.hasNext()) {
            BookInfo book = iterator.next();
            writer.append(String.valueOf(book.getId())).append(",").append(book.getTitle())
                    .append(",").append(book.getWriter()).append(",").append(book.getPublisher())
                    .append(",").append(String.valueOf(book.getisAvailable())).append("\n");
        }

        writer.close();
        System.out.println("CSV 파일이 성공적으로 작성되었습니다.");
    }


    public static void csvToUser() throws Exception {

        String csvFile = "user.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // 첫 번째 라인은 필드명이므로 읽어서 처리하지 않음
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                String signupdate = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String address = data[3];
                String phonenumber = data[4];
                String birthday = data[5];
                String sex = data[6];


                // SimpleDateFormat 객체 생성
                // SimpleDateFormat dateFormat =
                // new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                // Date newbirthday = dateFormat.parse(birthday);

                UserInfo user =
                        new UserInfo(signupdate, name, age, address, phonenumber, birthday, sex);
                UserManage.users.add(user);
                // BookInfo.autoIncreaseBookId = bookId + 1;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void UserToCsv() throws Exception {
        
        try {
            FileWriter writer = new FileWriter("user.csv");
        

        // CSV 파일의 헤더 작성
        writer.append("signupdate,name,age,address,phonenumber,birthday,sex\n");

        
        // Iterator를 사용하여 ArrayList의 객체들을 CSV 파일에 작성
        Iterator<UserInfo> iterator = UserManage.users.iterator();

        while (iterator.hasNext()) {

            UserInfo user = iterator.next();
            System.out.println(user.getSignupdate());
            writer.append(user.getSignupdate()).append(",").append(user.getName()).append(",").append(String.valueOf(user.getAge())).append(",").append(user.getAddress()).append(",").append(user.getPhonenumber()).append(",").append(user.getBirthday()).append(",").append(user.getSex()).append("\n");
        }
        
        writer.close();
        
        System.out.println("CSV 파일이 성공적으로 작성되었습니다.");
    }catch(

    IOException e)
    {
        System.out.println("파일 작성 중 오류가 발생하였습니다.");
        e.printStackTrace();
    }
    }


    public static void csvToCheckOut() throws Exception {

        String csvFile = "checkout.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // 첫 번째 라인은 필드명이므로 읽어서 처리하지 않음
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                String name = data[0];
                String title = data[1];
                String checkoutdate = data[2];
                String deadlinedate = data[3];


                // SimpleDateFormat 객체 생성
                // SimpleDateFormat dateFormat =
                // new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                // Date newReleaseDate = dateFormat.parse(releaseDate);

                CheckoutInfo checkout = new CheckoutInfo(name, title, checkoutdate, deadlinedate);
                CheckoutManage.checkoutinfos.add(checkout);
                // BookInfo.autoIncreaseBookId = bookId + 1;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void checkOutToCsv() throws Exception {

        FileWriter writer = new FileWriter("checkout.csv");

        // CSV 파일의 헤더 작성
        writer.append("name, title, checkoutdate, deadlinedate\n");

        // Iterator를 사용하여 ArrayList의 객체들을 CSV 파일에 작성
        Iterator<CheckoutInfo> iterator = CheckoutManage.checkoutinfos.iterator();

        while (iterator.hasNext()) {
            CheckoutInfo checkout = iterator.next();
            writer.append(checkout.getName()).append(",").append(checkout.getTitle()).append(",")
                    .append(checkout.getCheckoutdate()).append(",").append(checkout.getDeadlinedate())
                    .append("\n");
        }

        writer.close();
        System.out.println("CSV 파일이 성공적으로 작성되었습니다.");
    }



}
