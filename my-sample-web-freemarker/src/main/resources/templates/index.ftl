<!DOCTYPE html>

<html lang="en">
<head>
    <title>freemarker</title>
    <link href="/css/bootstrap.css" rel="stylesheet"></link>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
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

</body>

</html>
