-- 사용자 사용자번호 1~
insert into user(user_no, email, name, password, major, introduce, login_method, create_date)
  values(1, 'ha@gamil.com', '하정우', 'a1111', '컴퓨터공학', '안녕하세요', '0', '2020-4-20');
insert into user(user_no, email, name, password, tel, major, introduce, profile_photo, login_method, create_date)
  values(2, 'kim@gamil.com', '김사랑', 'k1111', '010-1111-2222', '수학', '안녕', 'b.gif', '1', '2020-4-21');
insert into user(user_no, email, name, password, tel, introduce, profile_photo, login_method, create_date)
  values(3, 'lim@gamil.com', '임윤아', 'l1111', '010-1111-3333', '하이', 'c.gif', '1', '2020-4-22');
insert into user(user_no, email, name, password, tel, major, introduce, profile_photo, login_method, create_date)
  values(4, 'son@gamil.com', '손흥민', 's1111', '010-1111-4444', '사회', '할룽', 'd.gif', '0', '2020-4-23');
insert into user(user_no, email, name, password, tel, major, profile_photo, login_method, create_date)
  values(5, 'naldo@gamil.com', '호날두', 'n1111', '010-1111-5555', '역사', 'e.gif', '0', '2020-4-24');

-- 쪽지 쪽지번호 11~
insert into message(message_no, caller_no, receiver_no, content, create_date) 
  values(11, '1', '2', '안녕하세요', '2020-4-20');
insert into message(message_no, caller_no, receiver_no, content, create_date) 
  values(12, '2', '1', '안녕', '2020-04-21');
insert into message(message_no, caller_no, receiver_no, content, create_date) 
  values(13, '3', '5', '할룽', '2020-04-22');
insert into message(message_no, caller_no, receiver_no, content, create_date) 
  values(14, '4', '4', '바이룽', '2020-04-23');
insert into message(message_no, caller_no, receiver_no, content, create_date) 
  values(15, '5', '3', '하이', '2020-04-24');
  
-- 클래스 클래스번호 101~ / 룸번호 1000~
insert into class(class_no, name, room, class_code, create_date) 
  values(101, '컴퓨터', '어렵다', 'abc', '2020-4-20');
insert into class(class_no, name, description, room, class_code, create_date) 
  values(102, '수학', '수학과놀이', '하기싫다', 'sdf', '2020-4-22');
insert into class(class_no, name, description, class_code, create_date) 
  values(103, '과학', '과학놀이터', 'wer', '2020-4-23');
insert into class(class_no, name, description, room, class_code, create_date) 
  values(104, '사회', '사회사회', '헐퀴', 'fgh', '2020-4-24');
insert into class(class_no, name, class_code, create_date) 
  values(105, '역사', 'abqwe', '2020-4-25');
  
  
-- 게시판 ~10000
insert into board(board_no, title, class_no, notice) 
  values(10000, '휴강안내', '101', '1');
insert into board(board_no, title, class_no, notice) 
  values(10001, '1조', '102', '0');
insert into board(board_no, title, class_no, notice) 
  values(10002, '2조', '103', '1');
insert into board(board_no, title, class_no, notice) 
  values(10003, '3조', '104', '1');
insert into board(board_no, title, class_no, notice) 
  values(10004, '4조', '105', '0');
  
  
-- 수업참여 ~100000
insert into class_member(member_no, user_no, class_no, role) 
  values(100000, '1', '101', '0');
insert into class_member(member_no, user_no, class_no, role) 
  values(100001, '2', '102', '1');
insert into class_member(member_no, user_no, class_no, role) 
  values(100002, '3', '103', '0');
insert into class_member(member_no, user_no, class_no, role) 
  values(100003, '4', '104', '1');
insert into class_member(member_no, user_no, class_no, role) 
  values(100004, '5', '105', '1');
  
  
-- 질문 50~
insert into question(question_no, member_no, title, file, deadline, create_date) 
  values(50, '100000', '렘이란?', 'a.gif', '2020-4-20', '2020-4-21');  
insert into question(question_no, member_no, title, content, deadline, create_date) 
  values(51, '100001', '수학이란?', '무엇?', '2020-4-20', '2020-4-21');  
insert into question(question_no, member_no, title, content, file, deadline, create_date) 
  values(52, '100002', '과학이란?', 'what?', 'b.gif', '2020-4-20', '2020-4-21');  
insert into question(question_no, member_no, title, content, file, create_date) 
  values(53, '100003', '사회란?', 'whatthe?', 'c.gif', '2020-4-21');  
insert into question(question_no, member_no, title, content, file, deadline, create_date) 
  values(54, '100004', '역사란?', 'wow?', 'd.gif', '2020-4-20', '2020-4-21');  
  
-- 객관식항목 500~
insert into multiple(multiple_no, question_no, no, content) 
  values(500, '50', '1', '다음중 렘인 것은?');  
insert into multiple(multiple_no, question_no, no, content) 
  values(501, '51', '2', '다음중 삼각형은?');  
insert into multiple(multiple_no, question_no, no, content) 
  values(502, '52', '3', '다음중 공기는?');  
insert into multiple(multiple_no, question_no, no, content) 
  values(503, '53', '4', '다음중 우정은?');  
insert into multiple(multiple_no, question_no, no, content) 
  values(504, '54', '5', '다음중 조선시대는?');  
  
-- 태그 5000~
insert into tag(tag_no, name) 
  values(5000, '즐겨찾기1');  
insert into tag(tag_no, name) 
  values(5001, '즐겨찾기2');  
insert into tag(tag_no, name) 
  values(5002, '즐겨찾기3');  
insert into tag(tag_no, name) 
  values(5003, '즐겨찾기4');  
