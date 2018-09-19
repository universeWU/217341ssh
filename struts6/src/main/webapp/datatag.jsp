<%--
  Created by IntelliJ IDEA.
  User: starlee
  Date: 2018/9/19
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR.html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html;charset=UTF-8">
    <title>数据标签的使用</title>
</head>
<body>

<s:bean name="cap.bean.User" id="u">
    <s:param name="id" value="29"/>
    <s:param name="username" value="'cap'"/>
    <s:param name="password" value="'cap'"/>
</s:bean>
<!--使用push标签将Stack Context中的u实例放入ValueStack-->
<s:push value="#u">
    <s:property value="id"/>
    <s:property value="username"/>
    <s:property value="password"/>
</s:push>
</body>
</html>
