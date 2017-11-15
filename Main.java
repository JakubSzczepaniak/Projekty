
package com.company;

        import javax.swing.*;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        String word;

        do {
            Map<String, String> dictionary = new HashMap<String, String>();

            dictionary.put("mama", "mother");
            dictionary.put("tata", "father");
            dictionary.put("pilka", "ball");
            dictionary.put("dom", "house");

            word = JOptionPane.showInputDialog(null, "Podaj slowo po polsku");


            if (dictionary.containsKey(word)) {
                JOptionPane.showMessageDialog(null,
                        "Slowo po angielsku to: " + dictionary.get(word));
            } else {
                JOptionPane.showMessageDialog(null, "Nie ma takiego słowa w słowniku");
            }
        } while (!word.equals("koniec"));


    }
}
