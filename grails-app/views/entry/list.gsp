
<%@ page import="grails_blogito.Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'entry.label', default: 'Entry')}" />
		<title>Blogito</title>
	</head>
	<body>
		<a href="#list-entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<g:if test="${session.user}">
			<div class="nav" role="navigation">
				<ul>
					<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
					<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
				</ul>
			</div>
		</g:if>
		<div id="body">
			<div class="list" role="main">
				<g:each in="${ entryInstanceList }" status="i" var="entryInstance">
					<g:render template="entry" bean="${ entryInstance }" var="entryInstance"/>
				</g:each>
			</div>
		</div>
		
		<div class="pagination">
			<g:paginate total="${entryCount}" params="${ flash }"/>
		</div>
	</body>
</html>
