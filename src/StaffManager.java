import java.util.Scanner;

public class StaffManager {
    StaffMember[] staffMembers = new StaffMember[100];
    Scanner scanner = new Scanner(System.in);
    public void showSubMenu()
    {
        do {
            System.out.println("———————————————————"+"\n\tStaff submenu:");
            System.out.println("1. View All Staff");
            System.out.println("2. Add Staff Member");
            System.out.println("3. Edit Staff Member");
            System.out.println("4. Delete Staff Member");
            System.out.println("5. Search Staff");
            System.out.println("6. Back to Main Menu");
            System.out.print("———————————————————");
        } while (selectSubMenu());
    }
    boolean selectSubMenu()
    {
        switch (MyUtils.selectChoice(6))
        {
            case 1:
                viewAllStaff();
                break;
            case 2:
                addStaffMember();
                break;
            case 3:
                break;
            case 4:
                deleteStaffMember();
                break;
            case 5:
                break;
            case 6:
                return false;
        }
        return true;
    }
    void viewAllStaff()
    {
        System.out.println("———————————————————"+"\nAll Staff Members");
        if(StaffMember.staffSize == 0)
        {
            System.out.println("No staff members found.");
        }else {
            System.out.println("\nNo. | Name                    | Role");
            System.out.println("----+-------------------------+-------------------------");
            for (int i = 0; i < StaffMember.staffSize; i++) {
                if(staffMembers[i] != null)
                {
                    System.out.printf("%-3d | %-23s | %-23s\n",
                            (i + 1), staffMembers[i].name, staffMembers[i].role);
                }
            }
        }
    }
    void addStaffMember()
    {
        if (StaffMember.staffSize == 100)
        {
            System.out.println("Your staff is full");
        } else{
            System.out.print("Add staff's name (or type X to cancel): ");
            String newStaffName = scanner.nextLine();
            if (newStaffName.equalsIgnoreCase("x"))
            {
                return;
            }
            System.out.print("Add staff's role (or type X to cancel): ");
            String newStaffRole = scanner.nextLine();
            if (newStaffRole.equalsIgnoreCase("x"))
            {
                return;
            }
            System.out.print("Are you sure? (y/n): ");
            String choiceValidation = scanner.nextLine();
            if (choiceValidation.equalsIgnoreCase("y") || choiceValidation.equalsIgnoreCase("yes"))
            {
                staffMembers[StaffMember.staffSize] = new StaffMember(newStaffName,  newStaffRole);
                StaffMember.staffSize++;
                System.out.println("Staff member added successfully!");
            } else {
                System.out.println("Invalid choice or user moved back");
                return;
            }
        }
    }
    void deleteStaffMember()
    {
        if (StaffMember.staffSize == 0) {
            System.out.println("No staff member found to DELETE");
            return;
        }

        viewAllStaff();
        int staffIndex = MyUtils.selectChoice(StaffMember.staffSize) - 1;

        System.out.println("You can type X to go back");

        for (int i = staffIndex; i < StaffMember.staffSize - 1; i++) {
            staffMembers[i] = staffMembers[i + 1];
        }

        staffMembers[StaffMember.staffSize - 1] = null;
        StaffMember.staffSize--;

        System.out.println("Staff member removed successfully!");
    }
}
