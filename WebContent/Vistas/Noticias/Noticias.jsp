<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, ec.edu.epn.modelo.Noticia" %>
<jsp:include page="/commons/header.jsp"></jsp:include>
<section class="container">
<!-- Main Content -->
    <div class="container">
       
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                 <div class="panel-group">
    				<div class="panel-heading">          					 
      					<h4 class="panel-title">
        					<a data-toggle="collapse" href="#collapse1">Deportes</a>
      					</h4>
    				
    				
    				
    				<form action="BuscarNoticia" method="get">
    				
      				  <ul class="list-group">
        				<li  id="1" title="deporteID" class="list-group-item"> <a href="#" >Atletismo</a></li>
        				<li  id="2" title="deporteID" class="list-group-item"><a href="#" >F&uacute;tbol</a></li>
        				<li  id="3" title="deporteID" class="list-group-item"><a href="#" >Basket</a></li>
        				<li  id="4" title="deporteID" class="list-group-item"><a href="#" >Rugby</a></li>
        				<li  id="5" title="deporteID" class="list-group-item"><a href="#" >Voleibol</a></li>
				      </ul>
      				</form>
      				<form action="BuscarNoticiaCtrl" method="get">
         			Nombre: <input type="text" name="nombreBusqueda" />
        		 	<input type="submit" value="Buscar"/> 
     				</form>
			  
			  		
			<h5 class="panel-title">
        					<a data-toggle="collapse" href="#collapse1">Buscar</a>
      					</h5>  		
			  	<table>
        <tr>
           
           <th>Titulo</th>
           <th>Información</th>
        </tr>
        <%
          List<Noticia> noticias = (List<Noticia>)
                  request.getAttribute("NOTICIAS");
          if (noticias!=null){
            for(Noticia n: noticias) {
        %>
         <tr>
           <td><%= n.getTituloNoticia() %></td>
           <td><%= n.getInformacion() %></td>
          
         </tr>
          <%
           }
          }
        %>	
				
			
				<hr>
 
                
                <hr>
                </div>
               </div>
            </div>
        </div>

    </div>

    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>