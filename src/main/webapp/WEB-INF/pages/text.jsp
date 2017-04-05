<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>生产欢乐的地方~</title>
    <meta name="description" content="bilibili是国内知名的视频弹幕网站，这里有最及时的动漫新番，最棒的ACG氛围，最有创意的Up主。大家可以在这里找到许多欢乐。" />
    <meta name="keywords" content="B站,弹幕,字幕,AMV,MAD,MTV,ANIME,动漫,动漫音乐,游戏,游戏解说,ACG,galgame,动画,番组,新番,初音,洛天依,vocaloid 招聘 加入我们">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="shortcut icon" href="//static.hdslb.com/images/favicon.ico">
    <link rel="search" type="application/opensearchdescription+xml" href="//static.hdslb.com/opensearch.xml" title="哔哩哔哩" />
    <link rel="stylesheet" href="//static.hdslb.com/activity/jobs/css/style.css?ver=2.1" type="text/css" />
    <link rel="stylesheet" type="text/css" href="//static.hdslb.com/plugins/mCustomScrollbar/jquery.mCustomScrollbar.min.css">
    <script type="text/javascript" src="//static.hdslb.com/js/jquery.min.js"></script>
    <script type="text/javascript" src="//static.hdslb.com/js/core-v5/base.core.js"></script>
    <script type="text/javascript" src="//static.hdslb.com/plugins/mCustomScrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <style type="text/css">
        .master_title {
            width: 800px;
        }
    </style>
</head>
<body>
<div class="bg_pic"></div>
<div class="main">
    <div class="side_main">
        <a href="//www.bilibili.com/html/join.html"><div class="logo"></div></a>
        <div class="side_select">
            <div class="select_block">
                <div class="location">
                    <div class="title"><span class="loca"></span>工作地点</div>
                    <div class="select">
                        <div class="block active">不限</div>
                        <div class="block" >北京</div>
                        <div class="block">上海</div>
                        <div class="block">日本</div>
                    </div>
                </div>
                <div class="job">
                    <div class="title"><span class="jobs"></span>职位类别</div>
                    <div class="select">
                        <div class="block active" id="all">不限</div>
                        <div class="block" id="tech">技术</div>
                        <div class="block" id="content">内容</div>
                        <div class="block" id="design">设计</div>
                        <div class="block" id="game">游戏</div>
                        <div class="block" id="role">职能</div>
                        <div class="block" id="pm">产品运营</div>
                        <div class="block" id="marketing">市场营销策划</div>
                    </div>
                </div>
                <div class="tips">
                    <p>作品及简历投递邮箱</p>
                    <p style="font-weight: bold;font-size: 12px">zhaopin@bilibili.com</p>
                    <p>邮件标题格式</p>
                    <p style="font-weight: bold;font-size: 12px">"职位名-真名-来自主站"</p>
                </div>
            </div>
        </div>
        <div class="shadow"></div>
    </div>
    <div class="master_main">
        <div class="master_list">
            <div class="master_title">
                <div class="big_title"><div class="icons all"></div><div class="Jname">所有职位</div></div>
                <div class="jobs_numb">共<span>10</span>个职位在招</div>
            </div>
            <div class="jobs_list">
                <div class="jobs_list_title">
                    <div class="jobs_name">职位名称</div>
                    <div class="jobs_classification color">职位类别</div>
                    <div class="jobs_location color">工作地点</div>
                </div>
                <div class="list"></div>
            </div>
            <div class="pagelistbox"></div>
        </div>
        <div class="master_job">
            <div class="back_button"> < 返回</div>
            <div class="master_title">
                <div class="big_title"></div>
            </div>
            <div class="job_blcok">
                <div class="location block">
                    <div class="title">工作地点</div>
                    <p class="text">
                        <i class="jobs-icon-blue-dots"></i>
                    </p>
                </div>
                <div class="duty block">
                    <div class="title">工作职责</div>
                    <div class="duty_text">
                    </div>
                </div>
                <div class="demand block">
                    <div class="title">职位要求</div>
                    <div class="demand_text">
                    </div>
                </div>
                <div class="post block">
                    <div class="title">投递方式</div>
                    <p class="text">
                        <i class="jobs-icon-blue-dots"></i>
                        详细个人介绍与简历投递至<br>
                    <p style="font-size: 18px;color: #f25d8e;font-weight: bold;">　zhaopin@bilibili.com</p>
                    </p>
                    <p class="text">
                        <i class="jobs-icon-blue-dots"></i>
                        邮件标题格式为<br>
                        　"职位名-真名-来自主站"
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="//static.hdslb.com/activity/jobs/js/zhaopin-pc.js?ver=4"></script>
<script type="text/javascript">
    var x = $('.side_select').mCustomScrollbar({
        axis: "y",
        scrollInertia: 200,
        set_height:$(window).height()-200,
        advanced:{ autoExpandHorizontalScroll:true },
        advanced:{ updateOnContentResize:true },
        mouseWheel: {
            scrollAmount: 100,
            preventDefault: true
        }
    });
    $(window).resize(function(){
        $('.side_select').mCustomScrollbar('destroy');
        $('.side_select').mCustomScrollbar({
            axis: "y",
            scrollInertia: 200,
            set_height:$(window).height()-200,
            advanced:{ autoExpandHorizontalScroll:true },
            advanced:{ updateOnContentResize:true },
            mouseWheel: {
                scrollAmount: 100,
                preventDefault: true
            }
        });
    })
</script>
</body>
</html>
