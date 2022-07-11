package servlet.Actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.Model.Banco;
import servlet.Model.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/lista-empresas")
public class ListaEmpresasServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Imprimindo todas as empresas cadastradas:");
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<ul>");
		empresas.forEach(empresa -> out.write("<li>" + empresa.getNome() + "</li>"));
		out.write("</ul");
		out.write("</body></html");
		
		
	}
}