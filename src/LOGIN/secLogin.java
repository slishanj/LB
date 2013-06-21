///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package LOGIN;
//
//import Connection.jdbc;
//import jBCrypt.BCrypt;
//import java.sql.ResultSet;
//import java.sql.Timestamp;
//import java.util.Date;
//
///**
// *
// * @author Administrator
// */
//public class secLogin {
//
//    public secLogin() {
//        //  testingcrypt();
//    }
//
//    /*
//     * You shouldn't use md5 for password hashing. It's built for speed which makes it easier to attack. Use bcrypt instead. Also, you're not supposed to try to decrypt the password after it has been stored. See the examples on the bcrypt page for how to verify a password from user input. More information on how to store passwords safely.
//
//     jBcrypt is real simple to use too. Here's how you hash a password:
//
//     BCrypt.hashpw(password_from_user, BCrypt.gensalt());
//     And to verify it:
//
//     BCrypt.checkpw(password_from_user, hashed_password_from_database)
//
//     Can you explain why not use md5 or sha1 since that's a common way to do it? – JOTN Dec 14 '10 at 20:17
//     The last link explains it all. – dagge Dec 14 '10 at 20:27
//     That only works until someone makes a fastbcrypt like what happened to the old Unix hash algorithm. – JOTN Dec 14 '10 at 20:32
//     @JOTN that makes no sense. bcrypt is designed to be slow, and it's slowness is designed to be adaptable – matt b Dec 14 '10 at 20:36
//     The old Unix crypt was also designed to be slow for the same reason. Someone then came up with fastcrypt that produced the same results much faster. The left a lot of systems open to hacks because the crypted values could be accessed by any user. Why protect them if they cannot be brute force attacked in a reasonable amount of time? – JOTN Dec 14 '10 at 20:50
//     *
//     *
//     * ********************************API--http://www.mindrot.org/projects/jBCrypt/*******************
//     * // Hash a password for the first time
//     String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
//
//     // gensalt's log_rounds parameter determines the complexity
//     // the work factor is 2**log_rounds, and the default is 10
//     String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
//
//     // Check that an unencrypted password matches one that has
//     // previously been hashed
//     if (BCrypt.checkpw(candidate, hashed))
//     System.out.println("It matches");
//     else
//     System.out.println("It does not match");
//     * *************************************************************************
//     *
//     *
//     */
//    final void testingcrypt() {
//        try {
//            //----------first time recording password
//            String hashed = BCrypt.hashpw("boyboy", BCrypt.gensalt(16));
//
////            jdbc.con().createStatement().executeUpdate("insert into users(name,username,password)"
////                    + " values('test1','crypt1','" + hashed + "') ");
//            System.out.println(hashed);
//        } catch (Exception ex) {
//            System.out.println("error at insert of crypt" + ex);
//        }
//    }
//
//    final void checkcrypt() {
//        try {
//            //-------checking a recorded password---------
//            ResultSet checkc = jdbc.con().createStatement().executeQuery("select * from users where uid='8'");
//            checkc.first();
//
//            if (BCrypt.checkpw("allhailcrypting", checkc.getString("password"))) {
//                System.out.println("good to go");
//            }else{
//                System.out.println("error at checking");
//            }
//
//        } catch (Exception ex) {
//            System.out.println("checking error" + ex);
//        }
//    }
//
//    public static void main(String[] args) {
//        //new secLogin().testingcrypt();
//        //new secLogin().checkcrypt();
//        Timestamp out_time = new Timestamp(new Date().getTime());
//        new Date().
//        System.out.println(out_time);
//    }
//}
