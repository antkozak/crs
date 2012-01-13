<#assign portlet=JspTaglibs["http://java.sun.com/portlet"]>
<@portlet.defineObjects/>

<#import "/spring.ftl" as spring />

    <div class="aui-layout-content">
    <#include "menu.ftl">
        <div class="aui-column aui-w95 aui-column-first">
            <div class="aui-layout-content">
                <div class="aui-column aui-w50 aui-column-first">
                    <div class="aui-column-content">
                        <h3>
                            My Library
                        </h3>
                        <ul>
                            <#list folders as folder>
                                <li>
                                    <a href="<@spring.url "/browse/${folder.id}"/>">${folder.name}</a>
                                </li>
                            </#list>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="aui-column aui-w50 aui-column-first">
                    <div class="aui-layout-content">
                        <#include "timer.ftl">
                            <div class="aui-layout-content">
                                <div class="aui-column aui-w70 aui-column-first">
                                    <#include "item_description.ftl">
                                </div>
                                <div class="aui-column aui-w30 aui-column-first">
                                    <div class="aui-column aui-w100">
                                        <div>
                                            <#include "action.ftl">
                                        </div>
                                        <div>
                                            <#include "recommend.ftl">
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
</div>