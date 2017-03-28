$(function () {

    $('#switch_qlogin').click(function () {
        $('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
        $('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
        $('#switch_bottom').animate({left: '0px', width: '70px'});
        $('#qlogin').css('display', 'none');
        $('#web_qr_login').css('display', 'block');
    });
});
function admin_login() {
        //登陆ajax
        var data = {
            "adUsername": $("#adUsername").val(),
            "adPassword": $('#adPassword').val()
        };
        $.ajax({
            type: 'POST',
            url: '/admin/login.do',
            contentType: 'application/json;charset=UTF-8',
            dataType: 'json',
            data:JSON.stringify(data),
            success: function (data) {
                if (data.result == "success") {
                    alert("success");
                    window.location.href = "text";
                } else {
                    alert("error");
                }
            },
        });
};