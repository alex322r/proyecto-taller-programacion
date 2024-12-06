import java.util.ArrayList;

public class Repository {

    int capacity = 300;
    private User[] usuarios;
    private String[] headers;


    public Repository(ArrayList<String[]> rows) {


        int rowLength = rows.getFirst().length;
        this.headers = rows.getFirst();
        this.usuarios = new User[capacity];

        for (int i = 1; i <= capacity; i++) {

            String[] row = rows.get(i);
            
            User user;
            String dni  = row[0];
            String primerApellido = row[1];
            String segundoApellido = row[2];
            String nombres = row[3];
            String codigoUbigeo = row[4];
            String departamento = row[5];
            String provincia = row[6];
            String distrito = row[7];


            // agregar usuario al array usuarios

            user = new User( dni ,primerApellido, segundoApellido, nombres, codigoUbigeo, departamento, provincia, distrito);
            usuarios[i-1] = user;

        }

    }




    public String[] getHeaders() {
        return this.headers;
    }

    public User[] getUsuarios() {
        return this.usuarios;
    }
}
