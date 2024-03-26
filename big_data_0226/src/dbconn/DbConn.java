package dbconn;

import java.sql.*;

public class DbConn {
    public void selectAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            // 오라클 드라이버 사용
//            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 자기 주소의 db user 와 비밀번호로 접근
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT","1234");

            stmt = conn.createStatement();
            String query = "SELECT * FROM emp";

            // SELECT -> executeQuery() 사용
            rs = stmt.executeQuery(query);

            // 쿼리문 사용 시 나오는 테이블 모양대로 반복문을 통해 모든 데이터 출력
            while(rs.next()) {
                int empNo = rs.getInt("EMPNO");
                String empName = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                // Date import 대상은 util 패키지가아닌 sql 패키지 해야함
                Date hireDate = rs.getDate("HIREDATE");
                int sal = rs.getInt("SAL");
                int comm = rs.getInt("COMM");
                int deptNo = rs.getInt("DEPTNO");

                // 출력
                System.out.println(empNo + ", " + empName + ", " + job + ", " + mgr + ", " + hireDate + ", " + sal + ", " + comm
                        + ", " + deptNo);
            }
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // db 사용 후에는 항상 닫아줘야함.
            try{
                rs.close();
                stmt.close();
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
