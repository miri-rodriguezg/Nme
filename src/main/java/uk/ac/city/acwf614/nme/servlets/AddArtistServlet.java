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
import uk.ac.city.acwf614.nme.domain.Artist;
import static uk.ac.city.acwf614.nme.domain.Artist_.artistId;
import static uk.ac.city.acwf614.nme.domain.Artist_.artistName;
import static uk.ac.city.acwf614.nme.domain.Artist_.genre;
import static uk.ac.city.acwf614.nme.domain.Artist_.sales;

/**
 *
 * @author Miriam Rodriguez
 */
@WebServlet("/addArtist.html")
public class AddArtistServlet extends HttpServlet{
    
    private NmeRepository nme;

    @Inject
    public AddArtistServlet(NmeRepository nme) {
        this.nme = nme;       

    }
    
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        int artistId = Integer.parseInt(request.getParameter("artistId"));
        String artistName = request.getParameter("artistName");
        String genre = request.getParameter("genre");
        int sales = Integer.parseInt(request.getParameter("sales"));
        
        nme.addArtist(artistId, artistName, genre, sales);
        response.sendRedirect("addArtist.html");
    }
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        List<Artist> artists = nme.findAllArtists();
        request.setAttribute("artists", artists);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/addedArtist.jsp");
        requestDispatcher.forward(request, response);
    }
    

}
