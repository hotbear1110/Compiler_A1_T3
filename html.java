import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class html {

    static StringBuilder content = new StringBuilder("<!DOCTYPE html>\n" +
            "<html><head><title> helloworld</title>\n" +
            "<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n" +
            "<script type=\"text/javascript\" id=\"MathJax-script\"\n" +
            "async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n\n" +
            "</script></head><body>\n");

    public void create() {
        try {
            File htmlFile = new File("index.html");
            if (htmlFile.createNewFile()) {
                System.out.println("File created: " + htmlFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            content.append("\n</body></html>");

            FileWriter myWriter = new FileWriter("index.html");
            myWriter.write(String.valueOf(content));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void write(String newContent) {
        content.append(newContent);
    }


}
