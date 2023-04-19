package OOPsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoctorSpec {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String t = in.readLine();
        if (t.equalsIgnoreCase("Specialist")) {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(in.readLine()), in.readLine(), in.readLine(), in.readLine());
            s.getDetails();
        } else if (t.equalsIgnoreCase("Doctor")) {

            Doctor s=new Doctor(Integer.parseInt(in.readLine()), in.readLine(), in.readLine());
        } else {
            System.out.println("Invalid Input");
        }

    }


}

class Doctor {
    private int doctorId;
    private String doctorName, location;

    Doctor(int docId, String docName, String loc) {
        this.doctorId = docId;
        this.doctorName = docName;
        this.location = loc;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return this.doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return this.doctorName;
    }

    public void setLocation(String Location) {
        this.location = Location;
    }

    public String getLocation() {
        return this.location;
    }


    public void getDetails() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Location: " + location);
    }

}

class SpecialistDoctor extends Doctor {


    private String specialist;

    SpecialistDoctor(int docId, String docName, String loc, String specialist) {
        super(docId, docName, loc);
        this.specialist = specialist;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Specialist: " + specialist);
    }
}
