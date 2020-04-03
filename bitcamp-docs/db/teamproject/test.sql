-- 사용자 사용자번호 1~
insert into user(email, name, password, major, introduce, login_method, create_date)
  values('ha@gamil.com', '하정우', 'a1111', '컴퓨터공학', '안녕하세요', '0', '2020-4-20');
insert into user(email, name, password, tel, major, introduce, profile_photo, login_method, create_date)
  values('kim@gamil.com', '김사랑', 'k1111', '010-1111-2222', '수학', '안녕', 'b.gif', '1', '2020-4-21');
insert into user(email, name, password, tel, introduce, profile_photo, login_method, create_date)
  values('lim@gamil.com', '임윤아', 'l1111', '010-1111-3333', '하이', 'c.gif', '1', '2020-4-22');
insert into user(email, name, password, tel, major, introduce, profile_photo, login_method, create_date)
  values('son@gamil.com', '손흥민', 's1111', '010-1111-4444', '사회', '할룽', 'd.gif', '0', '2020-4-23');
insert into user(email, name, password, tel, major, profile_photo, login_method, create_date)
  values('naldo@gamil.com', '호날두', 'n1111', '010-1111-5555', '역사', 'e.gif', '0', '2020-4-24');

-- 쪽지 쪽지번호 11~
insert into message(caller_no, receiver_no, content, create_date) 
  values('1', '2', '안녕하세요', '2020-4-20');
insert into message(caller_no, receiver_no, content, create_date) 
  values('2', '1', '안녕', '2020-04-21');
insert into message(caller_no, receiver_no, content, create_date) 
  values('3', '5', '할룽', '2020-04-22');
insert into message(caller_no, receiver_no, content, create_date) 
  values('4', '4', '바이룽', '2020-04-23');
insert into message(caller_no, receiver_no, content, create_date) 
  values('5', '3', '하이', '2020-04-24');
  
-- 클래스 클래스번호 101~ / 룸번호 1000~
insert into class(name, room, class_code, create_date) 
  values('컴퓨터', '어렵다', 'abc', '2020-4-20');
insert into class(name, description, room, class_code, create_date) 
  values('수학', '수학과놀이', '하기싫다', 'sdf', '2020-4-22');
insert into class(name, description, class_code, create_date) 
  values('과학', '과학놀이터', 'wer', '2020-4-23');
insert into class(name, description, room, class_code, create_date) 
  values('사회', '사회사회', '헐퀴', 'fgh', '2020-4-24');
insert into class(name, class_code, create_date) 
  values('역사', 'abqwe', '2020-4-25');
  
  
-- 게시판 ~10000
insert into board(title, class_no, notice) 
  values('휴강안내', '1', '1');
insert into board(title, class_no, notice) 
  values('1조', '2', '0');
insert into board(title, class_no, notice) 
  values('2조', '3', '1');
insert into board(title, class_no, notice) 
  values('3조', '4', '1');
insert into board(title, class_no, notice) 
  values('4조', '5', '0');
  
  
-- 수업참여 ~100000
insert into class_member(user_no, class_no, role) 
  values('1', '1', '0');
insert into class_member(user_no, class_no, role) 
  values('2', '2', '1');
insert into class_member(user_no, class_no, role) 
  values('3', '3', '0');
insert into class_member(user_no, class_no, role) 
  values('4', '4', '1');
insert into class_member(user_no, class_no, role) 
  values('5', '5', '1');
  
  
-- 질문 50~
insert into question(member_no, title, file, deadline, create_date) 
  values('5', '렘이란?', 'a.gif', '2020-4-20', '2020-4-21');  
insert into question(member_no, title, content, deadline, create_date) 
  values('4', '수학이란?', '무엇?', '2020-4-20', '2020-4-21');  
insert into question(member_no, title, content, file, deadline, create_date) 
  values('3', '과학이란?', 'what?', 'b.gif', '2020-4-20', '2020-4-21');  
insert into question(member_no, title, content, file, create_date) 
  values('2', '사회란?', 'whatthe?', 'c.gif', '2020-4-21');  
insert into question(member_no, title, content, file, deadline, create_date) 
  values('1', '역사란?', 'wow?', 'd.gif', '2020-4-20', '2020-4-21');  
  
-- 객관식항목 500~
insert into multiple(question_no, no, content) 
  values('1', '1', '다음중 렘인 것은?');  
insert into multiple(question_no, no, content) 
  values('2', '2', '다음중 삼각형은?');  
insert into multiple(question_no, no, content) 
  values('3', '3', '다음중 공기는?');  
insert into multiple(question_no, no, content) 
  values('4', '4', '다음중 우정은?');  
insert into multiple(question_no, no, content) 
  values('5', '5', '다음중 조선시대는?');  
  
-- 태그 5000~
insert into tag(name) 
  values('즐겨찾기1');  
