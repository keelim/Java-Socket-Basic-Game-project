package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class practice {
    private static Connection con = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;
    private static String sql = null;
    private DBConnectionMgr pool;

    public practice() {
        pool = DBConnectionMgr.getInstance();
    }

//    public boolean call() {
//        boolean flag = false;
//        String getPass;
//
//
//        try {
//            con = pool.getConnection();
//            sql = "select PW from user where ID=?";
//            pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, ID);
//            rs = pstmt.executeQuery();
//            if (rs.next()) {
//                // 패스워드를 읽어온다.
//                getPass = rs.getString("PW");
//                // 데이터베이스에서 읽어온 문자열과 사용자가 입력한 비밀번호가 같을 경우에는
//                if (getPass.equals(PW)) {
////					System.out.println("받아온 비밀번호 :" + getPass); --> 비밀 번호를 확인을 하는 핸들러
//                    flag = true;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 자원반납
//            pool.freeConnection(con, pstmt, rs);
//        }
//        return flag; //결과값 리터
//    }
}
