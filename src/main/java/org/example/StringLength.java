package org.example;

public class StringLength {

    private String str;

    public  StringLength(String str) {

        this.str = str;
    }

    public int length() {
        boolean flag = true;
        int i = 0;
        try {
            while (flag == true) {
                if (str.charAt(i) != '\0') {
                    i++;
                }
            }
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
