<?php
header('Content-Type: text/html; charset=utf-8');
error_reporting(E_ALL);
ini_set('display_errors', 1);
$baseurl = 'http://localhost/template2/';
$moduleurl = $baseurl.'module/';
$theme = isset($_GET['theme'])?(int)$_GET['theme']:1;
$format = isset($_GET['format'])?$_GET['format']:'';
$limit = isset($_GET['limit'])?(int)$_GET['limit']:10;

function get($url = '', $param = ''){
	return curl($url, $param);
}

function curl($url = '', $post = '', $cookie = '', $ref = '', $followlocation = FALSE, $header = FALSE){
	$ch = curl_init();
	curl_setopt($ch, CURLOPT_URL, $url);
	curl_setopt($ch, CURLOPT_USERAGENT, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36');
	if($post){curl_setopt($ch, CURLOPT_POST, TRUE); curl_setopt($ch, CURLOPT_POSTFIELDS, $post);}
	if($cookie){curl_setopt($ch, CURLOPT_COOKIEJAR, $cookie); curl_setopt($ch, CURLOPT_COOKIEFILE, $cookie);}
	if($ref){curl_setopt($ch, CURLOPT_REFERER, $ref);}
	if($header == TRUE){curl_setopt($ch, CURLOPT_HEADER, TRUE);}else{curl_setopt($ch, CURLOPT_HEADER, FALSE);}
	if($followlocation == TRUE){curl_setopt($ch, CURLOPT_FOLLOWLOCATION, TRUE);}else if($followlocation == FALSE){curl_setopt($ch, CURLOPT_FOLLOWLOCATION, FALSE);}
	curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, FALSE);
	curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, FALSE);
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, TRUE);
	curl_setopt($ch, CURLOPT_TIMEOUT, 60);
	curl_setopt($ch, CURLOPT_CONNECTTIMEOUT, 60);
	$result = curl_exec($ch);
	curl_close($ch);
	return $result;
}