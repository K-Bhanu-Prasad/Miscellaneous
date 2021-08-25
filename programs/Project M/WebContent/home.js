$(window).on('load',function(){
	$('#mainModal').modal({
        backdrop: 'static',
        keyboard: false
    });
    $('#mainModal').modal('show');
    $(".bodyContent").css("background-image", "url('./images/Chess.jpg')"); 
    $('#confirm').css("display","none");
        
 });


$(document).ready(function(){
	var randomNine;
	var symbolsList = "ΐΓΔΘΠΡΣΦΧΨΩΪΫάέήίΰαβγδεζηθικλμνξCπρςστυφχψωϊϋόύώϏϐϑϓϔϕϖϗϘϙϚϜϞE0ϠϢϤϦϧϨϪϬϭϮϯF0ϰϱϲϳϴϵ϶ϷϸϹϺϼϽϾϿЁЂЃЄЅІЇЈЉЊ";
	$("#start").add('.playagain').click(function(e) {
		$('#mainModal').modal('hide');
		$('#tutorial').modal({
	        backdrop: 'static',
	        keyboard: false
	    });
		$('#tutorial').modal('show');
		$("#result")[0].innerHTML = ("Reading your mind");
	    $(".mindreaderfooter")[0].style.display ='none';
	    $(".mindreaderlbody").css("margin-top", "44%");
	    $("#result").removeClass('largefontsize');
	    $(".symboltext")[0].innerHTML = (" ");
	});
	
	$("#play").click(function(e) {
		//create dynamic rows and cloumns
		randomNine =Math.floor(Math.random() * 100)  
		for(var i=0; i<=100; i++){
			var label=document.createElement("label");
			 label.setAttribute("text",i);
			 var random =Math.floor(Math.random() * 100);   
			 var symbol = symbolsList.charAt(random);
	        // $(".cloumn1").append(label);
			 if(i<17)
	         $( ".cloumn1" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 else if(i<34)
		         $( ".cloumn2" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 else if(i<51)
		         $( ".cloumn3" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 else if(i<68)
		         $( ".cloumn4" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 else if(i<85)
		         $( ".cloumn5" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 else if(i<102)
		         $( ".cloumn6" ).append('<div><h3><label id='+"label"+i+'>'+i+'</label><span id='+"span"+i+'>'+symbol+'</span></h3></div>');
			 
			 if(i%9 == 0)
				 for(var j=0; j<100; j=j+9){
					 $( "#span"+i ).text(symbolsList.charAt(randomNine));
				 }
			 $('#confirm').css("display","block");
				
		}
		
	});
	
	//On click of got symbol
	$("#confirm").click(function(e) {
		$(".mindreadermodalcontent").css("background-image", "url('./images/brain.jpg')");
		$('#mindreader').modal({
	        backdrop: 'static',
	        keyboard: false
	    });
	    $('#mindreader').modal('show');
	   var interval = setInterval(function() {
	    	$("#result")[0].style.display = ($("#result")[0].style.display == 'none' ? '' : 'none');
	    }, 300);
	    setTimeout(function(){
	    	$("#result")[0].innerHTML = (symbolsList.charAt(randomNine));
	    	$(".mindreaderlbody").css("margin-top", "10%");
	    	$("#result").css("font-size", "91px !important");
	    	$("#result").addClass('largefontsize');
	    	clearInterval(interval);
	    	$("#result")[0].style.display = '';
	    	$(".symboltext")[0].innerHTML = ("Your symbol is");
	    	$(".mindreaderfooter")[0].style.display ='block';
	    },4000);
		
	});
	
});

