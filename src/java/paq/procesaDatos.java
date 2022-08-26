package paq;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesaDatos", urlPatterns = {"/procesaDatos"})
public class procesaDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nombre = request.getParameter("nombre");
        String genero = request.getParameter("genero");
        Double estatura = Double.parseDouble(request.getParameter("estatura"));
        Double peso = Double.parseDouble(request.getParameter("peso"));
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        double imc = calculaIMC(estatura, peso);
        double tasa = calculaTasaMet(genero, estatura, peso, edad);

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet procesaDatos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Estimado " + nombre + " tu estado de salud es:</h2>");
            out.println("<h2>Tu indice de masa corporal " + imc + "</h2>");
            out.println("<h2>Tu tasa metabólica " + tasa + "</h2>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static double calculaIMC(double estatura, double peso) {
        pe.company.ws.ServicioNutricionista_Service service = new pe.company.ws.ServicioNutricionista_Service();
        pe.company.ws.ServicioNutricionista port = service.getServicioNutricionistaPort();
        return port.calculaIMC(estatura, peso);
    }

    private static double calculaTasaMet(java.lang.String genero, double estatura, double peso, int edad) {
        pe.company.ws.ServicioNutricionista_Service service = new pe.company.ws.ServicioNutricionista_Service();
        pe.company.ws.ServicioNutricionista port = service.getServicioNutricionistaPort();
        return port.calculaTasaMet(genero, estatura, peso, edad);
    }

}
