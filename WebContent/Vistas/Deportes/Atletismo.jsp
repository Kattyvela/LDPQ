<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List, ec.edu.epn.modelo.Noticia" %>
<jsp:include page="/commons/header1.jsp"></jsp:include>
<section class="container">
<!-- Main Content -->
   
  
        <%
          List<Noticia> noticias = (List<Noticia>)request.getAttribute("NOTICIAS");
          if (noticias!=null){
        	  for(Noticia n: noticias) {
        %>
         <tr>
           <td><%= n.getTituloNoticia() %></td>
      
         </tr>
          <%
           }
          }
        %>
      



    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>