import java.util.Scanner;

class p6_bus {
    // all variable decleared as public 
    public String busno = "UK07PT3259";
    public String route_name = "DDN-NDL";
    public int total_seats = 50;
    public static int fare = 150;
    public int seatno = 0;
    public static String[] pass_name = new String[50];
    public static int no_seats = 0;
    public int seats_remaining = 50;
    public int booked_seats = 0;
    Scanner s = new Scanner(System.in);
    // Constructor 
    p6_bus() {
        System.out.println("░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒░░▒▒░░░░▒▒░░░░▒▒░░░░▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒██▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░░░▒▒░░▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒░░▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██▒▒████▒▒██▒▒████▓▓██████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒          ▒▒░░        ▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒                    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓████████████░░████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒          ▒▒░░        ░░▒▒░░▒▒░░░░░░░░░░░░▒▒▒▒▒▒                    ▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░██░░░░░░██████▒▒████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒          ▒▒░░        ▒▒░░░░▒▒░░▒▒▒▒▒▒░░░░░░░░▒▒              ░░    ▒▒▒▒▒▒▒▒░░▒▒▒▒██▓▓██▒▒░░██░░████████████▒▒▒▒▒▒");
        System.out.println("  ░░▒▒▒▒▒▒▒▒        ▒▒▒▒        ▒▒░░▒▒▒▒▒▒░░░░▒▒▒▒▒▒░░▒▒▒▒  ░░▒▒        ▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓████░░████░░░░██▓▓██▒▒▒▒    ");
        System.out.println("    ░░▒▒▒▒▒▒                    ▒▒░░░░░░▒▒░░░░░░▒▒░░░░▒▒▒▒▒▒▒▒▒▒        ▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░████████████▒▒▒▒      ");
        System.out.println("    ░░▒▒▒▒▒▒                    ▒▒░░▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒        ▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░██░░░░░░████▒▒▒▒      ");
        System.out.println("    ░░▒▒▒▒▒▒      ░░▒▒▒▒        ▒▒░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒        ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓████████░░░░░░████▒▒▒▒      ");
        System.out.println("  ░░░░▒▒▒▒          ▒▒          ░░▒▒░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒            ▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░████████████▒▒▒▒      ");
        System.out.println("░░░░▒▒▒▒▒▒          ▒▒░░        ░░▒▒▒▒░░▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒            ▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░██░░░░░░██████▒▒░░    ");
        System.out.println("░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓████████░░░░░░██▒▒████▒▒▒▒  ");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██░░░░████░░░░████▒▒████▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒          ▒▒      ▒▒▒▒        ▒▒            ▒▒          ▒▒          ▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██▓▓▓▓████░░░░████████▒▒██▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒  ░░  ▒▒  ▒▒▒▒  ▒▒▒▒    ▒▒    ▒▒░░  ▒▒    ▒▒▒▒    ▒▒▒▒  ▒▒  ▒▒  ▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒  ▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒░░      ▒▒▒▒▒▒░░  ░░▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒  ▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒░░        ▒▒▒▒░░  ░░▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒  ▒▒▒▒    ▒▒    ▒▒░░  ▒▒    ▒▒▒▒▒▒  ▒▒▒▒  ▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██▓▓████▓▓████████▓▓██████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒      ▒▒▒▒      ▒▒▒▒      ▒▒▒▒    ░░      ▒▒          ▒▒▒▒      ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██▒▒████▒▒██▒▒████▒▒██████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓██████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("\033[0;1m"+"Welcome to DIT Bus Services");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bus Number is - " + busno);
        System.out.println("Bus route is - " + route_name);
        System.out.println("\033[0;1m" );

    }

    // it takes user input for no of seats and pass name
    public void booking(p6_bus obj1) {
        
        System.out.println("\nhow many tickets you want to book");
        no_seats = obj1.s.nextInt();
        if (booked_seats + no_seats <= total_seats)
            booked_seats += no_seats;
        else {

            System.out.println("Entered Numbers of seats are not available");
        }

        for (int i = 0; i < no_seats; i++) {
            System.out.println("enter the seat number/s"); // takes seat number
            seatno = obj1.s.nextInt();
            obj1.s.nextLine();
            System.out.println("enter the pass name"); // takes pass name
            pass_name[seatno - 1] = obj1.s.nextLine();

        }
        calc_fare();

    }

    // checks availability of seats
    public void availability(p6_bus obj) {
        if (booked_seats == 50)
            System.out.println("all seats are booked");
        else {
            System.out.println("seats available are - " + (total_seats - booked_seats));
            System.out.println("Available Seats are - ");
            for (int i = 0; i < 50; i++) { // print numbers of available seats
                if (pass_name[i] == null)
                    System.out.print((i + 1) + " ");
            }
        }

    }

    // display seats status in sorted order
    public void status(p6_bus obj) {
        System.out.println("status of the bus is - ");
        for (int i = 0; i < 50; i++) {
            if (pass_name[i] != null)
                System.out.println("seat " + (i+1) + " - Booked");
            else
                System.out.println("seat " + (i+1) + " - Available");
        }
    }

    // calculate fare
    public static void calc_fare() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("total fare will be " + (fare * no_seats));
        System.out.println("-------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        p6_bus obj1 = new p6_bus();

        int i;
        while (true) {
            System.out.println("1-booking \n2-Seats Status\n3-exit ");
            System.out.println("enter your choice - ");
            i = obj1.s.nextInt();

            switch (i) {
            case 1:
                obj1.availability(obj1);
                obj1.booking(obj1);
                break;
            case 2:
                obj1.status(obj1);
                break;
            case 3:
                System.out.println("thank you for using our transportation . Please visit again");
                System.exit(0);
            default:
                System.out.println("you have entered wrong choice");

            }
        }
    }
}