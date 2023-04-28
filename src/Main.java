import Run.CollectionManager;
import Run.Executor;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        CollectionManager manager = new CollectionManager();
        if(args.length == 0){
            System.out.println("Specify file as argument");
        }
        else {
            manager.fill_from_file(Path.of(args[0]));
            Executor exec = new Executor(manager);
            exec.interactiveMod();
        }
    }
}
