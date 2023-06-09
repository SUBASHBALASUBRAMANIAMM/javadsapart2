import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
               try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","0000");
                   System.out.println(conn);
               }catch (SQLException e){
                   throw new RuntimeException();
               }

               String query = "insert into transactions(transaction_amount,customer_id)  values(?,?)";
               try{
                   PreparedStatement st = conn.prepareStatement(query);
                   st.setInt(1,400);
                   st.setInt(2,3);
                   st.execute();
//                    while(rs.next()){
//                        System.out.println("hi");
//                    }

               }catch (SQLException e){
                   throw new RuntimeException();
               }



    }
}