
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<ul id="flexiselDemo2" class="services_scroll_bottom services_scroll_bottomIE">
					<c:forEach items="${recommendedProducts}" var="rProducts" varStatus="rp">
					<c:choose><c:when test='${rp.count eq 1}'>
						<li>
						<div class="span12 rightarrowroutes text-left flexdemolist ">
							<img src="${rProducts.imgUrl}" />
							<span>${rProducts.productName}</span>
						</div>
					</li>
					</c:when>
					
					<c:otherwise>
					<li>
						<div class="span12  text-left flexdemolist ">
							<img src="${rProducts.imgUrl}" />
							<span>${rProducts.productName}</span>
						</div>
					</li></c:otherwise></c:choose>
					</c:forEach>
					</ul>
				
<script>



$(function(){
	

$("#flexiselDemo2").flexisel({
		enableResponsiveBreakpoints : true,

		clone : false,
		responsiveBreakpoints : {
			portrait : {
				changePoint : 480,
				visibleItems : 1
				
			},
			landscape : {
				changePoint : 640,
				visibleItems : 2
			},
			tablet : {
				changePoint : 768,
				visibleItems : 3
			}
		}
	});
});
</script>