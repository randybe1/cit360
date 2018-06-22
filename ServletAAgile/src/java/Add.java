/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        int i= Integer.parseInt(req.getParameter("t1"));
        int j= Integer.parseInt(req.getParameter("t2"));
        
        int k =i + j;
        
        PrintWriter out = res.getWriter();
        out.println(k);
        
    }
}