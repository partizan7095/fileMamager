package fileManager;

import java.io.File;
import java.util.*;

public class DirectoryManager implements ManagerInterface {

    @Override
    public void readDirectory(String pathName) {
        ArrayList<File> listDir = new ArrayList<>();
        listDir.add(0, new File(pathName));

        for (int i = 0; i < listDir.size(); i++) {
            File file = new File(String.valueOf(listDir.get(i)));

            if(file.isDirectory()) {
                System.out.println("-----------------------" + file.getPath() + "-----------------------");

                for(File item : Objects.requireNonNull(file.listFiles())){

                    if(item.isDirectory()){
                        System.out.println(item.getName() + "  \t folder");
                        listDir.add(item);
                    }
                    else{System.out.println(item.getName() + "\t file");}
                }
                System.out.println("");
            }
        }
    }
}
