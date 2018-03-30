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
import static uk.ac.city.acwf614.nme.domain.Album_.albumId;
import uk.ac.city.acwf614.nme.domain.Track;

/**
 *
 * @author Miriam Rodriguez
 */
@WebServlet("/tracksByAlbum.html")
public class TracksByAlbumServlet extends HttpServlet{
    
    private NmeRepository nme;
    
    @Inject
    public TracksByAlbumServlet(NmeRepository nme) {
        this.nme = nme;
    }
    
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        
        int albumId = Integer.parseInt(request.getParameter("albumId"));
        List<Track> tracks = nme.findTracksOnAlbum(albumId);
        
        request.setAttribute("tracks", tracks);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/tracksOnAlbum.jsp");
        requestDispatcher.forward(request, response);
        
    }    
    
    
    
}
