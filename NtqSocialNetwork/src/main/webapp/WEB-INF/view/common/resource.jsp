	<title>NTQ SOCIAL NETWORK</title>
	<link href="https://fonts.googleapis.com/css?family=Righteous&amp;subset=latin-ext" rel="stylesheet">
	<link href="resources/shared/library/uikit/css/uikit.docs.min.css" rel="stylesheet" type="text/css">
	<link href="resources/shared/plugin/flex-slider/flexslider.css" rel="stylesheet" type="text/css" >
	<link href="resources/shared/library/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="resources/shared/library/css/fontawesome/css/font-awesome.css" rel="stylesheet" />
	<link href="resources/shared/library/css/library.css" rel="stylesheet" />
	<link href="resources/asset/css/style.css" rel="stylesheet" type="text/css">
	<script src="resources/shared/library/js/jquery-2.1.3.min.js"></script>
	<script src="resources/shared/library/uikit/js/uikit.min.js"></script>
	<script src="resources/shared/library/js/library.js"></script>
	<script type="text/javascript">
		var myvar;
       function change(){
          if(/[~`!@#*$%^&)+(-=,./?}></\|_{0-9]/.test(document.getElementById('name').value)){
		      document.getElementById('dialognamee').innerHTML= 'Tên không hợp lệ';
			  document.getElementById('submit_create').disabled =true;
	      }else{
			  document.getElementById('dialognamee').innerHTML= '';
			  document.getElementById('submit_create').disabled =false;	
		 }
	   }
          
       function setTimeOut(){
    	   clearTimeout(myvar);
    	   nyvar = setTimeout(setTimeOff,3600000);
       }
       function setTimeOff(){
    	   window.open("login","_self",false);
       }
    </script>