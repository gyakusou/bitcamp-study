/* union 과 union all */

/* select 결과 합치기 
   union : 중복 값 자동 제거*/
select distinct bank from stnt
union 
select distinct bank from tcher;

/* select distinct ~ from ~ 중복값 한개만 추출 식 */

-- 학생과강사들이 거래하는 은행 목록을 알고 싶을때
-- 학생 비트 캠프 우리 국민 / 선생 신한 농협 기업 우리 국민
-- 둘의 은행 목록을 뽑되 중복값은 제거하고 출력한다.
-- 즉 비트 캠프 우리 국민 신한 농협 기업

/* union all: 중복 값 제거 안함*/
select distinct bank from stnt
union all
select distinct bank from tcher;

-- 학생과강사들이 거래하는 은행 목록을 알고 싶을때
-- 학생 비트 캠프 우리 국민 / 선생 신한 농협 기업 우리 국민
-- 둘의 은행 목록을 뽑고 중복값 모두 포함해 출력한다.
-- 즉 비트 캠프 우리 국민 신한 농협 기업 (우리) (국민)






