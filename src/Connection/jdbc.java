package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author joshua
 */
public class jdbc {

    static String url = "jdbc:mysql://localhost:3306/LB";

    public static Connection con() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conc = DriverManager.getConnection(url, "root", "SLISHAN");
        return conc;
    }

    public void putdata(String sql) throws Exception {
        Connection conc = con();
        Statement st = conc.createStatement();
        st.executeUpdate(sql);
        //conc = null;
    }

    public ResultSet getdata(String sql) throws Exception {
        Statement st = con().createStatement();
        ResultSet rset = st.executeQuery(sql);
        return rset;
    }
}
