<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div id="body-1">
		<div class="uk-container uk-container-center">
			<div class="uk-grid uk-grid-small">
				<div class="body-left uk-float-left">
					<div class="text">
						<h2 class="title">Ntq social helps you connect and share with the people in your life.</h2>
					</div>
					<div class="image">
						<img src="resources/asset/img/login.png" >
					</div>
				</div>
				<div class="body-right uk-float-left">
					<form class="" method="post" action="./register" >
						<div class="title">
							<h3 class="text text-1">Create an account</h3>
							<span class="text text-2">It's free and always will be.</span>
						</div>
						<p style="color: red;"><c:out value = "${mess}"></c:out></p>
						<div class="input-form">
							<div class="">
								<input type="" id="name" name="name"  placeholder="Full name" oninput="change()" required>
								<p style="color: red;"><c:out value = "${valiName}"></c:out></p>
								<span id="dialognamee"></span>
							</div>
							<div class="">
								<input type="email" name="email" placeholder="Email" required>
								<p style="color: red;"><c:out value = "${valiEmail}"></c:out></p>
								<p style="color: red;"><c:out value = "${EmailExist}"></c:out></p>
								<span id="dialogemail"></span>
							</div>
							<div class="">
								<input type="password" name="password" placeholder="New password" minlength="6" maxlength="30" required>
							    <p style="color: red;"><c:out value = "${valiPass}"></c:out></p>
							    <span id="dialogpassword"></span>
							</div>
							<div class="born-day">
								<span class="title">BirdDay</span>
								<div>
									<span>Day</span>
									<select name="day">
										<%for(int i=1;i<=31;i++) {%>
										<option><%=i %></option>
										<%} %>
									</select>
									<span>Month</span>
									<select name="month">
                                        <%for(int i=1;i<=12;i++) {%>
										<option><%=i %></option>
										<%} %> 								
									</select>
									<span>Year</span>
									<select name="year">
                                        <%for(int i=2017;i>1920;i--) {%>
										<option><%=i %></option>
										<%} %> 
									</select>
								</div>
								<span id="dialogdate"></span>
							</div>
							<div class="sex uk-clearfix">
								<div class="women">
									<input type="radio" class="uk-radio" name="sex" value = "0">
									<span>Female</span>
								</div>
								<div class="men">
									<input type="radio" class="uk-radio" name="sex" value = "1" checked>
									<span>Male</span>
								</div>
							</div>
							<div class="accept">
								<p>By clicking Create an account, you agree to our Terms and confirm that you have read our Data Policy, including our Cookie Use Policy. You may receive SMS message notifications from Facebook and can opt out at any time.</p>
							</div>
							<div class="button">
								<button type="submit" disabled id="submit_create"><span>Create an account</span></button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
</div>