import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        System.out.println(); // Space

        int guests;
        int choice;

        Party aParty = new Party();
        Scanner input = new Scanner(System.in);

        DinnerParty aDinnerParty = new DinnerParty();

        System.out.print("Enter The Number Of Guests For Party: ");
        guests = input.nextInt();

        aParty.setGuests(guests);

        System.out.println("The Party has " + aParty.getGuests() + " guests");

        aParty.displayInvitation();

        System.out.print("Enter The Number Of Guests For The Dinner Party: ");
        guests = input.nextInt();
        aDinnerParty.setGuests(guests);

        System.out.println("Enter The Menu Option -- 1 For Chicken or 2 For Beef or 3 For Salmon: ");
        choice = input.nextInt();
        aDinnerParty.setDinnerChoice(choice);

        System.out.println("The Dinner Party Has: " + aDinnerParty.getGuests() + " guests");

        System.out.println("Menu Option " + aDinnerParty.getDinnerChoice() + " Will be Served");

        aDinnerParty.displayInvitation();

        System.out.println(); // Space
    }

}
