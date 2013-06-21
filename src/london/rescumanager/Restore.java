package london.rescumanager;

import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class Restore {

    public void restore1() throws IOException { // database dropping and creation
        String command1 = "C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\"
                + " mysql -uroot -pSLISHAN -e \"DROP DATABASE IF EXISTS testdb1; CREATE DATABASE testdb1\"";
        Runtime rt1 = Runtime.getRuntime();
        rt1.exec(command1);
        rt1.gc();

    }

    public void restore2(String filepath) throws IOException { //restoring from selected file
        System.out.println("" + filepath);
        String command2 = "C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\"
                + " mysql -uroot -pSLISHAN testdb1 < " + filepath;
        Runtime rt2 = Runtime.getRuntime();
        rt2.exec(command2);
        rt2.gc();
    }
}
