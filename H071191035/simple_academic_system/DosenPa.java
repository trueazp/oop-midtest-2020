/**
 * DosenPa
 */
public class DosenPa {

    private int id;
    private String namaDosen;
    private String noTelp;
    private String email;

    // constructor
    DosenPa(int id, String namaDosen, String noTelp, String email) {
        this.id = id;
        this.namaDosen = namaDosen;
        this.noTelp = noTelp;
        this.email = email;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getEmail() {
        return email;
    }

}