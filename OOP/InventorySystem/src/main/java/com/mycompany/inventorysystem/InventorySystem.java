//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.inventorysystem;
import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<item> listItem = new ArrayList<>();

        while (true) {
            System.out.println("\nHome Inventory System");
            System.out.println("1.Add Item");
            System.out.println("2.Delete Item by Name");
            System.out.println("3.Update Item by Name");
            System.out.println("4.Search Item by Name");
            System.out.println("5.list items that are about to expire by 7 days.");
            System.out.println("6.Exit");
            System.out.print("Choose an option: ");

            int choice;
            choice = in.nextInt();
            if (choice == 1) {
                item it;
                date exp = null;
                System.out.print("Enter item name: ");
                String name = in.next();
                int month, day, year;
                System.out.print("Enter purchase date (M-D-Y): ");

                while (true) {
                    System.out.print("Month (1-12): ");
                    month = in.nextInt();
                    if (month >= 1 && month <= 12) {
                        break;
                    }
                    System.out.println("Invalid month. Please try again.");
                }

                while (true) {
                    System.out.print("Day (1-30): ");
                    day = in.nextInt();
                    if (day >= 1 && day <= 30) {
                        break;
                    }
                    System.out.println("Invalid day. Please try again.");
                }
                System.out.print("Year: ");
                year = in.nextInt();
                date purc = new date(year, month, day);
                System.out.print("Has expiry date ? (yes/no):");
                String temp = in.next();
                if (temp.equals("yes")) {
                    System.out.print("Enter expiry date (M-D-Y): ");
                    while (true) {
                        System.out.print("Month (1-12): ");
                        month = in.nextInt();
                        if (month >= 1 && month <= 12) {
                            break;
                        }
                        System.out.println("Invalid month. Please try again.");
                    }

                    while (true) {
                        System.out.print("Day (1-30): ");
                        day = in.nextInt();
                        if (day >= 1 && day <= 30) {
                            break;
                        }
                        System.out.println("Invalid day. Please try again.");
                    }

                    System.out.print("Year: ");
                    year = in.nextInt();
                    exp = new date(year, month, day);
                }
                System.out.print("Enter type: ");
                String type = in.next();
                listItem.add(new item(name, type, purc, exp));
                System.out.println("Item has been added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter the item name to delete: ");
                String name = in.next();
                boolean found = false;
                for (item s : listItem) {
                    if (s.getName().equals(name)) {
                        System.out.println("Item found: " + s.infoItem());
                        found = true;
                        listItem.remove(s);
                        System.out.println("Item deleted successfully.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter the item name to update: ");
                String name = in.next();
                boolean found = false;
                for (item s : listItem) {
                    if (s.getName().equals(name)) {
                        System.out.print("Item found: " + s.infoItem());
                        found = true;
                        while (true) {
                            System.out.println("\nWhat do you want to update?");
                            System.out.println("1.Update name");
                            System.out.println("2.Update type");
                            System.out.println("3.Update purchase date");
                            System.out.println("4.Update expiry date");
                            System.out.println("5.Back to main menu");
                            System.out.print("Choose an option: ");
                            int update;
                            update = in.nextInt();
                            if (update == 1) {
                                System.out.print("Enter new name: ");
                                String newName = in.next();
                                String oldName = s.getName();
                                s.setName(newName);
                                System.out.println("Name updated from " + oldName + " to " + newName);
                            } else if (update == 2) {
                                System.out.print("Enter new type: ");
                                String newType = in.next();
                                String oldType = s.getType();
                                s.setType(newType);
                                System.out.println("Type updated from " + oldType + " to " + newType);
                            } else if (update == 3) {
                                System.out.print("Enter new purchase date (M-D-Y): ");
                                int day, month, year;
                                while (true) {
                                    System.out.print("Month (1-12): ");
                                    month = in.nextInt();
                                    if (month >= 1 && month <= 12) {
                                        break;
                                    }
                                    System.out.println("Invalid month. Please try again.");
                                }

                                while (true) {
                                    System.out.print("Day (1-30): ");
                                    day = in.nextInt();
                                    if (day >= 1 && day <= 30) {
                                        break;
                                    }
                                    System.out.println("Invalid day. Please try again.");
                                }

                                System.out.print("Year: ");
                                year = in.nextInt();
                                String oldDate = s.getDatePurchased().infoDate();
                                date d = new date(year, month, day);
                                s.setDatePurchased(d);
                                System.out.println("Purchase date updated from " + oldDate + " to " + d.infoDate());
                            } else if (update == 4) {
                                System.out.print("Enter new expiry date (M-D-Y): ");
                                int day, month, year;
                                while (true) {
                                    System.out.print("Month (1-12): ");
                                    month = in.nextInt();
                                    if (month >= 1 && month <= 12) {
                                        break;
                                    }
                                    System.out.println("Invalid month. Please try again.");
                                }

                                while (true) {
                                    System.out.print("Day (1-30): ");
                                    day = in.nextInt();
                                    if (day >= 1 && day <= 30) {
                                        break;
                                    }
                                    System.out.println("Invalid day. Please try again.");
                                }
                                System.out.print("Year: ");
                                year = in.nextInt();
                                String oldDate = s.getExpiryDate().infoDate();
                                date d = new date(year, month, day);
                                s.setExpiryDate(d);
                                System.out.println("Expiry date updated from " + oldDate + " to " + d.infoDate());
                            } else if (update == 5) {
                                break;
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                    }
                }
                if (!found) {
                    System.out.println("Item not found.");
                    break;
                }
            } else if (choice == 4) {
                System.out.print("Enter the name: ");
                String name = in.next();

                boolean found = false;
                for (item s : listItem) {
                    if (s.getName().equals(name)) {
                        System.out.print("Item found: " + s.infoItem());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found.");
                    break;
                }
            } else if (choice == 5) {
                date currDate = new date();
                boolean found = false;
                int x = currDate.getCurrYear() * 365 + currDate.getCurrMonth() * 30 + currDate.getCurrDay();
                for (item s : listItem) {
                    if (s.getExpiryDate() != null) {
                        int y = s.getExpiryDate().getYear() * 365 + s.getExpiryDate().getMonth() * 30
                                + s.getExpiryDate().getDay();
                        int res = y - x;
                        if (res >= 0 && res <= 7) {
                            System.out.print(s.infoItem());
                            found = true;
                        }
                    }
                }
                if (!found) {
                    System.out.println("No items expiring in the next 7 days.");
                }
            } else if (choice == 6) {
                System.out.println("bye!");
                return;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
