<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
	margin-top: 50px;
}
.row{
	margin: 0px auto;
	width:960px;
}
</style>
<!-- <script type="text/javascript">
$(function(){
	$('#msg').keyup(function(){
		let m=$('#msg').val();
		$('#print').text(m);
	})
})
</script> -->
</head>
<body>
<%--
	1. VueJS의 생명주기 => vue3(React) , vuex (MVC)
		beforeCreate
		created
		------------ Vue 객체 생성
		beforeMount
		mounted
		------------ 메모리에 저장
		beforeUpdate
		updated
		------------ 수정
		beforeDestroy
		destroyed
		------------ 메모리 해제 (가상 돔)
		가상돔 : 게임(더블버퍼링) => 메모리를 두개 생성 (가상메모리 => 실제 메모리)
		String => 메모리와 연결 , StringBuffer
	2. 디렉티브
	3. 컴포넌트 : 재사용
	4. 데이터를 읽어서 출력 (클라이언트 <=> 서버 통신)
	
	
		생명주기 함수 이용
		mounted:function() {}
		updated:function() {}
		사용자 정의 함수 => 이벤트
		methods:{
			aaa:function() {}
		}
		filters: 변환 (날짜, 숫자)
		-------- complete
	})
	</script>
	
	==> 데이터 출력
	{(data에 설정된 변수 사용)}
	=> 한번에 데이터를 출력 => {{$data}}
	=> <img src="{{poster}}" => 오류 발생
	=> <img :src="poster">
	=> : => <input type="text" :value="id"> => v-bind:
											   ------ 생략이 가능	
 --%>
 <div class="container">
 	<div class="row">
 		<!-- 양방향 : 입력값을 받아서 출력을 하는 역할 -->
 		입력:<input type="text" v-model="msg" size="30" class="input-sm">
 		<!-- v-model => 멤버변수값을 변경 -->
 		<div id="print"><!-- 출력 : msg에 저장된 내용을 출력 -->
 		{{msg}}
 		</div>
 	</div>
 </div>
 <script>
 	new Vue({
 		el:'.container',
 		data:{
 			msg:''
 		}
 	})
 </script>
</body>
</html>