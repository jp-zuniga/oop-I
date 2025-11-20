<!DOCTYPE html>

<head>
    <title>
        <%=title%>
    </title>
    <meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1'>
    <link
        href="<%=request.getContextPath()%>/xava/style/<%=XavaPreferences.getInstance().getStyleCSS()%>?ox=<%=oxVersion%>"
        rel="stylesheet" type="text/css">
</head>

<body id="welcome" <%=XavaStyle.getBodyClass(request)%>>
    <h1>
        <%=metaApplication.getLabel()%>
    </h1>
    <p>
        <%=metaApplication.getDescription()%>
    </p>
    <p>
        <xava:message key="welcome_point1" />
    </p>
    <p id="signin_tip">
        <xava:message key="signin_tip" />
    </p>

    <div class="ox-bottom-buttons">
        <input type="hidden">
        <a href="m/SignIn">
            <input type="button" tabindex="1" value="<xava:label key='SignIn'/>">
        </a>
    </div>
</body>
