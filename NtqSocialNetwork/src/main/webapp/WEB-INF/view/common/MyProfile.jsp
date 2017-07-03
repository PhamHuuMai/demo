<!-- Thành from line 1 to 55 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
=======
	
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
>>>>>>> 83f4f2b1b3569a08bc34fa5fc0f0cf1bfca86920
<div id="body-2">
	<div class="main-content uk-container uk-container-center">
		<div class="uk-grid uk-grid-small uk-clearfix">
			<%@include file="aside.jsp" %>
			<div class="profile-content uk-width-4-5">
				<div class="profile-info">
					<div class="uk-grid uk-grid-small uk-clearfix">
						<div class="avatar uk-width-1-3">
							<div class="fc-thumb">
								<c:if test="${user.image == ''}">
									<img src='<c:out value="resources/asset/img/avata.jpg"></c:out>' alt=""/>
								</c:if>	
								<c:if test="${user.image != ''}">
									<img src='<c:out value="${user.image}"></c:out>' alt=""/>
								</c:if>	
							</div>
						</div>
						<div class="info uk-width-2-3">
							<form class="myprofile-form" method="post" action="editmyprofile">
								<div class="username uk-clearfix">
									<input type="" class="input" disabled name="username"  value="<c:out value="${user.userName}" />">
									<i class="status online"></i>
									<i class="status offline"></i>
								</div>
								
								<div class="meta">
									<select disabled>
									<% String male = "",female=""; %>
									<c:if test="${user.sex == 0 }">
										<% male ="selected"; %>
										<c:out value="">male</c:out>
									</c:if>
									<c:if test="${user.sex == 1 }">
										<% female= "selected"; %>
									</c:if>
										<option <%=male %> value="0">Male</option>
										<option <%=female %> value="1">Female</option>
									</select>
									<span style="margin-left: 35px;">BirthDay :</span>
									<select name="day" disabled>
										<option><c:out value="${day}"></c:out></option>
									</select>
									<select name="month" disabled>
										<option><c:out value="${month}"></c:out></option>
									</select>
									<select name="year" disabled>
										<option><c:out value="${year}"></c:out></option>
									</select>
								</div>
								<div class="private-info">
									<input type="text" class="input" name="email" value='<c:out value="${user.email }"></c:out>'  disabled>
									<input type="password" class="input input-password" name="password" value="anhthanh" />
								</div>
								<div class="" class="edit-profile-button uk-clearfix">
									<input type="" class="button" name="" value="Edit" id="edit-button">
									<input type="submit" class="button" name="" value="Save" id="save-button">
									<input type="reset" class="button" name="" value="Cancel" id="cancel-button">
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