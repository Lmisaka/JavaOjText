<%--
  Created by IntelliJ IDEA.
  User: OvO
  Date: 2017/4/26
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="https://cdn.jotfor.ms/static/prototype.forms.js" type="text/javascript"></script>
<script src="https://cdn.jotfor.ms/static/jotform.forms.js?3.3.234" type="text/javascript"></script>
<script src="https://cdn.jotfor.ms/js/vendor/math-processor.js?v=3.3.234" type="text/javascript"></script>
<script type="text/javascript"> JotForm.setCalculations([{
    "decimalPlaces": "2",
    "equation": "[{1}+{3}+{4}+{5}+{6}]",
    "insertAsText": "",
    "newCalculationType": "1",
    "operands": "1,3,4,5,6",
    "readOnly": "1",
    "resultField": "8",
    "showBeforeInput": "",
    "showEmptyDecimals": ""
}]);
JotForm.init();
JotForm.prepareCalculationsOnTheFly([null, null, null, null, null, null, null, {
    "name": "input7",
    "qid": "7",
    "text": "一、单选题",
    "type": "control_head"
}, null, null, null, {
    "name": "input29",
    "qid": "11",
    "text": "分頁工具",
    "type": "control_pagebreak"
}, null, {"name": "input13", "qid": "13", "text": "二、填空题", "type": "control_head"}, {
    "name": "input14",
    "qid": "14",
    "text": "三、问答题",
    "type": "control_head"
}, null, {"name": "input16", "qid": "16", "text": "四、编程题", "type": "control_head"}, {
    "name": "input17",
    "qid": "17",
    "text": "<p><strong>题目：</strong></p>",
    "type": "control_text"
}, {"name": "input18", "qid": "18", "text": "<p><strong>输出：</strong></p>", "type": "control_text"}, {
    "name": "input19",
    "qid": "19",
    "text": "<p>题目：</p>",
    "type": "control_text"
}, null, {"name": "input21", "qid": "21", "text": "提交", "type": "control_button"}, {
    "name": "input22",
    "qid": "22",
    "text": "题目：",
    "type": "control_checkbox"
}, {"name": "input23", "qid": "23", "text": "代码：", "type": "control_textarea"}, {
    "name": "input24",
    "qid": "24",
    "text": "回答：",
    "type": "control_textarea"
}, {"name": "input25", "qid": "25", "text": "题目：", "type": "control_head"}, {
    "name": "1",
    "qid": "26",
    "text": "填空1：",
    "type": "control_textbox"
}, {"name": "input27", "qid": "27", "text": "分頁工具", "type": "control_pagebreak"}, {
    "name": "input27",
    "qid": "28",
    "text": "分頁工具",
    "type": "control_pagebreak"
}, {"name": "input27", "qid": "29", "text": "分頁工具", "type": "control_pagebreak"}, {
    "name": "input30",
    "qid": "30",
    "text": "分頁工具",
    "type": "control_pagebreak"
}]);</script>
<link href="https://cdn.jotfor.ms/static/formCss.css?3.3.234" rel="stylesheet" type="text/css"/>
<link type="text/css" rel="stylesheet" href="https://cdn.jotfor.ms/css/styles/nova.css?3.3.234"/>
<link type="text/css" media="print" rel="stylesheet" href="https://cdn.jotfor.ms/css/printForm.css?3.3.234"/>
<link type="text/css" rel="stylesheet" href="https://cdn.jotfor.ms/themes/CSS/566a91c2977cdfcd478b4567.css?"/>
<style type="text/css"> .form-label-left {
    width: 150px !important;
}

.form-line {
    padding-top: 12px;
    padding-bottom: 12px;
}

.form-label-right {
    width: 150px !important;
}

.form-all {
    width: 690px;
    color: #555 !important;
    font-family: "Lucida Grande", "Lucida Sans Unicode", "Lucida Sans", Verdana, sans-serif;
    font-size: 14px;
}

.form-radio-item label, .form-checkbox-item label, .form-grading-label, .form-header {
    color: #555;
} </style>
<link type="text/css" rel="stylesheet"
      href="https://cdn.jotfor.ms/css/styles/buttons/form-submit-button-simple_green_apple.css?3.3.234"/>
