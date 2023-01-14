package exercise1;

import java.time.LocalDate;
import java.time.Month;

// Driver program
public class Main {
    public static void main(String[] args) {
        // initiate instance
        Singer singer1 = new Singer();

        // display default values
        System.out.println("Display default values from no argument constructor: ");
        System.out.println("=========================");
        System.out.println(singer1.toString());

        // display new values after 1st update
        singer1.setAll(1,
                "Ed Sheeran",
                "62 Leeming St, Mansfield, Nottinghamshire, NG18 1NG",
                LocalDate.of(1983,Month.DECEMBER.getValue(),7),
                10
                );
        System.out.println("Display new values after calling Setter for All values: ");
        System.out.println("=========================");
        System.out.println(singer1.toString());

        // display new values after 2nd update
        singer1.setId(2);
        singer1.setName("Katy Perry");
        singer1.setAddress("1 Nathan Road, Hong Kong");
        singer1.setDob(LocalDate.of(1990,8,21));
        singer1.setNoOfAlbumsPublished(50);
        System.out.println("Display new values after calling individual setters: ");
        System.out.println("=========================");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDob());
        System.out.println("No. of Albums Published: " + singer1.getNoOfAlbumsPublished());
    }
}