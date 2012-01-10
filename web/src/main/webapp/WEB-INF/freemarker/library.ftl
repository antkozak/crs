<#import "/spring.ftl" as spring />

<#list folders as folder>
  <a href="<@spring.url "/browse/${folder.id}"/>">${folder.name}</a>
</#list>