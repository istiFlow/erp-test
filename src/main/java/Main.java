import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Vehicle> list = new ArrayList<>();
    private static final File FOLDER = new File("Datas");

    public static void main(String[] args) {
        WorkWithJson workWithJson = new WorkWithJson();
        workWithJson.findJson(".*\\.dat", FOLDER, list);
        threading(list);
    }

    private static void threading(List list) {
        try {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < list.size(); ++i) {
                        System.out.println(list.get(i));
                        try {
                            Thread.sleep(2000);
                            continue;
                        } catch (InterruptedException e) {

                        }

                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < list.size(); ++i) {
                            System.out.println("A program fut és dolgozik.");
                            Thread.sleep(1000);

                        }
                    } catch (InterruptedException e) {
                        ;
                    }
                }
            });
            t2.start();
            t1.start();
            t2.join();
            t1.join();
            System.out.println("Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




