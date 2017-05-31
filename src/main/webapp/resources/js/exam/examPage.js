/**
 * Created by OvO on 2017/5/8.
 */
function countDown() {
    var sec = parseInt($('#sec').html());
    if (sec == 0) {
        var min = parseInt($('#min').html());
        if (min != 0) {
            min--;
        }
        else {
            $('#examForm').submit();
        }
        $('#min').html(min);
        sec=59;
        $('#sec').html(sec);
    } else {
        sec--;
        $('#sec').html(sec);
    }
}