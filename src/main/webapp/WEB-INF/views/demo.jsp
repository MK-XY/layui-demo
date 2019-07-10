<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>测试</title>
    <link rel="stylesheet" href="/static/layui/css/layui.css">
<%--    <link rel="stylesheet" href="/static/layui/css/modules/layer/default/layer.css">--%>
    <script src="/static/layui/layui.js"></script>
<%--    <script src="/static/layui/lay/modules/layer.js"></script>--%>
</head>
<body>

    <%--<button type="button" class="layui-btn">一个标准的按钮</button>
    <a href="http://www.layui.com" class="layui-btn">一个可跳转的按钮</a>--%>

    <%--<table>
        <tr>
            日期输出中英文
            <f:setLocale value="zh_CN" scope="session"></f:setLocale>
            <f:setLocale value="en_US" scope="session"></f:setLocale>
            <td><f:formatDate value="${date}" pattern="yyyy-MMMM-dd"></f:formatDate></td>
        </tr>
    </table>--%>

    <%--按钮--%>
    <div class="layui-container" style="padding-top: 20px">
        <button class="layui-btn layui-btn-primary" type="button">原始按钮</button>
        <button class="layui-btn" type="button">默认按钮</button>
        <button class="layui-btn layui-btn-normal" type="button">百搭按钮</button>
        <button class="layui-btn layui-btn-warm" type="button">暖色按钮</button>
        <button class="layui-btn layui-btn-danger" type="button">警告按钮</button>
        <button class="layui-btn layui-btn-disabled" type="button">禁用按钮</button>
        <img src="/static/layui/images/face/8.gif">
        <img src="/static/layui/images/face/2.gif">
        <img src="/static/layui/images/face/38.gif">
    </div>
    <%--图标--%>
    <div class="layui-container" style="padding-top: 20px">
        <button type="button" class="layui-btn">
            <i class="layui-icon">&#xe608;</i> 添加
        </button>

        <button type="button" class="layui-btn layui-btn-sm layui-btn-primary">
            <i class="layui-icon">&#x1002;</i>
        </button>
    </div>
    <%--按钮组--%>
    <div class="layui-container" style="padding-top: 20px">
        <div class="layui-btn-group">
            <button type="button" class="layui-btn">增加</button>
            <button type="button" class="layui-btn">编辑</button>
            <button type="button" class="layui-btn">删除</button>
        </div>

        <div class="layui-btn-group">
            <button type="button" class="layui-btn layui-btn-sm">
                <i class="layui-icon">&#xe654;</i>
            </button>
            <button type="button" class="layui-btn layui-btn-sm">
                <i class="layui-icon">&#xe642;</i>
            </button>
            <button type="button" class="layui-btn layui-btn-sm">
                <i class="layui-icon">&#xe640;</i>
            </button>
            <button type="button" class="layui-btn layui-btn-sm">
                <i class="layui-icon">&#xe602;</i>
            </button>
        </div>

        <div class="layui-btn-group">
            <button type="button" class="layui-btn layui-btn-primary layui-btn-sm">
                <i class="layui-icon">&#xe654;</i>
            </button>
            <button type="button" class="layui-btn layui-btn-primary layui-btn-sm">
                <i class="layui-icon">&#xe642;</i>
            </button>
            <button type="button" class="layui-btn layui-btn-primary layui-btn-sm">
                <i class="layui-icon">&#xe640;</i>
            </button>
        </div>
    </div>
    <%--动画--%>
    <ul class="site-doc-icon site-doc-anim">
        <li>
            <div class="layui-anim" data-anim="layui-anim-up">从最底部往上滑入</div>
            <div class="code">layui-anim-up</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-upbit">微微往上滑入</div>
            <div class="code">layui-anim-upbit</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-scale">平滑放大</div>
            <div class="code">layui-anim-scale</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-scaleSpring">弹簧式放大</div>
            <div class="code">layui-anim-scaleSpring</div>
        </li>
    </ul>
    <ul class="site-doc-icon site-doc-anim">
        <li>
            <div class="layui-anim" data-anim="layui-anim-fadein">渐现</div>
            <div class="code">layui-anim-fadein</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-fadeout">渐隐</div>
            <div class="code">layui-anim-fadeout</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-rotate">360度旋转</div>
            <div class="code">layui-anim-rotate</div>
        </li>
        <li>
            <div class="layui-anim" data-anim="layui-anim-rotate layui-anim-loop">循环动画</div>
            <div class="code">追加：layui-anim-loop</div>
        </li>
    </ul>
    <%--表单--%>
    <%--<form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">输入框</label>
            <div class="layui-input-block">
                <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码框</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">辅助文字</div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">选择框</label>
            <div class="layui-input-block">
                <select name="city" lay-verify="required">
                    <option value=""></option>
                    <option value="0">北京</option>
                    <option value="1">上海</option>
                    <option value="2">广州</option>
                    <option value="3">深圳</option>
                    <option value="4">杭州</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">复选框</label>
            <div class="layui-input-block">
                <input type="checkbox" name="like[write]" title="写作">
                <input type="checkbox" name="like[read]" title="阅读" checked>
                <input type="checkbox" name="like[dai]" title="发呆">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">开关</label>
            <div class="layui-input-block">
                <input type="checkbox" name="switch" lay-skin="switch">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="男" title="男">
                <input type="radio" name="sex" value="女" title="女" checked>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">文本域</label>
            <div class="layui-input-block">
                <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>--%>

    <script>
        //Demo
        layui.use('form', function(){
            var form = layui.form;

            //监听提交
            form.on('submit(formDemo)', function(data){
                layer.msg(JSON.stringify(data.field));
                return false;
            });
        });
    </script>
</body>
</html>
