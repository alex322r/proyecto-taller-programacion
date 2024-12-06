import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHtmlReport {


    String htmlFilePath;

    public GenerateHtmlReport(String[] headers, User[] users)  {


        this.htmlFilePath = "reporte.html";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFilePath))) {
            bw.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Reporte</title>\n<meta charset=\"UTF-8\">\n</head>\n<body>\n");
            bw.write("<h1>Reporte generado desde CSV</h1>\n");
            bw.write("<table border='1'>\n");
            bw.write("<tr>\n");
            bw.write("<th>numero</th>");
            for (int i = 0; i < headers.length; i++) {
                bw.write("<th>" +headers[i] + "</th>");
            }
            bw.write("\n</tr>\n");


            int index = 1;
            for (User user : users) {
                bw.write("<tr>\n");
                bw.write("<td>" + index + "</td>");
                bw.write("<td>" + user.getDni() + "</td>" );
                bw.write("<td>" + user.getPrimerApellido() + "</td>" );
                bw.write("<td>" + user.getSegundoApellido() + "</td>" );
                bw.write("<td>" + user.getNombres() + "</td>" );
                bw.write("<td>" + user.getCodigoUbigeo() + "</td>" );
                bw.write("<td>" + user.getDepartamento() + "</td>" );
                bw.write("<td>" + user.getProvincia() + "</td>" );
                bw.write("<td>" + user.getDistrito() + "</td>\n" );
                bw.write("</tr>\n");
                index++;
            }
            bw.write("</table>\n");
            bw.write("</body>\n</html>");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
