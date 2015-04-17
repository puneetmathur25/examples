<%@ page import="com.ws.test.State" %>



<div class="fieldcontain ${hasErrors(bean: stateInstance, field: 'cities', 'error')} ">
	<label for="cities">
		<g:message code="state.cities.label" default="Cities" />
		
	</label>
	<g:select name="cities" from="${com.ws.test.City.list()}" multiple="multiple" optionKey="id" size="5" value="${stateInstance?.cities*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="state.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${stateInstance?.name}"/>

</div>

