<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Cookie[] cookies = request.getCookies();
	String id = "";
	if(cookies!=null){
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals("id")){
				id = cookies[i].getValue();
			}
		}
	}
%>
<script type="text/javascript">
	$(document).ready(function){
		$("#id").on("keyup",function(){
			$.get("/erp/emp/login.do",
  					{"id":$("#id").val()},
  					function(data){ //data는 응답되어 오는 데이터를 자동으로  success란에 명시하는 함수의 매개변수로 전달
  										  //-----------------------  ---> Ajax성공으로 받은 데이터
  										  //Ajax로 요청해서 응답받은 데이터를 <span>태그의 내부 텍스트로 출력
  						$("#checkVal").text(data);
  				},
  				"text");
 	  		});
  	});
		}
	}
</script>
</head>
<body>
	<form name="login_frm" action="/erp/emp/login.do" method="post">
		<table cellpadding="0" cellspacing=5 width="815" bgcolor=#f3f3f3
			border=0>
			<tr>
				<td bgcolor=#ffffff height=100% align=center valign=top>
					<table cellpadding=0 cellspacing=0 border=0 width=710>

					
						<tr>
							<td>
								<table cellpadding="0" cellspacing=0 width="100%"
									bgcolor=#f7f7f7 border=0>
									<tr>
										<td bgcolor=#ffffff align=center>

											<table cellpadding="0" cellspacing="0" border=0 align=center
												width=678>
												<tr>
													<td align=center width=353>

														<table cellpadding="0" cellspacing="0" border=0 width=353>
															<tr>
																<td>
																	<table cellpadding="0" cellspacing="0" border=0>

																		<tr>
																			<td colspan=3><img
																				src="/erp/images/page_login.gif"></td>
																		</tr>
																		<tr>
																			<td height=25></td>
																		</tr>
																		<tr>
																			<td background="/erp/images/inputBg.gif"><img
																				src="/erp/images/login_id.gif"></td>
																			<td background="/erp/images/inputBg.gif"><input
																				type="text" name="id" size="15" class="grayinput"
																				tabindex=1 style="width: 156;"
																				 value="<%= id%>"></td>
																			<td rowspan=3 style="padding-left: 10" valign=bottom>
																			<input
																				type='image' src="/erp/images/btn_login.gif"
																				border="0" tabindex=3></td>
																		</tr>
																		<tr>
																			<td height=10></td>
																		</tr>
																		<tr>
																			<td background="/erp/images/inputBg.gif"><img
																				src="/erp/images/login_pass.gif"></td>
																			<td background="/erp/images/inputBg.gif"><input
																				type="password" name="pass" size="15"
																				class="grayinput" tabindex='2' style='width: 156;'>
																			</td>
																		</tr>
																		<tr>
																			<td colspan=3 align=right
																				style="padding-right: 9; padding-top: 12"><span
																				style="display: inline"><label
																					for="member_id_save"><input type="checkbox"
																						name="member_id_save" id="member_id_save"
																						value="T" <%if(id.length()!=0) %><%= "checked" %> />아이디저장</label> </span></td>
																		</tr>
																	</table>
																</td>
															</tr>
															<tr>
																<td colspan=3></td>
															</tr>

														</table>

													</td>

													<td style="padding-left: 60; padding-top: 60"></td>
												</tr>
												<tr>
													<td colspan=3 style="padding-top: 20" style=padding-left:40></td>
												</tr>
											</table>

										</td>
									</tr>
								</table>
							</td>
						</tr>


						<tr>
							<td height=30></td>
						</tr>
						<tr>
							<td></td>
						</tr>

						<tr>
							<td height=49></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>