/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package london.rescumanager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.jni4net.Bridge;
import org.omg.CORBA.portable.ApplicationException;

/**
 *
 * @author Administrator
 */
public class RestartApp {

//    public void restartApplication() throws IOException {
//        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
//        final File currentJar = new File(/*UpdateReportElements.class.getProtectionDomain().getCodeSource().getLocation().toURI()*/"");
//
//        /* is it a jar file? */
//        if (!currentJar.getName().endsWith(".jar")) {
//            return;
//        }
//
//        /* Build command: java -jar application.jar */
//        final ArrayList<String> command = new ArrayList<String>();
//        command.add(javaBin);
//        command.add("-jar");
//        command.add(currentJar.getPath());
//
//        final ProcessBuilder builder = new ProcessBuilder(command);
//        builder.start();
//        System.exit(0);
//    }

//    public static void main(String[] args) throws IOException {
//        Bridge.init();
//        system.Console.WriteLine("Greetings from Java to .NET world!");
//    }

   public native void res();


}
