/**自动校对答案
 * 提交表单
 * Created by OvO on 2017/5/6.
 */
function examSubmit() {
    var selectData = {"selectAnswer": []};
    for (var i = 1; i <= 10; i++) {
        selectData["selectAnswer"].push({"id": $('#selectProblem' + i).data("id"),"correct": getAnswerNum(i)});
    }
    var blankData = {"blankAnswer": []};
    for (var i = 1; i <= 5; i++) {
        blankData["blankAnswer"].push({
            "id": $('#blankProblem' + i).data("id"),
            "answer": connectBlankAnswer($('#blankProblem' + i).data("blankNum"), i)
        });
    }
    var unProgrammeData = {"unProgrammeAnswer": []};
    for (var i = 1; i <= 5; i++) {
        unProgrammeData["unProgrammeAnswer"].push({
            "id": $('#unProgrammeProblem' + i).data("id"),
            "answer": $('#unProgrammeProblem' + i + ' #answer').val()
        });
    }
    var programmeData = {"programmeAnswer": []};
    for (var i = 1; i <= 5; i++) {
        programmeData["programmeAnswer"].push({
            "id": $('#programmeProblem' + i).data("id"),
            "detail":$('#programmeProblem' + i+' #answerCode').val(),
            "timeLimit": $('#programmeProblem' + i).data("timeLimit"),
            "output": $('#programmeProblem' + i + ' #answer').val()
        });
    }
    var examData = {};
    examData=changeJsonArray(selectData,examData);
    examData=changeJsonArray(blankData,examData);
    examData=changeJsonArray(unProgrammeData,examData);
    examData=changeJsonArray(programmeData,examData);
    alert(JSON.stringify(examData));
    $.ajax({
        type: 'post',
        url: "/exam/match",
        contentType: 'application/json',
        data:JSON.stringify(examData),
        async:false,
        success:function (data) {
            alert("你的得分为"+data);
        },
        error:function () {
            alert("error");
        }
    });
}
function getAnswerNum(id) {
    var correct = 0;
    if ($('#selectProblem' + id + '#A').is(':checked'))
        correct += 8;
    if ($('#selectProblem' + id + '#B').is(':checked'))
        correct += 4;
    if ($('#selectProblem' + id + '#C').is(':checked'))
        correct += 2;
    if ($('#selectProblem' + id + '#D').is(':checked'))
        correct += 1;
    return correct;
}
function connectBlankAnswer(num, id) {
    var answer = "";
    for (var i = 1; i < num; i++) {
        answer += $('#blankProblem' + id + ' #' + i).val();
        answer += ",";
    }
    answer += $('#blankProblem' + id + ' #' + num).val();
    return answer;
}
function changeJsonArray(json,examData) {
    for(var i in json){
        examData[i] = json[i];
    }
    return examData;
}