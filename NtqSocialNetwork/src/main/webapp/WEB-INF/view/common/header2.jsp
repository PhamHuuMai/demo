<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="start" scope="session" value="${1}" />
<header id="header-2">
	<div class="uk-container uk-container-center">
		<div class="uk-grid uk-grid-small uk-clearfix">
			<div class="header-left uk-width-3-4">
				<div class="#header-2 .header-left ">
					<div class="logo uk-float-left">
						<h1>
							<a href="" title="">NS</a>
						</h1>
					</div>
					<form class=" uk-float-left" method="" action="">
						<input type="text" name="" placeholder="Ntq Social Search...">
						<button type="submit">
							<i class="uk-icon uk-icon-search"></i>
						</button>
					</form>
				</div>
			</div>
			<div class="header-right uk-width-1-4">
				<div class="uk-float-left user">
					<a href="" title="" class="avatar fc-thumb"><img
						src="resources/asset/img/avata.jpg" alt=""></a> <a href="" title=""
						class="name"><c:out value="${user.userName}"/></a>
				</div>
			</div>
		</div>
	</div>
</header>