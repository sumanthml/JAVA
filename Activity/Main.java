import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> hostel = new TreeMap<>();

        while (true) {

            System.out.println("\n========== Hostel Management ==========");
            System.out.println("1. Allocate Room");
            System.out.println("2. View All Rooms");
            System.out.println("3. Search Occupant");
            System.out.println("4. Update Occupant");
            System.out.println("5. Vacate Room");
            System.out.println("6. Check Room Availability");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Room Number: ");
                    int room = sc.nextInt();
                    sc.nextLine();

                    if (hostel.containsKey(room)) {
                        System.out.println("Room is already occupied.");
                    } else {

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        hostel.put(room, name);
                        System.out.println("Room allocated successfully.");
                    }
                    break;

                case 2:

                    if (hostel.isEmpty()) {
                        System.out.println("No rooms are occupied.");
                    } else {

                        System.out.println("\nOccupied Rooms");

                        hostel.forEach((r, n) ->
                                System.out.println("Room " + r + " -> " + n));
                    }
                    break;

                case 3:

                    System.out.print("Enter Room Number: ");
                    room = sc.nextInt();

                    if (hostel.containsKey(room))
                        System.out.println("Occupant : " + hostel.get(room));
                    else
                        System.out.println("Room is vacant.");
                    break;

                case 4:

                    System.out.print("Enter Room Number: ");
                    room = sc.nextInt();
                    sc.nextLine();

                    if (hostel.containsKey(room)) {

                        System.out.print("Enter New Occupant Name: ");
                        String newName = sc.nextLine();

                        hostel.replace(room, newName);
                        System.out.println("Occupant updated successfully.");
                    } else {
                        System.out.println("Room is vacant.");
                    }
                    break;

                case 5:

                    System.out.print("Enter Room Number: ");
                    room = sc.nextInt();

                    if (hostel.containsKey(room)) {

                        hostel.remove(room);
                        System.out.println("Room vacated successfully.");
                    } else {
                        System.out.println("Room is already vacant.");
                    }
                    break;

                case 6:

                    System.out.print("Enter Room Number: ");
                    room = sc.nextInt();

                    if (hostel.containsKey(room))
                        System.out.println("Room is Occupied.");
                    else
                        System.out.println("Room is Available.");

                    break;

                case 7:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
