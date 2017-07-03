<#compress>
<title>${pageTitle!""}</title>
<script src="webjars/jquery/3.2.0/jquery.min.js"></script>
<script src="webjars/sockjs-client/1.1.2/sockjs.min.js"></script>
<script src="webjars/stomp-websocket/2.3.1/stomp.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<script type="text/javascript" src="resources/js/edittablegird/editablegrid.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_charts.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_charts_ofc.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_editors.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_renderers.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_utils.js"></script>
<script type="text/javascript" src="resources/js/edittablegird/editablegrid_validators.js"></script>
<script type="text/javascript" src="resources/js/websocket.js"></script>
<script type="text/javascript" src="resources/js/report.js"></script>

<#if scripts??>
	<#list scripts as script>
		<script type="text/javascript" src=""></script>
		<script type="text/javascript" src=""></script>
	</#list>
</#if>
<link rel="stylesheet" type="text/css" href="resources/css/report.css" />
<link rel="stylesheet" type="text/css" href="resources/css/edittablegird/editablegrid.css" />

<#if stylesheets??>
	<#list stylesheets as stylesheet>
		<link rel="stylesheet" type="text/css" href="" + stylesheet)}" />
	</#list>
</#if>
</#compress>