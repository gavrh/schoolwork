import java.util.Scanner;


public class Lab13 {

    public static String getPhoneNumber(String[] nameArr, String[] phoneNumberArr, String contactName, int arraySize) {
        String res = "";
        for (int i = 0; i < arraySize; i++) {
            if (contactName.equals(nameArr[i])) {
                res = phoneNumberArr[i];
                break;
            }
        }
        return res.equals("") ? "None" : res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int ARR_LENGTH = scnr.nextInt();
        String[] nameArr = new String[ARR_LENGTH];
        String[] phoneNumberArr = new String[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) {
            String contact = scnr.next();
            String name = "";
            String number = "";
            boolean nameDone = false;
            for (int j = 0; j < contact.length(); j++) {
                if (!nameDone) {
                    if (contact.charAt(j) == ',') {
                        nameDone = true;
                        continue;
                    } else {
                        name = name + contact.charAt(j);
                    }
                } else {
                    number = number + contact.charAt(j);
                }
            }
            nameArr[i] = name;
            phoneNumberArr[i] = number;
        }
        String contactName = scnr.next(); 
        scnr.close();

        String contactNum = getPhoneNumber(nameArr, phoneNumberArr, contactName, nameArr.length);
        System.out.println(contactNum);
    }
}
