package pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String name) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + name + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + name + "</h1>");
        writer.write("\n");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
        writer.write("\n");
    }

    public void link(String food) throws IOException {
        paragraph(food);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
