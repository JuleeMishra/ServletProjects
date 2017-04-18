import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class HelloWorld implements Servlet
{
    public void init(ServletConfig servletconfig)throws ServletException
    {
    	//initialization code
    }

    public ServletConfig getServletConfig(){
    	//you can read web.xml file data here but if data not required for so it return null.
    	return null; 
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        /*You can read form data in service method.I.e whatever data we are sending through form the same data
    	  we can read here.
    	  Three steps here
    	  1) Read data from form -->Using parameter for name in form we can read data here
    	  2) Generate output
    	  3) Send data
    	 */
    	 
    	String name = req.getParameter("p1");
        PrintWriter out = res.getWriter();
        out.println("Hello..."+name);
    }

    public String getServletInfo(){
    	return null;
    }
    public void destroy(){
    	//do cleanup operations
    }
}

