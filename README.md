# 송예진 202330117

## 4월 12일
static 멤버 사용
- 클래스 이름으로 접근 가능
- 객체의 멤버로 접근 가능
- non-static 멤버는 클래스 이름으로 접근 안 됨
전역 변수와 전역 함수를 만들 때 사용
공유 멤버를 만들 때 사용 
static 메소드의 제약 조건
- static 메소드는 오직 static 멤버만 접근 가능
- static 메소드는 this 사용불가
<h1> static메소드는 객체상관없이 사용가능)

## 4월 5일
2차원 배열  
자바 상속
- 상위 클래스의 멤버를 하위 클래스가 물려받음
- 상위 클래스: 수퍼 클래스  

소프트웨어의 생산성 향상
- 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기 단축
- 객체 지향 언어 

실세계에 대한 쉬운 모델링
- 초기 프로그래밍
- 현대 프로그래밍
- 객체 지향 언어

절차 지향 프로그래밍
- 작업 순서를 표현하는 컴퓨터 명령 집합
- 함수들의 집합으로 프로그램 작성

객체 지향 프로그래밍
- 컴퓨터가 수행하는 작업을 객체들간의 상호작용으로 표현
- 클래스 혹은 객체들의 집합으로 프로그램 작성

생성자의 특징
- 생성자 이름은 클래스 이름과 동일
- 생성자는 여러 개 작성 가능(생성자 중복)
- 생성자는 객체 생성시 한 번만 호출

객체 소멸
- new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위
- 소멸된 객체 공간은 가용 메모리에 포함

자바에서 사용자 임의로 객체 소멸안됨
- 자바는 객체 소멸 연산자 없음
- 객체 소멸은 자바 가상 기계의 고유한 역할
- 자바 개발자에게는 매우 다행스러운 기능

가비지
- 가리키는 레퍼런스가 하나도 없는 객체
가비지 컬렉션
- 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

클래스 접근지정



## 3월 29일 강의
- Scanner를 이용한 키 입력  
- 개발자가 원하는 타입 값으로 쉽게 읽을 수 있음  
- 산술연산자(+, -, *, /, %)  
- 조건 연산(3 개의 피연산자로 구성된 삼항(ternary)연산자)  

- 학습목표
1. 반복문
2. continue문과 break문 활용
3. 자바의 배열 선언 및 활용
4. 배열을 리턴하는 메소드 작성
5. 예외 개념과 자바에서의 예외 처리

## 3월 22일 강의 자바의 플랫폼 독립성
WORA(Write Once Run AnuWhere)  
-한번 작성된 코드는 모든 플랫폼에서 바로 실행  
-c/c++ 등 기존 언어가 가진 플랫폼 종속성 극복  
-네트워크에 연결된 어느 클라이언트에서나 실행  
  
WORA를 가능하게 하는 자바의 특징  
-바이트코드(바이너리 코드)  
-JVM(자바 가상 기계)  

JDK와 JRE  
-JDK 자바 응용 개발 환경, 개발에 필요한 도구 포함  
-JRE 자바 실행 환경, 개발자가 아닌 경우 JRE만 따로 다운 가능  
-JDk의 bin 디렉터리에 포함된 주요 개발 도구 javac java jmod jdb javap jlink javadoc jar  

자바 응용의 종류: 서블릿 응용프로그램  
서블릿(servlet)  
-웹 서버에서 실행되는 자바 프로그램  
-데이터베이스 서버 및 기타 서버와 연동하는 복잡한 기능 구현 시 사용  
-사용자 인터페이스가 필요 없는 응용  
-웹 서버에 의해 실행 통제 받음  
안드로이드  
-구글의주도로 여러 모바일 회사가 모여 구성한 OHA에서 만든 무료 모바일 플랫폼  
-개발언어는 자바를 사용하나 jvm에 해당하는 Dalvik은 기존 바이트 코드와 호환성이 없어 변환 필요  

자바의 특성
1. 플랫폼 독립성  
-하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성  
2. 객체지향  
-캡슐화, 상송, 다형성 지원
3. 클래스로 캡슐화  
-자바의 모든 변수나 함수는 클래스 내에 선언  
-클래스 안에서 클래스(내부 클래스) 작성 가능  
4. 소스(.java)와 클래스(.class) 파일  
-클래스 파일에는 하나의 클래스만 존재  
-하나의 소스 파일에 여러 클래스를 작성 가능  
-소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함  

자바의 특징(2)
1. 실행 코드 배포
2. 패키지
3. 멀티스레드
4. 가비지 컬렉션

자바의 특징(3)
1. 실시간 응용프로그램에 부적합
2. 자바 프로그램은 안전
3. 프로그램 작성 쉬움
4. 실행 속도 개선을 위한 JIT 컴파일러 사용

문자열은 기본 타입이 아님(String 클래스로 문자열 표현)  
상수는 전부 대문자로  
var 키워드  
-java10부터 도입  
-기존의 변수 선언 방식: 변수의 타입 반드시 지정  
-타입을 생략하고 변수 선언 가능  
-컴파일러가 추론하여 변수 타입 결정  

## 3월 15일 강의
내용정리

# java2-1
개요는 리드미에 나온다