insert into tag(tag_no, name) 
  values(5004, '즐겨찾기5');  
  insert into tag(tag_no, name) 
  values(5005, '즐겨찾기6');  
insert into tag(tag_no, name) 
  values(5006, '즐겨찾기7');  
insert into tag(tag_no, name) 
  values(5007, '즐겨찾기8');  
insert into tag(tag_no, name) 
  values(5008, '즐겨찾기9');  
insert into tag(tag_no, name) 
  values(5009, '즐겨찾기10');
insert into tag(tag_no, name) 
  values(5010, '즐겨찾기11');  
insert into tag(tag_no, name) 
  values(5011, '즐겨찾기12');  
insert into tag(tag_no, name) 
  values(5012, '즐겨찾기13');  
insert into tag(tag_no, name) 
  values(5013, '즐겨찾기14');  
insert into tag(tag_no, name) 
  values(5014, '즐겨찾기15');
  insert into tag(tag_no, name) 
  values(5015, '즐겨찾기16');  
insert into tag(tag_no, name) 
  values(5016, '즐겨찾기17');  
insert into tag(tag_no, name) 
  values(5017, '즐겨찾기18');  
insert into tag(tag_no, name) 
  values(5018, '즐겨찾기19');
  
-- 질문 태그 50000~
insert into question_tag(question_no, tag_no) 
  values(50, '5000');  
  insert into question_tag(question_no, tag_no) 
  values(51, '5001'); 
  insert into question_tag(question_no, tag_no) 
  values(52, '5009'); 
  insert into question_tag(question_no, tag_no) 
  values(53, '5003'); 
  insert into question_tag(question_no, tag_no) 
  values(54, '5004'); 
  
-- 클래스 태그 500000~
insert into class_tag(class_no, tag_no) 
  values(101, '5001');  
insert into class_tag(class_no, tag_no) 
  values(102, '5005');  
insert into class_tag(class_no, tag_no) 
  values(103, '5006');  
insert into class_tag(class_no, tag_no) 
  values(104, '5007');  
insert into class_tag(class_no, tag_no) 
  values(105, '5008');  
  
  
-- 과제 22~
insert into assignment(assignment_no, class_no, member_no, title, file, deadline, standard, create_date) 
  values(22, '101', '100000', '근의공식', 'a.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(assignment_no, class_no, member_no, title, content, file, deadline, standard, create_date) 
  values(23, '102', '100001', '네모', '네모에 대해 알아오라', 'b.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(assignment_no, class_no, member_no, title, content, deadline, standard, create_date) 
  values(24, '103', '100002', '구름', '구름에 대해 알아오라', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(assignment_no, class_no, member_no, title, content, file, deadline, standard, create_date) 
  values(25, '104', '100003', '인간', '인간에 대해 알아오라', 'd.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(assignment_no, class_no, member_no, title, content, file, deadline, create_date) 
  values(26, '105', '100004', '이순신', '이순신에 대해 알아오라', 'e.gif', '2020-04-21', '2020-03-26');
  
-- 과제제출 
insert into assignment_submmit(member_no, assignment_no, score, content, feedback, create_date) 
  values(100000, '22', '100', '만점', '잘했습니다.', '2020-04-23' );  
insert into assignment_submmit(member_no, assignment_no, file, content, feedback, create_date) 
  values(100001, '23', 'b.gif', '2등', '괜찮아요.', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, create_date) 
  values(100002, '24', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, file, score, content, create_date) 
  values(100003, '25', 'd.gif', '40', '4등', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, file, score, feedback, create_date) 
  values(100004, '26', 'e.gif', '20', '낼봅시다.', '2020-04-23' ); 
  
-- 과제 태그 
insert into assignment_tag(assignment_no, tag_no) 
  values(22, '5002');    
insert into assignment_tag(assignment_no, tag_no) 
  values(23, '5010');    
insert into assignment_tag(assignment_no, tag_no) 
  values(24, '5011');    
insert into assignment_tag(assignment_no, tag_no) 
  values(25, '5012');    
insert into assignment_tag(assignment_no, tag_no) 
  values(26, '5013');    
  
-- 답변
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(100000, '50', '잘모르겠습니다.', '500', '2020-4-21');    
insert into answer(member_no, question_no, multiple_no, create_date) 
  values(100001, '51', '501', '2020-4-21');   
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(100002, '52', '제출함.', '502', '2020-4-21');   
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(100003, '53', '몰겠어여.', '503', '2020-4-21');   
insert into answer(member_no, question_no, content, create_date) 
  values(100004, '54', '어려워요.', '2020-4-21');   
  
-- 게시글 예제 데이터 ~100000 xxxx
insert into post(post_no, board_no, member_no, title, content, create_date) 
  values(777, '10000', '100000', '휴강안내합니다', '30일휴강', '2020-4-20');
insert into post(post_no, board_no, member_no, title, content, create_date) 
  values(778, '10001', '100001', '중간고사', '다음주', '2020-4-20');
insert into post(post_no, board_no, member_no, title, content, create_date) 
  values(779, '10002', '100002', '기말고사', '다음달', '2020-4-20');
insert into post(post_no, board_no, member_no, title, create_date) 
  values(780, '10003', '100003', '숙제', '2020-4-20');
insert into post(post_no, board_no, member_no, title, content, create_date) 
  values(781, '10004', '100004', '과제', '3번문제', '2020-4-20');
  
  
-- 게시글 태그
insert into board_tag(post_no, tag_no) 
  values(777, '5014');  
insert into board_tag(post_no, tag_no) 
  values(778, '5015');  
insert into board_tag(post_no, tag_no) 
  values(779, '5016');  
insert into board_tag(post_no, tag_no) 
  values(780, '5017');  
insert into board_tag(post_no, tag_no) 
  values(781, '5018');  
  
  
  

  
  
  
  
  
  
  
