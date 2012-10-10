/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import Dao.DAOStudent;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author David
 */
@Stateless
@Path("/StudentLogIn")
public class LogInStudent {

    @GET
    public String LogInStudent(@QueryParam("Student") String usr, @QueryParam("Password") String passw) {
        DAOStudent DAOs = new DAOStudent();

        String rst = DAOs.LogInStudent(usr, passw);
        if (rst == null) {
            return "Invalid Student";
        }
        return rst;
    }
}