package addressbook.repo;

import addressbook.model.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class AddressBook {

    private final List<Model> entries;

    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    public boolean addEntry(Model model) {
        if (this.entries.contains(model)) {
            System.out.println("Another entry already exists with the same email address.\n");
            return false;
        }
        this.entries.add(model);
        System.out.println("New entry added.\n");
        return true;
    }

    public boolean removeEntry(String email) {
        int index = getEntryIndexByEmail(email);

        if (index == -1) {
            System.out.println("No entries found with that email.\n");
            return false;
        }

        this.entries.remove(index);
        System.out.println("Entry has successfully been removed.\n");
        return true;
    }

    public int getEntryIndexByEmail(String email) {
        for (int i = 0; i < this.entries.size(); i++) {
            if (this.entries.get(i).getEmail().equals(email)) {
                return i;
            }
        }
        return -1;
    }

    public List<Model> searchForAnEntry(String searchType, String searchQuery) {
        searchQuery = searchQuery.strip();
        if (searchType.equals("firstName")) {
            return searchByFirstName(searchQuery);
        } else if (searchType.equals("lastName")) {
            return searchByLastName(searchQuery);
        } else if (searchType.equals("phone")) {
            return searchByPhone(searchQuery);
        } else {
            return searchByEmail(searchQuery);
        }
    }

    private List<Model> searchByFirstName(String firstName) {
        List<Model> ans = new ArrayList<>();
        for (Model model : this.entries) {
            if (model.getFirstName().contains(firstName)) {
                ans.add(model);
            }
        }
        return ans;
    }

    private List<Model> searchByLastName(String lastName) {
        List<Model> ans = new ArrayList<>();
        for (Model model : this.entries) {
            if (model.getLastName().contains(lastName)) {
                ans.add(model);
            }
        }
        return ans;
    }

    private List<Model> searchByPhone(String phone) {
        List<Model> ans = new ArrayList<>();
        for (Model model : this.entries) {
            if (model.getPhone().contains(phone)) {
                ans.add(model);
            }
        }
        return ans;
    }

    private List<Model> searchByEmail(String email) {
        for (Model model : this.entries) {
            if (model.getEmail().equals(email)) {
                return Arrays.asList(model);
            }
        }
        return new ArrayList<>();
    }

    public void printAddressBook() {
        if (this.entries.size() == 0) System.out.println("The Address Book is currently empty.");
        else {
            System.out.println("Printing all contacts stored within the Address Book:");
            System.out.println(this);
        }
        System.out.println();
    }

    public void deleteAddressBook() {
        this.entries.clear();
        System.out.println("The Address Book has been cleared.\n");
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");
        for (Model model : this.entries) {
            sj.add(model.toString());
        }
        return sj.toString();
    }
}
