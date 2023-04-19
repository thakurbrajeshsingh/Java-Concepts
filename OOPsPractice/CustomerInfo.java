package OOPsPractice;


import java.time.YearMonth;
import java.util.Scanner;

class SimpleDate {
    private int day;
    private int month;
    private int year;

    SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        validateDate(this);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public static boolean validateDate(SimpleDate sd) {
        if (sd.year >= 2000) {
            if ((sd.month >= 1) && (sd.month <= 12)) {
                YearMonth d = YearMonth.of(sd.year, sd.month);
                if ((sd.month == 2) && (sd.day <= 28)) {
                    return true;
                } else if (d.isValidDay(sd.day)) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}


class Address {
    private String area;
    private String city;


    Address() {

    }

    Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return area + ", " + city;
    }
}

class Customer {
    private int custId;
    private String name;
    private Address address;
    private SimpleDate registrationDate;

    Customer() {

    }

    Customer(int c, String n, Address a, SimpleDate s) {
        this.custId = c;
        this.name = n;
        this.address = a;

        if (!SimpleDate.validateDate(s)) {
            this.registrationDate = null;
        } else {
            this.registrationDate = s;
        }
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address a) {
        this.address = a;
    }

    public SimpleDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(SimpleDate s) {
        if (!SimpleDate.validateDate(s)) {
            this.registrationDate = null;
        } else {
            this.registrationDate = s;
        }

    }

    @Override
    public String toString() {
        String date = "";
        if (this.registrationDate == null) {
            date = "Unknown";
        } else {
            date = this.registrationDate.toString();
        }
        String add = "";
        if (this.address == null) {
            add = "Unknown";
        } else {
            add = this.address.toString();
        }
        String k = String.format("Id : %d, Name : %s\nAddress : %s" + "\nRegistered on : %s",
                custId, name, add, date);
        return k;
    }
}


public class CustomerInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameIds=sc.nextLine();
        String areaCitys =sc.nextLine();

        String[] nameId = nameIds.split(" ");
        String[] areaCity = areaCitys.split(" ");


        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        SimpleDate sd = new SimpleDate(d, m, y);
        Address ad = new Address();
        ad.setArea(areaCity[0]);
        ad.setCity(areaCity[1]);

        Customer cus = new Customer(Integer.parseInt(nameId[0]), nameId[1], ad, sd);
        System.out.println(cus);


    }

}