<form class="jotform-form" action="https://submit.jotform.me/submit/71151528884461/" method="post"
      name="form_71151528884461" id="71151528884461" accept-charset="utf-8"><input type="hidden" name="formID"
                                                                                   value="71151528884461"/>
    <div class="form-all">
        <ul class="form-section page-section">
            <li id="cid_11" class="form-input-wide" data-type="control_pagebreak">
                <div class="form-pagebreak" data-component="pagebreak">
                    <div class="form-pagebreak-back-container">
                        <button id="form-pagebreak-back_11" type="button"
                                class="form-pagebreak-back form-submit-button-simple_green_apple"
                                data-component="pagebreak-back"> 返回
                        </button>
                    </div>
                    <div class="form-pagebreak-next-container">
                        <button id="form-pagebreak-next_11" type="button"
                                class="form-pagebreak-next form-submit-button-simple_green_apple"
                                data-component="pagebreak-next"> 开始答题
                        </button>
                    </div>
                    <div style="clear:both;" class="pageInfo form-sub-label" id="pageInfo_11"></div>
                </div>
            </li>
        </ul>
        <ul class="form-section page-section" style="display:none;">
            <li id="cid_7" class="form-input-wide" data-type="control_head">
                <div class="form-header-group ">
                    <div class="header-text httal htvam"><h2 id="header_7" class="form-header" data-component="header">
                        一、单选题 </h2></div>
                </div>
            </li>
            <li class="form-line" data-type="control_checkbox" id="id_22"><label
                    class="form-label form-label-left form-label-auto" id="label_22" for="input_22"> 题目： </label>
                <div id="cid_22" class="form-input jf-required">
                    <div class="form-single-column" data-component="checkbox"><span class="form-checkbox-item"
                                                                                    style="clear:left;"> <span
                            class="dragger-item"> </span> <input type="checkbox" class="form-checkbox" id="input_22_0"
                                                                 name="q22_input22[]" value="A."/> <label
                            id="label_input_22_0" for="input_22_0"> A. </label> </span> <span class="form-checkbox-item"
                                                                                              style="clear:left;"> <span
                            class="dragger-item"> </span> <input type="checkbox" class="form-checkbox" id="input_22_1"
                                                                 name="q22_input22[]" value="B."/> <label
                            id="label_input_22_1" for="input_22_1"> B. </label> </span> <span class="form-checkbox-item"
                                                                                              style="clear:left;"> <span
                            class="dragger-item"> </span> <input type="checkbox" class="form-checkbox" id="input_22_2"
                                                                 name="q22_input22[]" value="C."/> <label
                            id="label_input_22_2" for="input_22_2"> C. </label> </span> <span class="form-checkbox-item"
                                                                                              style="clear:left;"> <span
                            class="dragger-item"> </span> <input type="checkbox" class="form-checkbox" id="input_22_3"
                                                                 name="q22_input22[]" value="D."/> <label
                            id="label_input_22_3" for="input_22_3"> D. </label> </span></div>
                </div>
            </li>
            <li id="cid_29" class="form-input-wide" data-type="control_pagebreak">
                <div class="form-pagebreak" data-component="pagebreak">
                    <div class="form-pagebreak-back-container">
                        <button id="form-pagebreak-back_29" type="button" class="form-pagebreak-back "
                                data-component="pagebreak-back"> 返回
                        </button>
                    </div>
                    <div class="form-pagebreak-next-container">
                        <button id="form-pagebreak-next_29" type="button" class="form-pagebreak-next "
                                data-component="pagebreak-next"> 下一页
                        </button>
                    </div>
                    <div style="clear:both;" class="pageInfo form-sub-label" id="pageInfo_29"></div>
                </div>
            </li>
        </ul>
        <ul class="form-section page-section" style="display:none;">
            <li id="cid_13" class="form-input-wide" data-type="control_head">
                <div class="form-header-group ">
                    <div class="header-text httal htvam"><h2 id="header_13" class="form-header" data-component="header">
                        二、填空题 </h2></div>
                </div>
            </li>
            <li id="cid_25" class="form-input-wide" data-type="control_head">
                <div class="form-header-group ">
                    <div class="header-text httal htvam"><h3 id="header_25" class="form-header" data-component="header">
                        题目： </h3></div>
                </div>
            </li>
            <li class="form-line" data-type="control_textbox" id="id_26"><label
                    class="form-label form-label-left form-label-auto" id="label_26" for="input_26"> 填空1： </label>
                <div id="cid_26" class="form-input jf-required"><input type="text" id="input_26" name="q26_1"
                                                                       data-type="input-textbox" class="form-textbox"
                                                                       size="20" value="" data-component="textbox"/>
                </div>
            </li>
            <li id="cid_28" class="form-input-wide" data-type="control_pagebreak">
                <div class="form-pagebreak" data-component="pagebreak">
                    <div class="form-pagebreak-back-container">
                        <button id="form-pagebreak-back_28" type="button" class="form-pagebreak-back "
                                data-component="pagebreak-back"> 返回
                        </button>
                    </div>
                    <div class="form-pagebreak-next-container">
                        <button id="form-pagebreak-next_28" type="button" class="form-pagebreak-next "
                                data-component="pagebreak-next"> 下一页
                        </button>
                    </div>
                    <div style="clear:both;" class="pageInfo form-sub-label" id="pageInfo_28"></div>
                </div>
            </li>
        </ul>
        <ul class="form-section page-section" style="display:none;">
            <li id="cid_14" class="form-input-wide" data-type="control_head">
                <div class="form-header-group ">
                    <div class="header-text httal htvam"><h2 id="header_14" class="form-header" data-component="header">
                        三、问答题 </h2></div>
                </div>
            </li>
            <li class="form-line" data-type="control_text" id="id_19">
                <div id="cid_19" class="form-input-wide">
                    <div id="text_19" class="form-html" data-component="text"><p>题目：</p></div>
                </div>
            </li>
            <li class="form-line" data-type="control_textarea" id="id_24"><label
                    class="form-label form-label-left form-label-auto" id="label_24" for="input_24"> 回答： </label>
                <div id="cid_24" class="form-input jf-required"><textarea id="input_24" class="form-textarea"
                                                                          name="q24_input24" cols="40" rows="6"
                                                                          data-component="textarea"></textarea></div>
            </li>
            <li id="cid_27" class="form-input-wide" data-type="control_pagebreak">
                <div class="form-pagebreak" data-component="pagebreak">
                    <div class="form-pagebreak-back-container">
                        <button id="form-pagebreak-back_27" type="button" class="form-pagebreak-back "
                                data-component="pagebreak-back"> 返回
                        </button>
                    </div>
                    <div class="form-pagebreak-next-container">
                        <button id="form-pagebreak-next_27" type="button" class="form-pagebreak-next "
                                data-component="pagebreak-next"> 下一页
                        </button>
                    </div>
                    <div style="clear:both;" class="pageInfo form-sub-label" id="pageInfo_27"></div>
                </div>
            </li>
        </ul>
        <ul class="form-section page-section" style="display:none;">
            <li id="cid_16" class="form-input-wide" data-type="control_head">
                <div class="form-header-group ">
                    <div class="header-text httal htvam"><h2 id="header_16" class="form-header" data-component="header">
                        四、编程题 </h2></div>
                </div>
            </li>
            <li class="form-line" data-type="control_text" id="id_17">
                <div id="cid_17" class="form-input-wide">
                    <div id="text_17" class="form-html" data-component="text"><p><strong>题目：</strong></p></div>
                </div>
            </li>
            <li class="form-line" data-type="control_text" id="id_18">
                <div id="cid_18" class="form-input-wide">
                    <div id="text_18" class="form-html" data-component="text"><p><strong>输出：</strong></p></div>
                </div>
            </li>
            <li class="form-line" data-type="control_textarea" id="id_23"><label
                    class="form-label form-label-left form-label-auto" id="label_23" for="input_23"> 代码： </label>
                <div id="cid_23" class="form-input jf-required"><textarea id="input_23" class="form-textarea"
                                                                          name="q23_input23" cols="40" rows="6"
                                                                          data-component="textarea"></textarea></div>
            </li>
            <li id="cid_30" class="form-input-wide" data-type="control_pagebreak">
                <div class="form-pagebreak" data-component="pagebreak">
                    <div class="form-pagebreak-back-container">
                        <button id="form-pagebreak-back_30" type="button" class="form-pagebreak-back "
                                data-component="pagebreak-back"> 返回
                        </button>
                    </div>
                    <div class="form-pagebreak-next-container">
                        <button id="form-pagebreak-next_30" type="button" class="form-pagebreak-next "
                                data-component="pagebreak-next"> 下一部
                        </button>
                    </div>
                    <div style="clear:both;" class="pageInfo form-sub-label" id="pageInfo_30"></div>
                </div>
            </li>
        </ul>
        <ul class="form-section page-section" style="display:none;">
            <li class="form-line" data-type="control_button" id="id_21">
                <div id="cid_21" class="form-input-wide">
                    <div style="margin-left:156px;" class="form-buttons-wrapper">
                        <button id="input_21" type="submit" class="form-submit-button" data-component="button"> 提交
                        </button>
                    </div>
                </div>
            </li>
            <li style="display:none"> Should be Empty: <input type="text" name="website" value=""/></li>
        </ul>
    </div>
    <script> JotForm.showJotFormPowered = true; </script>
    <input type="hidden" id="simple_spc" name="simple_spc" value="71151528884461"/>
    <script type="text/javascript"> document.getElementById("si" + "mple" + "_spc").value = "71151528884461-71151528884461"; </script>
</form>
<script type="text/javascript">JotForm.ownerView = true;</script>
</body>
</html>
