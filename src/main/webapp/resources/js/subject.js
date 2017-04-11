/**
 * Created by OvO on 2017/4/6.
 */
function addBlank() {
    var data={

    };
    $.ajax({
        type: 'POST',
        url: '/add/blank',
        contentType: 'application/json;charset=UTF-8',
        dataType: 'json',
        data: JSON.stringify(data),
        success: function (data) {
            alert("false");
            if (data.result == "success") {
                alert("OK");
            } else {
                alert("error");
            }
        },
    });
}