<#assign portlet=JspTaglibs["http://java.sun.com/portlet"]>
<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]/>

Hi!! Welcome to spring demo porltet.
${helloWorldMessage!'false'}

<@portlet.renderURL var="currentResUrl"/>
<@portlet.resourceURL var="currentResUrl1" id="ajaxTest"/>

${currentResUrl1!'currentResUrl is Empty!!!'};

<br/>

<div id="example-1"><a href="javascript:void(0);">Click me!</a></div>

<script type="text/javascript">
AUI().ready('aui-io-request', function(A) {
    var io = A.io.request('${currentResUrl1!''}', {
        autoLoad: false,
        cache: false,
        on: {
            success: function(event, id, xhr) {
                var data = this.get('responseData');
                var out = A.JSON.stringify(data);
                console.log('success: ' + out);
            },
            complete: function(event, id, xhr) {
                console.log('complete');
            },
            failure: function(event, id, xhr) {
                console.log('failure');
            },
            end: function(event, id) {
                console.log('2end2');
            }
        },
        after: {
            start: function() {
                console.log('after start');
            }
        }
    });

    var el_1 = A.one('#example-1');

    el_1.on('click', function(event){
       io.start();
    });

});
</script>
