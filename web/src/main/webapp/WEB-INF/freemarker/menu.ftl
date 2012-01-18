<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]/>
<div class="aui-layout-content">
    <div class="aui-column menu aui-column-first">
        <div id="menu" class="aui-column-content">
            <ul>
                <li>
                    <a href="${rootUrl}/home">
                        <img src="<@c.url value='/images/menu/home.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/toc">
                        <img src="<@c.url value='/images/menu/toc.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/search">
                        <img src="<@c.url value='/images/menu/search.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/bookmarks">
                        <img src="<@c.url value='/images/menu/bookmarks.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/tools">
                        <img src="<@c.url value='/images/menu/tools.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/history">
                        <img src="<@c.url value='/images/menu/history.png'/>">
                    </a>
                </li>
                <li>
                    <a href="${rootUrl}/notes">
                        <img src="<@c.url value='/images/menu/notes.png'/>">
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div>
