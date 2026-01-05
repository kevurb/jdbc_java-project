import java.sql.*;
//import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection myConection = null;
        Statement myStamt = null; //para consulta nada mas
        PreparedStatement myStamt2 = null;
        ResultSet myRes = null;


        String  url =
        String user =
        String pssd =

        try {
            myConection = DriverManager.getConnection(url, user, pssd);
            System.out.println("SE CONECTO");
            // 1.lectura de datos en la db
//           myStamt = myConection.createStatement();//prepara la conection
//            myRes = myStamt.executeQuery("SELECT iddocumento_pagare FROM DECV_PAGARES.documento_pagare where iddocumento_pagare =15");
//            System.out.println("YA SE EJEUTO");
//                while (myRes.next()) {
//                    System.out.println(myRes.getInt("iddocumento_pagare"));// procesa resultados
//                }


            // 2.escritura de datos en la db
//            myStamt2 = myConn.createStatement();
//            String insercion= ("INSERT INTO decv_pagares.configuracion_entidad  (fk_codigo_depositante, portal_firma, email, modifica_girador) VALUES (?,?,?,?)");
//            myStamt2 = myConection.prepareStatement(insercion);
//            myStamt2.setString(1,"COBKE");
//            myStamt2.setInt(2,1);
//            myStamt2.setInt(3,1);
//            myStamt2.setInt(4,1);
//            int rowsAffected = myStamt2.executeUpdate();
//
//            if  (rowsAffected>0){
//                System.out.println("Se ha realizado un cambio");
//            }


            // 3. CRUD UPDATE DATO
//            myStamt = myConection.createStatement();
//            int rowsAffected = myStamt.executeUpdate("UPDATE decv_pagares.configuracion_entidad " + "SET fk_codigo_depositante='COB999' " + "WHERE idconfiguracion_entidad =888 ");
//            if  (rowsAffected>0){
//                System.out.println("Se ha realizado un cambio");
//            }
          // 4. DELETE DATO
            myStamt = myConection.createStatement();
            int rowsAffected = myStamt.executeUpdate("DELETE FROM decv_pagares.configuracion_entidad"+ " WHERE idconfiguracion_entidad =888 ");
            if  (rowsAffected>0){
                System.out.println("Se ha realizado un cambio");
            }
            myRes = myStamt.executeQuery("Select * from decv_pagares.configuracion_entidad where idconfiguracion_entidad =888");

            while(myRes.next()){
                System.out.println(myRes.getInt("idconfiguracion_entidad"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }}