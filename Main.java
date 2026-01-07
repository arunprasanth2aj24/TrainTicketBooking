package TrainTicketBooking;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        PassengerInterface p1 = new Passenger();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name");
        p1.setName(scan.nextLine());

        System.out.println("Enter your age");
        p1.setAge(scan.nextInt());
        scan.nextLine();

        System.out.println("Enter your Start destination");
        p1.setStartDestination(scan.nextLine());

        System.out.println("Enter your End destination");
        p1.setDestination(scan.nextLine());

        System.out.println("Enter your ticket type");
        p1.setTicketType(scan.nextLine());



        if (p1.getTicketType().equals("General")){


            int[][] trainSeats = new int[6][5];

            trainSeats[0] = new int[]{1,2,3,4,5};

            for (int i = 0; i < trainSeats.length; i++) {

                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }

                for (int j = 0; j < trainSeats[i].length; j++) {

                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }

                    System.out.print(trainSeats[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 1; ) {

                boolean validSeat = false;

                while (!validSeat) {
                    try {
                        System.out.println("Enter train seat (Ex: A1, B3)");
                        String seat = scan.nextLine();

                        char[] ch = seat.toCharArray();

                        int fr = ch[0] - 65;
                        Integer fs = new Integer(String.valueOf(ch[1]));
                        int finalSeat = fs - 1;


                        if (trainSeats[fr + 1][finalSeat] == 1) {
                            System.out.println("Seat already booked, try another");
                        } else {
                            trainSeats[fr + 1][finalSeat] = 1;
                            validSeat = true;
                            System.out.println("Seat booked successfully!");
                        }

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat");
                    }
                }
            }



            TicketInterface gt = new GeneralTicket("K07",100,p1);
            p1.setGt(gt);
            gt.computeFare();
        }
        else if (p1.getTicketType().equals("Tatkal")){

            int[][] trainSeats = new int[6][5];

            trainSeats[0] = new int[]{1,2,3,4,5};

            for (int i = 0; i < trainSeats.length; i++) {

                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }

                for (int j = 0; j < trainSeats[i].length; j++) {

                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }

                    System.out.print(trainSeats[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 1; i++) {

                boolean validSeat = false;

                while (!validSeat) {
                    try {
                        System.out.println("Enter train seat (Ex: A1, B3)");
                        String seat = scan.nextLine();

                        char[] ch = seat.toCharArray();

                        int fr = ch[0] - 65;
                        Integer fs = new Integer(String.valueOf(ch[1]));
                        int finalSeat = fs - 1;


                        if (trainSeats[fr + 1][finalSeat] == 1) {
                            System.out.println("Seat already booked, try another");
                        } else {
                            trainSeats[fr + 1][finalSeat] = 1;
                            validSeat = true;
                            System.out.println("Seat booked successfully!");
                        }

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat");
                    }
                }
            }

            TicketInterface tt = new TatkalTicket("K07",200,p1);
            p1.setTt(tt);
            tt.computeFare();
        }
        else{
            System.out.println("Enter a valid ticketType");
        }


        PassengerInterface p2 = new Passenger();

        System.out.println("Enter your Name");
        p2.setName(scan.nextLine());

        System.out.println("Enter your age");
        p2.setAge(scan.nextInt());
        scan.nextLine();

        System.out.println("Enter your Start destination");
        p2.setStartDestination(scan.nextLine());

        System.out.println("Enter your End destination");
        p2.setDestination(scan.nextLine());

        System.out.println("Enter your ticket type");
        p2.setTicketType(scan.nextLine());



        if (p2.getTicketType().equals("General")){
            TicketInterface gt = new GeneralTicket("K07",100,p2);

            int[][] trainSeats = new int[6][5];

            trainSeats[0] = new int[]{1,2,3,4,5};

            for (int i = 0; i < trainSeats.length; i++) {

                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }

                for (int j = 0; j < trainSeats[i].length; j++) {

                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }

                    System.out.print(trainSeats[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 1; i++) {

                boolean validSeat = false;

                while (!validSeat) {
                    try {
                        System.out.println("Enter train seat (Ex: A1, B3)");
                        String seat = scan.nextLine();

                        char[] ch = seat.toCharArray();

                        int fr = ch[0] - 65;
                        Integer fs = new Integer(String.valueOf(ch[1]));
                        int finalSeat = fs - 1;


                        if (trainSeats[fr + 1][finalSeat] == 1) {
                            System.out.println("Seat already booked, try another");
                        } else {
                            trainSeats[fr + 1][finalSeat] = 1;
                            validSeat = true;
                            System.out.println("Seat booked successfully!");
                        }

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat");
                    }
                }
            }
            p2.setGt(gt);
            gt.computeFare();
        }
        else if (p2.getTicketType().equals("Tatkal")){

            int[][] trainSeats = new int[6][5];

            trainSeats[0] = new int[]{1,2,3,4,5};

            for (int i = 0; i < trainSeats.length; i++) {

                if (i != 0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }

                for (int j = 0; j < trainSeats[i].length; j++) {

                    if (i == 0 && j == 0) {
                        System.out.print("  ");
                    }

                    System.out.print(trainSeats[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 1; i++) {

                boolean validSeat = false;

                while (!validSeat) {
                    try {
                        System.out.println("Enter train seat (Ex: A1, B3)");
                        String seat = scan.nextLine();

                        char[] ch = seat.toCharArray();

                        int fr = ch[0] - 65;
                        Integer fs = new Integer(String.valueOf(ch[1]));
                        int finalSeat = fs - 1;



                        if (trainSeats[fr + 1][finalSeat] == 1) {
                            System.out.println("Seat already booked, try another");

                        } else {
                            trainSeats[fr + 1][finalSeat] = 1;
                            validSeat = true;
                            System.out.println("Seat booked successfully!");
                        }

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat");
                    }
                }
            }
            TicketInterface tt = new TatkalTicket("K07",200,p2);
            p2.setTt(tt);
            tt.computeFare();
        }
        else{
            System.out.println("Enter a valid ticketType");
        }
    }
}