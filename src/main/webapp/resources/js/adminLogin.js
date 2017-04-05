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
    var username = $("#adusername").val();
    var data = {
        "adUsername": $("#adUsername").val(),
        "adPassword": $('#adPassword').val()
    };
    $.ajax({
        type: 'POST',
        cache: false,
        url: '/admin/login.do',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        data: JSON.stringify(data),
        success: function (data) {
            alert("false");
            if (data.result == "success") {
                alert("OK");
                window.location.href = "http://localhost:8080/admin/index?username=" + username;
            } else {
                alert("error");
            }
        },
    });
};
//bilibili js
function domReader() {
    $.ajax({
        url: "//api.bilibili.com/x/web-show/join?cross_domain=true",
        type: "GET",
        dataType: "json",
        success: function (a) {
            var b, c, d, e, f, g;
            if (a && "[object Object]" === Object.prototype.toString.call(a) && (b = a.code, c = a.data || [], 0 == b && c.length > 0)) {
                for (d = [], e = c.length; e--;)d.push(c[e]);
                if (f = location.hash.split("#"), f.length > 1) {
                    for (g = 0; g < d.length; g++)if (f[1] == d[g].id) {
                        addData(d), getDom(d[g]);
                        break
                    }
                } else addData(d);
                $(".back_button").click(function () {
                    _clearHash(), $(".master_job").fadeOut(400), $(".master_list").fadeIn(400)
                })
            }
        },
        error: function () {
            alert("抱歉，网络错误，请刷新本页后重试~")
        }
    })
}
function randomPic() {
    var a = ["//static.hdslb.com/activity/jobs/img/ds.png", "//static.hdslb.com/activity/jobs/img/22.png", "//static.hdslb.com/activity/jobs/img/sit.png", "//static.hdslb.com/activity/jobs/img/welcome.png"], b = Math.floor(Math.random() * a.length);
    $(".bg_pic").css("background", "url(" + a[b].replace("http:", "") + ") no-repeat")
}
function addData(a) {
    var b = {location: "", jobs_classification: ""};
    render(1, b, a), $(".location .block").click(function () {
        _clearHash(), $(this).siblings().removeClass("active"), $(this).addClass("active"), b.location = "不限" == $(this).html() ? "" : $(this).html(), render(1, b, a), randomPic()
    }), $(".job .block").click(function () {
        _clearHash(), randomPic(), $(this).siblings().removeClass("active"), $(this).addClass("active"), jobId = $(this).attr("id"), "不限" == $(this).html() ? (b.jobs_classification = "", $(".Jname").html("所有职位"), $(".big_title .icons").attr("class", "icons " + jobId)) : (b.jobs_classification = $(this).html() + "类", $(".Jname").html($(this).html() + "类"), $(".big_title .icons").attr("class", "icons " + jobId)), render(1, b, a)
    })
}
function render(a, b, c) {
    var e, f, g, h, i, d = [];
    for (e = 0; e < c.length; e++) {
        f = !0;
        for (g in b)h = b[g].substring(0, b[g].length - 1), i = c[e][g].substring(0, c[e][g].length - 1), b.hasOwnProperty(g) && (!b[g] || b[g] && h == i || (f = !1));
        f && d.push(c[e])
    }
    for ($(".jobs_numb span").html(d.length), $(".master_job").fadeOut(400), $(".master_list").fadeIn(400), $(".pagelistbox").empty(), pagelist($(".pagelistbox"), a, Math.ceil(d.length / 14), d.length, function (a) {
        render(a, b, d)
    }, null, 2), $(".list").empty(), g = 14 * (a - 1); g < Math.min(d.length, 14 * a); g++)!function (a) {
        $(".list").append($('<div class="list_block" oid="' + a + '">' + '<div class="jobs_name">' + d[a].name + "</div>" + '<div class="jobs_classification">' + d[a].jobs_classification + "</div>" + '<div class="jobs_location">' + d[a].location + "</div>" + "</div>").click(function () {
            getDom(d[a])
        }))
    }(g);
    d.length || $(".list").html("好像暂时没有这样的职位也 (“▔□▔)")
}
function getDom(a) {
    var b, c;
    location.hash = a.id, $(".master_job .big_title").html(a.name), $(".location  .text").html('<i class="jobs-icon-blue-dots"></i>' + a.location), b = a.duty, b = b.substr(0, b.length - 1), b = b.replace(/；/g, '<br/><i class="jobs-icon-blue-dots"></i> '), $(".duty .duty_text").html('<i class="jobs-icon-blue-dots"></i> ' + b), c = a.demand, c = c.substr(0, c.length - 1), c = c.replace(/；/g, '<br/><i class="jobs-icon-blue-dots"></i> '), $(".demand .demand_text").html('<i class="jobs-icon-blue-dots"></i> ' + c), $(".master_job").fadeIn(400), randomPic(), $(".master_list").fadeOut(400)
}
function _clearHash() {
    location.hash = " ", history.pushState("", document.title, window.location.pathname)
}
domReader();