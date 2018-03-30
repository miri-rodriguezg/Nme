/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf614.nme.servlets;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acwf614.nme.dao.NmeRepository;
import uk.ac.city.acwf614.nme.domain.Album;

/**
 *
 * @author Miriam Rodriguez
 */
@WebServlet("/albumList.html")
public class AlbumListServlet extends HttpServlet {
    
    private NmeRepository nme;
    
    @Inject
    public AlbumListServlet(NmeRepository nme) {
        this.nme = nme;
    } 
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        List<Album> albums = nme.findAllAlbums();
        
        request.setAttribute("albums", albums);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/albumList.jsp");
        requestDispatcher.forward(request, response);    
    
    }
}