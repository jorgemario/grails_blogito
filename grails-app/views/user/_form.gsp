<%@ page import="grails_blogito.User" %>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required">
  <label for="name">
    <g:message code="user.name.label" default="Name" />
    <span class="required-indicator">*</span>
  </label>
  <g:textField name="name" required="" value="${userInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'login', 'error')} required">
  <label for="login">
    <g:message code="user.login.label" default="Login" />
    <span class="required-indicator">*</span>
  </label>
  <g:textField name="login" required="" value="${userInstance?.login}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} ">
  <label for="password">
    <g:message code="user.password.label" default="Password" />

  </label>
  <g:field type="password" name="password" value="${userInstance?.password}"/>
</div>

<div class="fieldcontain">
    <label for="role">
        Role
    </label>
    <g:select name="role" from="${User.USER_ROLES}" value="${userInstance?.role}"/>
</div>

