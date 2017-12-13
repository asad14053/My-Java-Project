/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import databasePackage.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Md alamin hossain
 */
public class MainClass {

    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();
//        connection.createStatement().execute("create table contactlist(name varchar(20), phone varchar(20), email varchar(30), address varchar(40))");
        ResultSet rs = connection.createStatement().executeQuery("select *from contactlist");
        while (rs.next()) {
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }
//        connection.createStatement().execute("insert into contactlist values ('Indro','01738020589','mamun@gmail.com','Bogra')");
    }
}
