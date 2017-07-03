<#if runEnvironment??>
	<div style="font-size:20px;color:red;text-align:center;background-color:yellow">
	★★
	<#switch runEnvironment>
		<#case "local">
				ローカル環境
			<#break>
		<#case "test">
				テスト環境
			<#break>
		<#default>
			<#break>
	</#switch>
	★★
	</div>
</#if>
<div id="header">
	<span>${headerTitle!""}</span>
	zzxzxzxzxzx
	<#if user??>
		<a href="${formatter.url("/auth/logout/")}" class="btn-logout">ログアウト</a>
	</#if>
</div>