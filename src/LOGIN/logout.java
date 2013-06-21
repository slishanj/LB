/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

import Connection.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class logout {

    public void log() {
        ResultSet r2 = null;
        try {
            String d = new Date().toString();
            int y = new Date().getYear() + 1900;
            int m = new Date().getMonth() + 1;
            String da = d.split(" ")[2];
            String date = y + "-" + m + "-" + da;

            String s = " " + d.split(" ")[3];
//            ResultSet r = jdbc.con().createStatement()
//                    .executeQuery("SELECT * from users WHERE username='" + this.getTitle().split("::")[1].toString() + "'");
            r2 = jdbc.con().createStatement()
                    .executeQuery("SELECT * from login_sessions order by idlogin_sessions desc limit 1");
            if (r2.first()) {
                jdbc.con().createStatement().executeUpdate("update login_sessions "
                        + " set logoutAt='" + date + s + "' "
                        + " where idlogin_sessions='" + r2.getInt("idlogin_sessions") + "' ");
            }
        } catch (Exception ex) {
            System.out.println("" + ex);
        } finally {
            try {
                if (r2 != null) {
                    r2.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
