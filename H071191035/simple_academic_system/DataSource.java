import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
/**
 * DataSource
 */
public class DataSource {

    private static DataSource dataSource;
    private HashMap<String, User> userMapMahasiswa = new HashMap<>();
    private HashMap<String, User> userMapDosen = new HashMap<>();
    private HashMap<Integer, Mahasiswa> mahasiswaMap = new HashMap<>();
    private HashMap<Integer, DosenPa> dosenPaMap = new HashMap<>();

    // getter
    public User getUser(String key) {
        return userMapMahasiswa.get(key);
    }
    
    public Mahasiswa getMahasiswa(int key) {
        return mahasiswaMap.get(key);
    }

    public User getUserDosen(String key) {
        return userMapDosen.get(key);
    }

    public DosenPa getDosenPa(int key) {
        return dosenPaMap.get(key);
    }

    // untuk mengecek apakah String yang diberikan merupakan integer
    public static boolean isInt(String str) {

        boolean isInt = false;
        
        try {
            Integer.parseInt(str);
            isInt = true;
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
        return isInt;
    }

    // baca tulis file untuk data user mahasiswa
    private void putUserMahasiswa() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
        String data[];

        while(reader.ready()) {
            
            data = reader.readLine().split(";");

            if (isInt(data[0])) {
                userMapMahasiswa.put(data[1], new User(Integer.valueOf(data[0]), data[1], data[2], mahasiswaMap.get(Integer.valueOf(data[0]))));
            }
        }

        data = null;
        reader.close();

    }

}