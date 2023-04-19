package OOPsPractice;

class Customers {
    int customerId;
    String name, city, phone, email;

    Customers() {

    }

    Customers(int customerId, String name, String city, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        }
        Customers c = (Customers) obj;
        if (!getResults(this.name, c.getName())) {
            return false;
        } else if (!getResults(this.city, c.getCity())) {
            return false;
        } else if (!getResults(this.email, c.getEmail())) {
            return false;
        } else if (!getResults(this.phone, c.getPhone())) {
            return false;
        }
        return (this.customerId == c.getCustomerId());

    }

    public boolean getResults(String a, String b) {
        if (a == null && b != null) {
            return false;
        } else if (a != null && b == null) {
            return false;
        } else if (a != null && b != null) {
            return a.equals(b);
        }
        return true;
    }


}


public class EqualityCheck {
    public static void main(String[] args) {

    }
}
