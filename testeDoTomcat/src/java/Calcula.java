
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
/**
 *
 * @author felipem.medeiros
 */
@WebServlet(urlPatterns = {"/Calcula"})
public class Calcula extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String modelo = request.getParameter("modelo");
        Double valorCombustivel = Double.valueOf(request.getParameter("valorCombustivel"));
        Double quilometroLitro = Double.valueOf(request.getParameter("quilometroLitro"));
        Double valorRevisao = Double.valueOf(request.getParameter("valorRevisao"));
        Double valorPneu = Double.valueOf(request.getParameter("valorPneu"));
        Double distancia = Double.valueOf(request.getParameter("distancia"));
        
        Double valorDoQuilometroRodado = (valorCombustivel / quilometroLitro) + (valorRevisao / 10000) + (valorPneu / 50000);
        Double valorDoQuilometroRodadoComAcrescimoDeQuinzePorCento = valorDoQuilometroRodado * 1.15;
        Double gastoDistancia = valorDoQuilometroRodadoComAcrescimoDeQuinzePorCento * distancia;
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcula</title>");

            out.println("</head>");
            out.println("<body>");
            out.println("<section>");
            out.println("<fieldset>");
            out.println("<legend>Calculo Km rodado</legend>");
            out.println("<p>Modelo do carro:  " + modelo.toUpperCase());
            out.println("<p>Valor do combustível:  " + valorCombustivel + " reais.");
            out.println("<p>Quantidade Km/L:  " + quilometroLitro +" por litro.");
            out.println("<p>Valor da revisão a cada 10 mil km   :  " + valorRevisao + " reais.");
            out.println("<p>Valor de 4 pneus a cada 50 mil km :  " + valorPneu + " reais.");
            out.println("<h3>O valor do quilômetro rodado é de :  " + valorDoQuilometroRodado + " reais.");
            out.println("<h3>O valor do quilômetro rodado com acréscimo de 15% é de :  " + valorDoQuilometroRodadoComAcrescimoDeQuinzePorCento + " reais.");
            out.println("<h3>Para a distância de "+distancia+"km, Você terá um gasto de :  " + gastoDistancia + " reais.");
            out.println("</fieldset>");
            out.println("</section>");
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

}
