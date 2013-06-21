/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package london.rescumanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BackUp {

    public void backUp() throws IOException {

        FileWriter fw = null;

        Date d0 = new Date();
        String yyyy = d0.toString().split(" ")[5];
        String mm = d0.toString().split(" ")[1];
        String dd = d0.toString().split(" ")[2];
        
        String path = "C:\\Backup"+dd+mm+yyyy+".sql";
        String dumpCommand = "C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\mysqldump -u root -pSLISHAN lb --result-file=" + path;

        File data = new File(path);


        try {
            fw = new FileWriter(data);
            fw.close();
            System.out.println("fileWriter Closed");

            Runtime rt = Runtime.getRuntime();


            Process proc = rt.exec(dumpCommand);

            InputStream in = proc.getInputStream();

            InputStreamReader read = new InputStreamReader(in, "latin1");

            BufferedReader br = new BufferedReader(read);

            BufferedWriter bw = new BufferedWriter(new FileWriter(data, true));

            String line = null;

            StringBuilder buffer = new StringBuilder();

            while ((line = br.readLine()) != null) {
                buffer.append(line + "\n");
            }

            String toWrite = buffer.toString();

            bw.write(toWrite);

            bw.close();

            System.out.println("BufferedWriter closed");

            br.close();

            System.out.println("BufferedReader closed");
            
            

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    /*
     * Success message.
     * shows a message dialog of successfull backup activity.
     */
    public static void msg(){
        RescueManager rcm = new RescueManager();
        rcm.msg("Database BackUp Successfull!\n You can find the backup file in your C: drive with today's date");
        
    }
    public static void main(String[] args) throws IOException {
        BackUp backUp = new BackUp();
        backUp.backUp();
    }
}
