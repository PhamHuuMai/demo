<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<header id="header-1">
		<div class="uk-container uk-container-center">
			<div class="uk-grid uk-grid-medium">
				<div class="uk-width-1-2">
					<h1 class="title-1"><a href="">NTQ SOCIAL</a></h1>
				</div> 
				<div class="uk-width-1-2">
					<form class="form-header uk-float-right" method="post" action="authentication">
						<div class="text-form username uk-float-left">
							<span class="text-1">Email</span>
							<input type="email" name="email" required >
							<p style="color: red;"><c:out value ="${notifi}" /></p>
						</div>
						<div class="text-form password uk-float-left">
							<span class="text-1">Password</span>
							<input type="password" name="password" minlength="6" maxlength="30" required>
							<!--<a href="" class="forgot-pass">Forgotten account?</a>-->
						</div>
						<div class="button uk-float-left">
							<button type="submit" ><span>log in</span></button>
						</div>
					</form>
				</div> 
			</div>
		</div>
</header>