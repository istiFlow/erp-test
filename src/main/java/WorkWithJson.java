import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class WorkWithJson {

    Gson gson = new Gson();

    public void findJson(final String pattern, final File folder, List<Vehicle> list) {
        try {
            for (final File f : folder.listFiles()) {
                if (f.isDirectory()) {
                    findJson(pattern, f, list);
                }
                if (f.isFile()) {
                    if (f.getName().matches(pattern)) {
                        if (f.getName().startsWith("A")) {
                            Car car = gson.fromJson(new FileReader(f.getAbsolutePath()), Car.class);
                            list.add(car);
                        } else {
                            Bike bike = gson.fromJson(new FileReader(f.getAbsolutePath()), Bike.class);
                            list.add(bike);
                        }
                    }
                }
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
