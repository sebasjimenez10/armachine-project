/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import connection.DbConnection;

/**
 *
 * @author David
 */
public class DAOTest {
    
    public String registryTest(String idProfessor, String testName, String testDescription, String testDate){
        
    String resultado = "El Registro no se pudo realizar";
    String query = "INSERT INTO Test(idProfessor, nameTest,descriptionTest,dateTest) VALUES (\""+idProfessor+"\",\""+testName+"\",\""+testDescription+"\",\""+testDate+"\")";
        System.out.println("La Sentencia es : "+query);
        
        DbConnection db = new DbConnection();
        int rs = db.runSqlUpdate(query);
        
        if(rs != 0){
            resultado = "Registro de Test Completo";
        }
    return resultado;
    }
}