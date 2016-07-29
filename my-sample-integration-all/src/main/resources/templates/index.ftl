<!DOCTYPE html>

<html lang="en">

<body>
 index : hello freemarker!

<ul>
    <#list users as  user>
        <li>${user.id};${user.userName};${user.age};${user.birthday};${user.createTime}</li>
    </#list>
    <#list addresses as item>
        <li>${item.id} -- ${item.addressName} -- ${item.address} -- ${item.createTime}</li>
    </#list>
</ul>
</body>

</html>