insert into tag(name) 
  values('즐겨찾기2');  
insert into tag(name) 
  values('즐겨찾기3');  
insert into tag(name) 
  values('즐겨찾기4');  
insert into tag(name) 
  values('즐겨찾기5');  

  
-- 질문 태그 50000~
insert into question_tag(question_no, tag_no) 
  values(1, '5');  
  insert into question_tag(question_no, tag_no) 
  values(2, '4'); 
  insert into question_tag(question_no, tag_no) 
  values(3, '3'); 
  insert into question_tag(question_no, tag_no) 
  values(4, '2'); 
  insert into question_tag(question_no, tag_no) 
  values(5, '1'); 
  
-- 클래스 태그 500000~
insert into class_tag(class_no, tag_no) 
  values(1, '1');  
insert into class_tag(class_no, tag_no) 
  values(2, '2');  
insert into class_tag(class_no, tag_no) 
  values(3, '3');  
insert into class_tag(class_no, tag_no) 
  values(4, '4');  
insert into class_tag(class_no, tag_no) 
  values(5, '5');  
  
  
-- 과제 22~
insert into assignment(class_no, member_no, title, file, deadline, standard, create_date) 
  values('1', '1', '근의공식', 'a.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(class_no, member_no, title, content, file, deadline, standard, create_date) 
  values('2', '2', '네모', '네모에 대해 알아오라', 'b.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(class_no, member_no, title, content, deadline, standard, create_date) 
  values('3', '3', '구름', '구름에 대해 알아오라', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(class_no, member_no, title, content, file, deadline, standard, create_date) 
  values('4', '4', '인간', '인간에 대해 알아오라', 'd.gif', '2020-04-21', '유래,기원', '2020-03-26');
insert into assignment(class_no, member_no, title, content, file, deadline, create_date) 
  values('5', '5', '이순신', '이순신에 대해 알아오라', 'e.gif', '2020-04-21', '2020-03-26');
  
-- 과제제출 
insert into assignment_submmit(member_no, assignment_no, score, content, feedback, create_date) 
  values(4, '1', '100', '만점', '잘했습니다.', '2020-04-23' );  
insert into assignment_submmit(member_no, assignment_no, file, content, feedback, create_date) 
  values(3, '2', 'b.gif', '2등', '괜찮아요.', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, create_date) 
  values(1, '3', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, file, score, content, create_date) 
  values(2, '4', 'd.gif', '40', '4등', '2020-04-23' ); 
insert into assignment_submmit(member_no, assignment_no, file, score, feedback, create_date) 
  values(5, '5', 'e.gif', '20', '낼봅시다.', '2020-04-23' ); 
  
-- 과제 태그 
insert into assignment_tag(assignment_no, tag_no) 
  values(1, '1');    
insert into assignment_tag(assignment_no, tag_no) 
  values(2, '2');    
insert into assignment_tag(assignment_no, tag_no) 
  values(3, '3');    
insert into assignment_tag(assignment_no, tag_no) 
  values(4, '4');    
insert into assignment_tag(assignment_no, tag_no) 
  values(5, '5');    
  
-- 답변
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(1, '1', '잘모르겠습니다.', '1', '2020-4-21');    
insert into answer(member_no, question_no, multiple_no, create_date) 
  values(2, '2', '2', '2020-4-21');   
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(3, '3', '제출함.', '3', '2020-4-21');   
insert into answer(member_no, question_no, content, multiple_no, create_date) 
  values(4, '4', '몰겠어여.', '4', '2020-4-21');   
insert into answer(member_no, question_no, content, create_date) 
  values(5, '5', '어려워요.', '2020-4-21');   
  
-- 게시글 예제 데이터 ~100000 xxxx
insert into post(board_no, member_no, title, content, create_date) 
  values('1', '1', '휴강안내합니다', '30일휴강', '2020-4-20');
insert into post(board_no, member_no, title, content, create_date) 
  values('2', '2', '중간고사', '다음주', '2020-4-20');
insert into post(board_no, member_no, title, content, create_date) 
  values('3', '3', '기말고사', '다음달', '2020-4-20');
insert into post(board_no, member_no, title, create_date) 
  values('4', '4', '숙제', '2020-4-20');
insert into post(board_no, member_no, title, content, create_date) 
  values('5', '5', '과제', '3번문제', '2020-4-20');
  
  
-- 게시글 태그
insert into board_tag(post_no, tag_no) 
  values(1, '5');  
insert into board_tag(post_no, tag_no) 
  values(2, '4');  
insert into board_tag(post_no, tag_no) 
  values(3, '3');  
insert into board_tag(post_no, tag_no) 
  values(4, '2');  
insert into board_tag(post_no, tag_no) 
  values(5, '1');  
  
  
  

  
  
  
  
  
  
  
