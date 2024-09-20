import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        for (String entry : PhoneList) {
            if (entry.contains(name)) {
                if (!entry.contains(phone)) {
                    PhoneList.remove(entry);
                    PhoneList.add(entry + " : " + phone);
                }
                return;
            }
        }
        PhoneList.add(name + " : " + phone);
    }

    @Override
    void removePhone(String name) {
        PhoneList.removeIf(entry -> entry.contains(name));
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            if (PhoneList.get(i).contains(name)) {
                PhoneList.set(i, name + " : " + newphone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (String entry : PhoneList) {
            if (entry.contains(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng này.");
    }

    @Override
    void sort() {
        Collections.sort(PhoneList, Comparator.comparing(entry -> entry.split(" : ")[0]));
    }
}