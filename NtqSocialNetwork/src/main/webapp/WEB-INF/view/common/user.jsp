<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="start" scope="session" value="${1}" />
<div id="body-2">
	<div class="main-content uk-container uk-container-center">
		<div class="uk-grid uk-grid-small uk-clearfix">
			<%@include file="aside.jsp" %>
			<div class="content-center uk-width-4-5">
				<div style="padding-left: 10px;">
					<form class="search-form uk-clearfix" action="search">
						<input type="text" name="keyword" placeholder="Search for user....">
						<button type="submit">
							<i class="uk-icon uk-icon-search"></i>
						</button>
					</form>
					<div class="uk-grid uk-grid-small uk-grid-width-1-2 friend-box">
						<c:forEach items="listUser" var="user">
							
						</c:forEach>
						<c:forEach var="user" items="${users}">
						<div class="box">
							<figure>
								<% String sex = "male"; %>
								<c:if test="${user.sex == 1}">
								<% sex = "female"; %>
								</c:if>
								<a href="user?email=<c:out value="${user.email}" />" class="fc-thumb"><img src="resources/asset/img/<%=sex %>.jpg"></a>
								<figcaption class="uk-clearfix">
									<div class="uk-float-left">
										<h3 class="title">
											<a href="user?email=<c:out value="${user.email}" />"><c:out value="${user.userName }" /></a>
										</h3>
										<div class="sex">
											<i class="uk-icon uk-icon-user"></i> <span><%=sex %></span>
										</div>
									</div>
									<div class="uk-float-right friend-button">
										<a href="" class="">
											<% String status = "offline"; %>
											<c:if test="${user.status == 1}">
											<% status = "online"; %>
											</c:if>
											<i class="<%=status %>"></i>
											<span>Friend</span>
										</a>
									</div>
								</figcaption>
							</figure>
						</div>
						</c:forEach>
					</div>
					<div class="paging user-paging">
						<c:out value="${pageFooter}" escapeXml="false" />
					</div>
				</div>
			</div>
		</div>
	</div>
</div>