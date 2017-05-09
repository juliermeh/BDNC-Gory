<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project Góry</title>
</head>
<body>
    <jsp:useBean id="pagina" class="br.edu.ifpb.bdnc.gory.entidade.Pagina" />
<%
    int id = request.getParameter("id"):
    String titulo = request.getParameter("titulo");
    String autor = request.getParameter("autor");
    String conteudo = request.getParameter("conteudo");
    String data = request.getParameter(System.currentMillis());
    int bd = (int) request.getParameter("database");
    
    private final FacadeIn facade;
    
    public Banco(){
        facade = FacadeFactory.criarFacadeFactory();
    }

    facade.novaPagina(database,1,id,titulo,autor,conteudo,data);
%>
</body>
</html>