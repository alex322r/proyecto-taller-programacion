import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

    String csvFilePath;
    private List<String[]> rows;

    public ReadCsv(String csvFilePath) {

        this.csvFilePath = csvFilePath;
        this.rows = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.csvFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                this.rows.add(cols);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public List <String[]> getRows() {
        return this.rows;
    }

    public void print() {
        for (String[] row : this.rows) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
