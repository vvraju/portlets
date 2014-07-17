<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:renderURL  var="capturephoto" >
	<portlet:param name="action" value="capturephoto" />
</portlet:renderURL>
	<style type="text/css">
#webcam, #canvas {
    width: 320px;
    border:1px solid #cccccc;
    background:#cccccc;
    amrgin:0 auto;
   
}

#webcam {
    margin: 0 auto;
    position: relative;
}

#webcam > span {
    z-index:2;
    position:absolute;
    color:#eee;
    font-size:10px;
    bottom: -16px;
    left:152px;
}

#canvas {    border:20px solid #ccc;
    background:#eee;
}


</style>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.webcam.js"></script>
<script type="text/javascript">
var pos = 0;
var ctx = null;
var cam = null;
var image = null;

var filter_on = false;
var filter_id = 0;



$(function() {
        var pos = 0, ctx = null, saveCB, image = [];
        var canvas = document.createElement("canvas");
       
        canvas.setAttribute('width', 320);
        canvas.setAttribute('height', 240);  
        if (canvas.toDataURL) {
                ctx = canvas.getContext("2d");              
                image = ctx.getImageData(0, 0, 320, 240);
                saveCB = function(data) {
                	
                        var col = data.split(";");
                        var img = image;
                        for(var i = 0; i < 320; i++) {
                                var tmp = parseInt(col[i]);
                                img.data[pos + 0] = (tmp >> 16) & 0xff;
                                img.data[pos + 1] = (tmp >> 8) & 0xff;
                                img.data[pos + 2] = tmp & 0xff;
                                img.data[pos + 3] = 0xff;
                                pos+= 4;
                        }
                        if (pos >= 4 * 320 * 240) {
                                ctx.putImageData(img, 0, 0);
                              var photo=canvas.toDataURL("image/png");
                            	$.ajax({
                				    type: 'POST',
                				    // make sure you respect the same origin policy with this url:
                				    // http://en.wikipedia.org/wiki/Same_origin_policy
                				    url: '${capturephoto}',
                				    data: { 
                				        'type': "data",
                				        'image': canvas.toDataURL("image/png"),
                				        'name' : '${name}'
                				    },
                				    success: function(data){
										
                				    	 $('#result').html(data);
                				         				        
                				  		/* $('.modal-content').css({ 'display':'none'});
                			 	$('.modal-backdrop').removeClass("modal-backdrop fade in");
                			 	$('.modal').css({ 'display':'none'}); */
                			 	$(capturephotodiv).modal('hide');
                			 	//$(this).closest(".ui-dialog-content").dialog("close");
                				 /*  		$(this).dialog("close"); */
                				    }
                				});

                                
                               // $.post("capturephoto.html", {type: "data", image: canvas.toDataURL("image/png")});
                                pos = 0;
                        }
                };
        } else {

        
                saveCB = function(data) {
                	
                        image.push(data);                        
                        pos+= 4 * 320;                        
                        if (pos >= 4 * 320 * 240) {

                        	$.post({
            				    type: 'POST',
            				    // make sure you respect the same origin policy with this url:
            				    // http://en.wikipedia.org/wiki/Same_origin_policy
            				    url: '${capturephoto}',
            				    data: { 
            				        'type': "pixel",
            				        'image': image.join('|')
            				    },
            				    success: function(data){
									
            				    	 $('#result').html(data);
            				         $('#result').show();
            				         $('#result1').hide();
            				         $('#result2').hide();
            				         /* $('#capturephotodiv').removeClass('in');
            				  		$('#capturephotodiv').css({ 'display':'none'});
            				  		$('.modal-backdrop').removeClass("modal-backdrop fade in"); */
            				  		//$(capturephotodiv).modal('hide');
            				  		//$(this).closest(".ui-dialog-content").dialog("close");
            				    }
            				});
                               // $.post("capturephoto.html", {type: "pixel", image: image.join('|')});
                                pos = 0;
                        }
                };
        }
        $("#webcam").webcam({
                width: 312,
                height: 240,
                mode: "callback",
                swffile: "${pageContext.request.contextPath}/js/jscam_canvas_only.swf",
                onSave: saveCB,
                onCapture: function () {
                        webcam.save();
                },
                debug: function (type, string) {
                        //console.log(type + ": " + string);
                        // following code for alert for camera detection 
                	if (string === "Camera started") {
                        window.webcam.started = true; 
                        if (window.webcam.onStarted) { window.webcam.onStarted(); } 
                        
                    }
                	else{
                    	$("#nocam").show();
                  	   $("#nocam").html("There is no camera detected.");
                     return false;
                	}   
                }
        });
        window.webcam.onStarted = function () {
        	$("#nocam").html("");
        };
   });
</script>   

 <div class="row col-md-10 col-sm-10 col-xs-10">
 <div id="nocam" style="font-size: 14px; color: red; display: none;"></div>
 <div id="webcam"></div>
        <div style="margin:10px;clear:both;text-align:center;">	
           	<a href="javascript:webcam.capture();void(0);">
           	<button class="btn">
           	Capture Photo</button>
           	
           	</a>
           	</div>    
        
              </div>    