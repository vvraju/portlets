<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">   
  .control-panel{  
    display:none;  
  }  
</style> 
<%-- <c:if test="${path ne null}">
<iframe  src = "${path}" height = 800px class="span11" id="iframeprint"  accesskey="true"></iframe >
</c:if>
<c:if test="${imgencode ne null}">
<img  src="data:image/png;base64,${imgencode}"/>
</c:if>
<c:if test="${filename ne null}">
<span >${filename}</span>
</c:if> --%>

<c:choose>
      <c:when test="${path ne null}">
      <iframe  src = "${path}" height = 800px class="span11" id="iframeprint"  accesskey="true"></iframe >
      </c:when>
      
      <c:when test="${imgencode ne null}">
     <img  src="data:image/png;base64,${imgencode}"/>
      </c:when>
      
       <c:when test="${filename ne null}">
     <span >${filename}</span>
      </c:when>

      <c:otherwise>
      <span style="font-size: 12px;">Your not uploaded or captured the document. Please upload or capture the document.</span>
      </c:otherwise>
</c:choose>
