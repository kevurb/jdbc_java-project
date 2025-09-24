import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection myConection = null;
        Statement myStamt = null; //para consulta nada mas
        PreparedStatement myStamt2 = null;
        ResultSet myRes = null;
        String url = "jdbc:postgresql://localhost:5433/descuentosapp";
        String user = "postgres";
        String pssd = "1234KostOne1-";
        try {
            myConection = DriverManager.getConnection(url, user, pssd);
            System.out.println("SE CONECTO");
            // 1.lectura de datos en la db
            //myStamt = myConection.createStatement();//prepara la conection
            //myRes= myStamt.executeQuery("SELECT * FROM precios.objetos");{
            //            while (myRes.next()){
//                System.out.println(myRes.getString("id_objeto"));// procesa resultados
//            }
            // 2.escritura de datos en la db
//            String insercion= ("INSERT INTO precios.objetos  (id_objeto, nombre_objeto,precio_objeto) VALUES (?,?,?)");
//            myStamt2 = myConection.prepareStatement(insercion);
//            myStamt2.setInt(1,3);
//            myStamt2.setString(2,"mouse");
//            myStamt2.setString(3,"2555");
//            int rowsAffected = myStamt2.executeUpdate();
//            if  (rowsAffected>0){
//                System.out.println("Se ha realizado un cambio");
//            }

            // 3. CRUD UPDATE DATO
            myStamt = myConection.createStatement();
            int rowsAffected = myStamt.executeUpdate("UPDATE precios.objetos " + "SET precio_objeto='10000' " + "WHERE id_objeto = 3");
            if  (rowsAffected>0){
                System.out.println("Se ha realizado un cambio");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }}