package danillo.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        String language = currentLocale.getDisplayLanguage();
        System.out.println("A linguagem do sistema é " + language + ".");
    }
}
