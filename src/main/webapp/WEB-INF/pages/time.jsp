<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet" type="text/css" href="../../resources/css/bootstrap-3.3.4.css">
<link href="../../resources/css/style2.css" rel="stylesheet">
<link href="../../resources/css/time.css" rel="stylesheet">

<script src="../../resources/js/jquery-1.8.3.min.js"></script>
<script src="../../resources/js/jquery.lwtCountdown-1.0.js"></script>

</head>
<body>
<div class="header">
	<h1>Comming Soon</h1>
</div>
<div class="container">
	<div class="timer-box">
		<div id="countdown">
					<div class="dash weeks_dash">
						<span class="dash_title">周</span>
						<div class="digit">0</div>
						<div class="digit">0</div>
					</div>

					<div class="dash days_dash">
						<span class="dash_title">天</span>
						<div class="digit">0</div>
						<div class="digit">0</div>
					</div>

					<div class="dash hours_dash">
						<span class="dash_title">小时</span>
						<div class="digit">0</div>
						<div class="digit">0</div>
					</div>

					<div class="dash minutes_dash">
						<span class="dash_title">分</span>
						<div class="digit">0</div>
						<div class="digit">0</div>
					</div>

					<div class="dash seconds_dash">
						<span class="dash_title">秒</span>
						<div class="digit">0</div>
						<div class="digit">0</div>
					</div>
			</div> <!-- end of countdown -->
	</div><!--/timer-box-->
</div><!--/container-->

<!-- start of the javascript code that handles the countdown -->
<script language="javascript" type="text/javascript">
	jQuery(document).ready(function() {
		$('#countdown').countDown({
		targetDate: {
		'day': 0,
		'month': 0,
		'year': 0,
		'hour': 2,
		'min': 0,
		'sec': 0
		}
		});
		$('#email_field').focus(email_focus).blur(email_blur);
		$('#subscribe_form').bind('submit', function() { return false; });
	}); 
</script>
</body>
</html>

