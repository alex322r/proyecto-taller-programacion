import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReadCsv readCsv = new ReadCsv("datos.csv");
        Repository rp = new Repository(readCsv.getRows());
        String[] headers = rp.getHeaders();


        User[] users = rp.getUsuarios();


        //readCsv.print();

        GenerateHtmlReport gn = new GenerateHtmlReport(headers, users);

        Server server = new Server();

        try {
            server.startServer();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }







}