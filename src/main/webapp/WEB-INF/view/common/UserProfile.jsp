<!-- Thành from line 1 to 52 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="start" scope="session" value="${1}" />
<div id="body-2">
	<div class="main-content uk-container uk-container-center">
		<div class="uk-grid uk-grid-small uk-clearfix">
			<%@include file="aside.jsp" %>
			<div class="profile-content uk-width-4-5">
				<div class="profile-info">
					<div class="uk-grid uk-grid-small uk-clearfix">
						<div class="avatar uk-width-1-3">
							<div class="fc-thumb">
								<img src="resources/asset/img/avata.jpg" alt="">
							</div>
						</div>
						<div class="info uk-width-2-3">
							<form class="myprofile-form" method="" action="">
								<div class="username uk-clearfix">
									<input type="" class="input" disabled name="" value="<c:out value="${user.userName }"/>">
									<i class="status online"></i>
									<i class="status offline"></i>
								</div>
								<div class="meta">
									<select disabled>
										<% String sex = "Male"; %>
										<c:if test="${user.sex == 1}">
											<% sex = "female"; %>
										</c:if>
										<option><%= sex %></option>
									</select>
									<span style="margin-left: 35px;">BirthDay :</span>
									<select disabled>
										<option><c:out value="${user.birthDay.date }" /></option>
									</select>
									<select disabled>
										<option><c:out value="${user.birthDay.month }" /></option>
									</select>
									<select disabled>
										<option><c:out value="${user.birthDay.year }" /></option>
									</select>
								</div>
								<div class="status-user uk-clearfix">
      								<c:choose>
										<c:when test="${relationship == 0}">
											<a href="">Add friend</a>
								        </c:when>
										<c:when test="${relationship == 1}">
											<a href="">Request sent</a>
								        </c:when>
										<c:when test="${relationship == 2}">
											<a href="">Accept</a>
											<a href="">Decline</a>
								        </c:when>
										<c:when test="${relationship == 3}">
											<a href="">Friend</a>
								        </c:when>
      								</c:choose>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End -->