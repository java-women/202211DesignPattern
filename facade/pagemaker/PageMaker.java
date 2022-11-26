package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String name, String filename) {
        try {
            Properties foodprop = Database.getProperties("food");
            String food = foodprop.getProperty(name);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(name + "'s web page");
            writer.paragraph("Welcome to " + name + "'s web page!");
            // writer.mailto(name, username);
            writer.paragraph("好きな食べ物は" + food);
            writer.close();
            System.out.println(filename + " is created for " + name + " (" + food + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
