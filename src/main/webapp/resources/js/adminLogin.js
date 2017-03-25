$(function () {

    $('#switch_qlogin').click(function () {
        $('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
        $('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
        $('#switch_bottom').animate({left: '0px', width: '70px'});
        $('#qlogin').css('display', 'none');
        $('#web_qr_login').css('display', 'block');
    });
});
function login() {
        //登陆ajax
        var data = {
            "username": $("#ad_username").val(),
            "password": $('#ad_password').val()
        };
        $.ajax({
            type: 'POST',
            url: '/text/login.do',
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