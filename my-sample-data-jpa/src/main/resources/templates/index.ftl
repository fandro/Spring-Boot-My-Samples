<!DOCTYPE html>

<html lang="en">
<head>
    <title>freemarker</title>
    <link href="/bootstrap/css/bootstrap.css" rel="stylesheet"></link>
    <link href="/bootstrap/css/bootstrap-theme.css" rel="stylesheet"></link>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
</head>
<body style="background-color: #eeeeee;">
<h1 class="text-center">hello freemarker!</h1>

    <dl class="dl-horizontal">
        <dt>date:</dt>
        <dd>${time?date}</dd>
    </dl>
    <dl class="dl-horizontal">
        <dt>time:</dt>
        <dd>${time?time}</dd>
    </dl>
    <dl class="dl-horizontal">
        <dt>Message:</dt>
        <dd>${message}</dd>
    </dl>

<a class="btn-small">添加用户</a>
<a class="btn-small">搜索</a>
<table class="table">
    <thead>
    <tr>
        <th>id</th>
        <th>userName</th>
        <th>birthday</th>
        <th>createTime</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <#list users as  user>
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.birthday}</td>
        <td>${user.createTime}</td>
    </tr>
    </#list>
    </tbody>
</table>

<table class="table">
    <thead>
    <tr>
        <th>id</th>
        <th>addressName</th>
        <th>address</th>
        <th>createTime</th>
    </tr>
    </thead>
    <tbody>
    <#list addresses as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.addressName}</td>
        <td>${item.address}</td>
        <td>${item.createTime}</td>
    </tr>
    </#list>
    </tbody>
</table>

</body>

</html>
